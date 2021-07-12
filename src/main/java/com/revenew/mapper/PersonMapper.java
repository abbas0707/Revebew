package com.revenew.mapper;

import com.revenew.dao.person.jpa.PersonEntityImpl;
import com.revenew.rest.model.person.PersonResponseData;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.response.ListPersonByIdResponse;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;

/**
 * Mapper of PersonResponse and PersonEntityImpl.
 */
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PersonMapper {
    List<PersonResponseData> mapList(List<PersonEntityImpl> userInfoList);

    /**
     * Map to dao Object.
     * @param addPersonRequest
     * @return
     */
   PersonEntityImpl mapToPersonEntity(AddPersonRequest addPersonRequest);

    /**
     * Map to ListPersonByIdResponse
     * @param personEntity
     * @return
     */
   ListPersonByIdResponse mapToPersonseById(PersonEntityImpl personEntity);
}
