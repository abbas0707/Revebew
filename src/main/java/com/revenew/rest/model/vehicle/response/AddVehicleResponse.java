package com.revenew.rest.model.vehicle.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.vehicle.VehicleResponseData;
import lombok.Data;

/**
 * Add Vehicle Response payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddVehicleResponse extends VehicleResponseData {
}
