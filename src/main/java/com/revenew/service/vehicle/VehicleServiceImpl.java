package com.revenew.service.vehicle;

import com.revenew.dao.vehicle.VehicleDao;
import com.revenew.dao.vehicle.jpa.VehicleEntityImpl;
import com.revenew.exception.ServiceException;
import com.revenew.mapper.VehicleMapper;
import com.revenew.rest.model.vehicle.VehicleResponseData;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.request.ListAllVehicleRequest;
import com.revenew.rest.model.vehicle.request.ListVehicleByIdRequest;
import com.revenew.rest.model.vehicle.request.UpdateVehicleRequest;
import com.revenew.rest.model.vehicle.response.AddVehicleResponse;
import com.revenew.rest.model.vehicle.response.ListAllVehicleResponse;
import com.revenew.rest.model.vehicle.response.ListVehicleByIdResponse;
import com.revenew.rest.model.vehicle.response.UpdateVehicleResponse;
import com.revenew.validator.AddVehicleValidator;
import com.revenew.validator.UpdateVehicleValidator;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * VehicleService implementation.
 */
@Slf4j
@Service
public class VehicleServiceImpl implements VehicleService {
    private static final VehicleMapper MAPPER = Mappers.getMapper(VehicleMapper.class);
    private final VehicleDao vehicleDao;

    public VehicleServiceImpl(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    @Override
    public void  add(AddVehicleRequest addVehicleRequest) throws ServiceException {
        this.vehicleDao.add(MAPPER.mapToVehicleEntity(addVehicleRequest));
    }

    @Override
    public void update(UpdateVehicleRequest updateVehicleRequest) throws ServiceException{
        this.vehicleDao.update(MAPPER.mapToVehicleEntity(updateVehicleRequest));
    }

    @Override
    public List<VehicleResponseData> listAll()throws ServiceException {
       return  MAPPER.mapList(this.vehicleDao.listAll());
    }

    @Override
    public ListVehicleByIdResponse listByRegNumber(String vehicleRegNumber) throws ServiceException {
        Optional<VehicleEntityImpl> vehicleEntity = this.vehicleDao.listById(vehicleRegNumber);
        return vehicleEntity.isPresent()?MAPPER.mapToVehicleById(vehicleEntity.get()):null;
    }


}
