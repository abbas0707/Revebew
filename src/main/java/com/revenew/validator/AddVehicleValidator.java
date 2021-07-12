package com.revenew.validator;

import com.revenew.error.ServiceError;
import com.revenew.exception.ServiceException;
import com.revenew.rest.model.person.response.ListPersonByIdResponse;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.service.person.PersonService;
import com.revenew.service.vehicle.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Validator for Vehicle.
 */
@Component
@Slf4j
public class AddVehicleValidator implements ServiceValidator<AddVehicleRequest>  {

    private final PersonService personService;

    private final VehicleService vehicleService;

    public AddVehicleValidator(PersonService personService, VehicleService vehicleService) {
        this.personService = personService;
        this.vehicleService = vehicleService;
    }

    /**
     * Business validation to add vehicle.
     * @param addVehicleRequest
     */
    @Override
    public void validate(AddVehicleRequest addVehicleRequest) throws ServiceException {
        if(this.vehicleService.listByRegNumber(addVehicleRequest.getRegistrationNumber()) != null){
            log.error("This Vehicle with Registration Number: {} already exist", addVehicleRequest.getRegistrationNumber());
            throw new ServiceException(ServiceError.VEHICLE_EXISTS.getCode(),ServiceError.VEHICLE_EXISTS.getDescription(), "Add Vehicle");
        }
        if(StringUtils.hasLength(addVehicleRequest.getPersonId()) && !checkIfPersonExists(addVehicleRequest.getPersonId())){
            log.error("This person with Id: {} doesn't exist", addVehicleRequest.getPersonId());
            throw new ServiceException(ServiceError.INVALID_PERSON.getCode(),ServiceError.INVALID_PERSON.getDescription(),"Add Person");
        }

    }

    /**
     * Checking if person exists or not.
     * @param id
     * @return
     */
    private boolean checkIfPersonExists(String id) throws ServiceException {
        ListPersonByIdResponse listPersonByIdResponse=  this.personService.listById(id);
        return ObjectUtils.isEmpty(listPersonByIdResponse)?Boolean.FALSE:Boolean.TRUE;
    }





}
