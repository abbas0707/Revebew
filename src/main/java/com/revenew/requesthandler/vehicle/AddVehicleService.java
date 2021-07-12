package com.revenew.requesthandler.vehicle;

import com.revenew.exception.ServiceException;
import com.revenew.requesthandler.ServiceHandler;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.response.AddVehicleResponse;
import com.revenew.service.vehicle.VehicleService;
import com.revenew.validator.AddVehicleValidator;
import com.revenew.validator.ServiceValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Add Vehicle Service.
 */
@Component
@Slf4j
public class AddVehicleService implements ServiceHandler<AddVehicleRequest, AddVehicleResponse> {
    private final AddVehicleValidator addVehicleValidator;
    private final VehicleService vehicleService;

    public AddVehicleService(AddVehicleValidator addVehicleValidator, VehicleService vehicleService) {
        this.addVehicleValidator = addVehicleValidator;
        this.vehicleService = vehicleService;
    }

    @Override
    public AddVehicleResponse getServiceResponse() {
        return new AddVehicleResponse();
    }
    @Override
    public ServiceValidator<AddVehicleRequest>  getServiceValidator(){
        return this.addVehicleValidator;
    }

    @Override
    public void process(AddVehicleRequest request, AddVehicleResponse response) throws ServiceException {

        log.info("Add request for Vehicle");
        this.vehicleService.add(request);

    }
}
