package com.revenew.rest.model.vehicle;

import com.revenew.error.ErrorResponse;
import com.revenew.rest.model.ServiceResponse;
import lombok.Data;

import java.io.Serializable;

/**
 * Base payload class for Vehicle Response data.
 */
@Data
public class VehicleResponseData  extends ErrorResponse implements ServiceResponse {
    private String registrationNumber;
    private String modalYear;
    private String brandName;
    private String vehicleName;
    private String color;
    private String weight;
    private String personId;
}
