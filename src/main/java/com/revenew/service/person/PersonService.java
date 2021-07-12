package com.revenew.service.person;

import com.revenew.exception.ServiceException;
import com.revenew.rest.model.person.PersonResponseData;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.request.ListPersonByIdRequest;
import com.revenew.rest.model.person.response.AddPersonResponse;
import com.revenew.rest.model.person.response.ListAllPersonResponse;
import com.revenew.rest.model.person.response.ListPersonByIdResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Add Person Service
 */
@Service
public interface PersonService {

    /**
     * Add Persons.
     * @param addPersonRequest
     *
     */
    void add(AddPersonRequest addPersonRequest)  throws ServiceException;

    /**
     * List all persons.
     * @return
     */
    List<PersonResponseData> listAll() throws ServiceException;

    /**
     * List Person By Id.
     * @param id
     * @return
     */
    ListPersonByIdResponse listById(String id) throws ServiceException;
}
