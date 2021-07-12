package com.revenew.dao.person.jpa;

import com.revenew.dao.person.PersonDao;
import com.revenew.exception.ServiceException;
import com.revenew.repository.PersonRepository;
import com.revenew.rest.model.person.request.AddPersonRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class PersonDaoImpl implements PersonDao {

    private final PersonRepository personRepository;

    public PersonDaoImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void add(PersonEntityImpl personEntity) throws ServiceException {
        this.personRepository.saveAndFlush(personEntity);
    }

    @Override
    public List<PersonEntityImpl> listAll() throws ServiceException {
       return this.personRepository.findAll();
    }

    @Override
    public Optional<PersonEntityImpl> listById(String id) throws ServiceException {
        return this.personRepository.findById(id);
    }
}
