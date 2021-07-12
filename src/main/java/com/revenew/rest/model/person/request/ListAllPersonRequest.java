package com.revenew.rest.model.person.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.ServiceRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * Payload for ListAllPerson.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListAllPersonRequest implements ServiceRequest {
}
