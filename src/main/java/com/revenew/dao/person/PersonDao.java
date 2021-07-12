package com.revenew.dao.person;

import com.revenew.dao.person.jpa.PersonEntityImpl;
import com.revenew.dao.vehicle.jpa.VehicleEntityImpl;
import com.revenew.exception.ServiceException;
import com.revenew.rest.model.person.request.AddPersonRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Dao for Person.
 */
@Service
public interface PersonDao {

    void add(PersonEntityImpl personEntity) throws ServiceException;

    /**
     * List all persons.
     * @return  List<PersonEntityImpl>.
     */
    List<PersonEntityImpl> listAll() throws ServiceException;

    /**
     * List Person By id.
     * @param id
     * @return
     */
    Optional<PersonEntityImpl> listById(String id)throws ServiceException;
}
