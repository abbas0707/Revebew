package com.revenew.requesthandler.vehicle;

import com.revenew.exception.ServiceException;
import com.revenew.requesthandler.ServiceHandler;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.request.UpdateVehicleRequest;
import com.revenew.rest.model.vehicle.response.AddVehicleResponse;
import com.revenew.rest.model.vehicle.response.UpdateVehicleResponse;
import com.revenew.service.vehicle.VehicleService;
import com.revenew.validator.AddVehicleValidator;
import com.revenew.validator.ServiceValidator;
import com.revenew.validator.UpdateVehicleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Add Vehicle Service.
 */
@Component
@Slf4j
public class UpdateVehicleService implements ServiceHandler<UpdateVehicleRequest, UpdateVehicleResponse> {
    private final UpdateVehicleValidator updateVehicleValidator;
    private final VehicleService vehicleService;

    public UpdateVehicleService(UpdateVehicleValidator updateVehicleValidator, VehicleService vehicleService) {
        this.updateVehicleValidator = updateVehicleValidator;
        this.vehicleService = vehicleService;
    }

    @Override
    public UpdateVehicleResponse getServiceResponse() {
        return new UpdateVehicleResponse();
    }
    @Override
    public ServiceValidator<UpdateVehicleRequest>  getServiceValidator(){
        return this.updateVehicleValidator;
    }

    @Override
    public void process(UpdateVehicleRequest request, UpdateVehicleResponse response) throws ServiceException {
        log.info("Update request for Vehicle");
        this.vehicleService.update(request);
    }
}
