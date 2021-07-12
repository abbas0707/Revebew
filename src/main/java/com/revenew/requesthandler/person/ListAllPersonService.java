package com.revenew.requesthandler.person;

import com.revenew.exception.ServiceException;
import com.revenew.requesthandler.ServiceHandler;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.request.ListAllPersonRequest;
import com.revenew.rest.model.person.response.AddPersonResponse;
import com.revenew.rest.model.person.response.ListAllPersonResponse;
import com.revenew.rest.model.vehicle.response.ListAllVehicleResponse;
import com.revenew.service.person.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ListAllPersonService implements ServiceHandler<ListAllPersonRequest, ListAllPersonResponse> {

    private final PersonService personService;

    public ListAllPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public ListAllPersonResponse getServiceResponse() {
        return new ListAllPersonResponse();
    }



    @Override
    public void process(ListAllPersonRequest request, ListAllPersonResponse response) throws ServiceException {
        log.info("ListAll Person request ");
        response.setPersons(this.personService.listAll());
    }
}
