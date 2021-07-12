package com.revenew.rest.model.person;

import com.revenew.error.ErrorResponse;
import com.revenew.rest.model.ServiceResponse;
import lombok.Data;

import java.io.Serializable;

/**
 * Base person response class.
 */
@Data
public class PersonResponseData  extends ErrorResponse implements ServiceResponse {
    private String firstName;
    private String lastName;
    private String id;
    private String address;
    private String mobileNumber;
    private String drivingLicenseNumber;
}
