package com.revenew.requesthandler.person;

import com.revenew.exception.ServiceException;
import com.revenew.requesthandler.ServiceHandler;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.response.AddPersonResponse;
import com.revenew.service.person.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.sql.rowset.serial.SerialException;
import java.util.UUID;
@Slf4j
@Component
public class AddPersonService implements ServiceHandler<AddPersonRequest , AddPersonResponse> {

    private final PersonService personService;

    public AddPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public AddPersonResponse getServiceResponse() {
        return new AddPersonResponse();
    }



    @Override
    public void process(AddPersonRequest request, AddPersonResponse response) throws ServiceException {
        log.info("Adding Person request ");
        request.setId(UUID.randomUUID().toString());
        this.personService.add(request);
        response.setId(request.getId());

    }
}
