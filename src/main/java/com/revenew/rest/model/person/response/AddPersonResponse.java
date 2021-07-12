package com.revenew.rest.model.person.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.person.PersonResponseData;
import lombok.Data;

/**
 * Add Person response payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddPersonResponse extends PersonResponseData {

}
