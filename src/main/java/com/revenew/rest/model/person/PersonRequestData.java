package com.revenew.rest.model.person;

import com.revenew.error.ErrorResponse;
import com.revenew.rest.model.ServiceRequest;
import lombok.Data;
import static com.revenew.constant.RevenewConstant.VALIDATION_MESSAGE_MANDATORY;
import javax.validation.constraints.NotNull;

/**
 * Base person request class.
 */
@Data
public class PersonRequestData implements ServiceRequest {
    @NotNull(message = VALIDATION_MESSAGE_MANDATORY)
    private String firstName;
    private String lastName;
    private String id;
    private String address;
    private String mobileNumber;
    @NotNull(message = VALIDATION_MESSAGE_MANDATORY)
    private String drivingLicenseNumber;
}
