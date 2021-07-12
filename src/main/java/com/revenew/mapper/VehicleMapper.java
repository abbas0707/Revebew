package com.revenew.mapper;

import com.revenew.dao.person.jpa.PersonEntityImpl;
import com.revenew.dao.vehicle.jpa.VehicleEntityImpl;
import com.revenew.rest.model.person.PersonResponseData;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.response.ListPersonByIdResponse;
import com.revenew.rest.model.vehicle.VehicleResponseData;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.request.UpdateVehicleRequest;
import com.revenew.rest.model.vehicle.response.ListVehicleByIdResponse;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

/**
 * Mapper of PersonResponse and PersonEntityImpl.
 */
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface VehicleMapper {
    /**
     * map list of VehicleEntityImpl to list of VehicleResponseData.
     * @param userInfoList
     * @return
     */
    List<VehicleResponseData> mapList(List<VehicleEntityImpl> userInfoList);

    /**
     * Map to dao Object.
     * @param addVehicleRequest
     * @return
     */
    VehicleEntityImpl mapToVehicleEntity(AddVehicleRequest addVehicleRequest);

    /**
     * Map to dao Object.
     * @param updateVehicleRequest
     * @return
     */
    VehicleEntityImpl mapToVehicleEntity(UpdateVehicleRequest updateVehicleRequest);

    /**
     * Map to ListVehicleByIdResponse
     * @param vehicleEntity
     * @return
     */
    ListVehicleByIdResponse mapToVehicleById(VehicleEntityImpl vehicleEntity);

}
