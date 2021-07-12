package com.revenew.rest.model.vehicle.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.ServiceRequest;
import com.revenew.rest.model.vehicle.VehicleRequestData;
import lombok.Data;

import java.io.Serializable;

/**
 * List All Vehicle Request payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListAllVehicleRequest implements ServiceRequest {
}
