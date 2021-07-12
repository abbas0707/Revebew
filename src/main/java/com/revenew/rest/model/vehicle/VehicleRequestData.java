package com.revenew.rest.model.vehicle;

import com.revenew.constant.RevenewConstant;
import com.revenew.rest.model.ServiceRequest;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Base Payload for Vehicle.
 */
@Data
public class VehicleRequestData implements ServiceRequest {
    @NotEmpty(message = RevenewConstant.VALIDATION_MESSAGE_MANDATORY)
    private String registrationNumber;
    private String modalYear;
    private String brandName;
    private String vehicleName;
    private String color;
    private String weight;
    private String personId;
}
