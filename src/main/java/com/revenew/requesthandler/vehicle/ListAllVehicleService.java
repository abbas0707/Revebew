package com.revenew.requesthandler.vehicle;

import com.revenew.exception.ServiceException;
import com.revenew.requesthandler.ServiceHandler;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.request.ListAllVehicleRequest;
import com.revenew.rest.model.vehicle.response.AddVehicleResponse;
import com.revenew.rest.model.vehicle.response.ListAllVehicleResponse;
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
public class ListAllVehicleService implements ServiceHandler<ListAllVehicleRequest, ListAllVehicleResponse> {
   ;
    private final VehicleService vehicleService;

    public ListAllVehicleService( VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Override
    public ListAllVehicleResponse getServiceResponse() {
        return new ListAllVehicleResponse();
    }

    @Override
    public void process(ListAllVehicleRequest request, ListAllVehicleResponse response) throws ServiceException {

        log.info("Add request for Vehicle");
        response.setVehicles(this.vehicleService.listAll());
    }
}
