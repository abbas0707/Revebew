package com.revenew.service.vehicle;

import com.revenew.exception.ServiceException;
import com.revenew.rest.model.vehicle.VehicleResponseData;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.request.ListAllVehicleRequest;
import com.revenew.rest.model.vehicle.request.ListVehicleByIdRequest;
import com.revenew.rest.model.vehicle.request.UpdateVehicleRequest;
import com.revenew.rest.model.vehicle.response.AddVehicleResponse;
import com.revenew.rest.model.vehicle.response.ListAllVehicleResponse;
import com.revenew.rest.model.vehicle.response.ListVehicleByIdResponse;
import com.revenew.rest.model.vehicle.response.UpdateVehicleResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer class for Vehicle.
 */
@Service
public interface VehicleService {
    /**
     * Add vehicle.
     *
     */
    void add(AddVehicleRequest addVehicleRequest) throws ServiceException;

    /**
     * Update Vehicle.
     * @param updateVehicleRequest
     */
    void update(UpdateVehicleRequest updateVehicleRequest)throws ServiceException;

    /**
     * List All vehicles.
     * @return
     */
    List<VehicleResponseData> listAll()throws ServiceException;

    /**
     * List Vehicles by registration number.
     * @param vehicleRegNumber
     * @return
     */
    ListVehicleByIdResponse listByRegNumber(String vehicleRegNumber)throws ServiceException;
}
