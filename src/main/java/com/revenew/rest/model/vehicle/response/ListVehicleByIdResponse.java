package com.revenew.rest.model.vehicle.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.vehicle.VehicleResponseData;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * List Vehicle By Registration number Response payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListVehicleByIdResponse implements Serializable {
    private VehicleResponseData vehicle;
}
