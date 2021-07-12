package com.revenew.rest.model.person.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.ServiceResponse;
import com.revenew.rest.model.person.PersonResponseData;
import lombok.Data;

import java.util.List;

/**
 * List All Person Response payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListAllPersonResponse extends PersonResponseData {

    List<PersonResponseData> persons;
}
