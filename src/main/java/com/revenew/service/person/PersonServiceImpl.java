package com.revenew.service.person;

import com.revenew.dao.person.PersonDao;
import com.revenew.dao.person.jpa.PersonEntityImpl;
import com.revenew.exception.ServiceException;
import com.revenew.mapper.PersonMapper;
import com.revenew.rest.model.person.PersonResponseData;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.request.ListPersonByIdRequest;
import com.revenew.rest.model.person.response.AddPersonResponse;
import com.revenew.rest.model.person.response.ListAllPersonResponse;
import com.revenew.rest.model.person.response.ListPersonByIdResponse;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Add Person Service
 */
@Component
@Slf4j
public class PersonServiceImpl implements PersonService {
private final PersonDao personDao;
    private static final PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void add(AddPersonRequest addPersonRequest) throws ServiceException {
        personDao.add(MAPPER.mapToPersonEntity(addPersonRequest));
    }

    @Override
    public List<PersonResponseData> listAll() throws ServiceException {
       return MAPPER.mapList(this.personDao.listAll());

    }

    @Override
    public ListPersonByIdResponse listById(String id) throws ServiceException{
        ListPersonByIdResponse listPersonByIdResponse;
        Optional<PersonEntityImpl> personEntity = this.personDao.listById(id);
        listPersonByIdResponse= personEntity.isPresent()?MAPPER.mapToPersonseById(personEntity.get()):null;
        return listPersonByIdResponse;
    }
}
