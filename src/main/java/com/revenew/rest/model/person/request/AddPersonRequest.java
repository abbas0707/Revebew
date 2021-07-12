package com.revenew.rest.model.person.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.person.PersonRequestData;
import lombok.Data;

/**
 *  Add Person request payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddPersonRequest extends PersonRequestData {

}
