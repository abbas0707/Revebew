package com.revenew.rest.model.vehicle.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.revenew.rest.model.ServiceResponse;
import com.revenew.rest.model.vehicle.VehicleResponseData;
import com.revenew.service.vehicle.VehicleService;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * List All Vehicle Response payload.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListAllVehicleResponse extends VehicleResponseData {
    private List<VehicleResponseData> vehicles;
}
