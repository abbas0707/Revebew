package com.revenew.rest.model.person.response;

import com.revenew.rest.model.person.PersonResponseData;
import lombok.Data;

import java.util.List;

/**
 * List Person By Id Response payload.
 */
@Data
public class ListPersonByIdResponse {

    PersonResponseData person;
}
