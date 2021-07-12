package com.revenew.validator;

import com.revenew.exception.ServiceException;
import com.revenew.rest.model.person.response.ListPersonByIdResponse;
import com.revenew.rest.model.vehicle.request.UpdateVehicleRequest;
import com.revenew.service.person.PersonService;
import com.revenew.service.vehicle.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Validator for Vehicle.
 */
@Component
@Slf4j
public class UpdateVehicleValidator implements ServiceValidator<UpdateVehicleRequest> {

    private final PersonService personService;


    private final VehicleService vehicleService;

    public UpdateVehicleValidator(PersonService personService, VehicleService vehicleService) {
        this.personService = personService;
        this.vehicleService = vehicleService;
    }

    /**
     * Business validation to add vehicle.
     * @param updateVehicleRequest
     */
    @Override
    public void validate(UpdateVehicleRequest updateVehicleRequest) throws ServiceException {
        if(this.vehicleService.listByRegNumber(updateVehicleRequest.getRegistrationNumber()) == null){
            log.error("This Vehicle with Registration Number: {} doesn't exist", updateVehicleRequest.getRegistrationNumber());
            throw new DataIntegrityViolationException("This Vehicle doesn't exist - registrationNumber= "+updateVehicleRequest.getRegistrationNumber());

        }
        if(StringUtils.hasLength(updateVehicleRequest.getPersonId()) && !checkIfPersonExists(updateVehicleRequest.getPersonId())){
            log.error("This person with Id: {} doesn't exist", updateVehicleRequest.getPersonId());
            throw new DataIntegrityViolationException("This person doesn't exist id= "+updateVehicleRequest.getPersonId());
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
