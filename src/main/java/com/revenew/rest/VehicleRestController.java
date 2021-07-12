package com.revenew.rest;

import com.revenew.requesthandler.ServiceHandler;
import com.revenew.requesthandler.vehicle.AddVehicleService;
import com.revenew.requesthandler.vehicle.ListAllVehicleService;
import com.revenew.requesthandler.vehicle.UpdateVehicleService;
import com.revenew.rest.model.vehicle.request.AddVehicleRequest;
import com.revenew.rest.model.vehicle.request.ListAllVehicleRequest;
import com.revenew.rest.model.vehicle.request.UpdateVehicleRequest;
import com.revenew.rest.model.vehicle.response.AddVehicleResponse;
import com.revenew.rest.model.vehicle.response.ListAllVehicleResponse;
import com.revenew.rest.model.vehicle.response.UpdateVehicleResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.revenew.constant.RevenewConstant.APPLICATION_JSON_CHARSET_UTF_8;

@RestController
@RequestMapping("/vehicle/")
@Slf4j
public class VehicleRestController {
private final ServiceHandler<AddVehicleRequest,AddVehicleResponse> addVehicleService;
private final ServiceHandler<ListAllVehicleRequest,ListAllVehicleResponse> listAllVehicleService;
private final ServiceHandler<UpdateVehicleRequest,UpdateVehicleResponse> updateVehicleService;


    public VehicleRestController(ServiceHandler<AddVehicleRequest,AddVehicleResponse> addVehicleService, ServiceHandler<ListAllVehicleRequest,ListAllVehicleResponse>  listAllVehicleService, ServiceHandler<UpdateVehicleRequest,UpdateVehicleResponse> updateVehicleService) {
        this.addVehicleService = addVehicleService;
        this.listAllVehicleService = listAllVehicleService;
        this.updateVehicleService = updateVehicleService;
    }

    @ApiOperation(value = "Add Vehicle Request")
    @PostMapping(value = "add", consumes = {APPLICATION_JSON_CHARSET_UTF_8},
            produces = {APPLICATION_JSON_CHARSET_UTF_8})
    @ResponseBody
    public AddVehicleResponse createVehicle(@RequestBody  @Valid AddVehicleRequest addVehicleRequest){
            return this.addVehicleService.execute(addVehicleRequest);
    }

    @ApiOperation(value = "Update Vehicle Request")
    @PostMapping(value = "update", consumes = {APPLICATION_JSON_CHARSET_UTF_8},
            produces = {APPLICATION_JSON_CHARSET_UTF_8})
    @ResponseBody
    public UpdateVehicleResponse updateVehicle(@RequestBody  @Valid UpdateVehicleRequest updateVehicleRequest){
        return this.updateVehicleService.execute(updateVehicleRequest);
    }

    @ApiOperation(value = "List All Vehicle Request")
    @PostMapping(value = "list/all", consumes = {APPLICATION_JSON_CHARSET_UTF_8},
            produces = {APPLICATION_JSON_CHARSET_UTF_8})
    @ResponseBody
    public ListAllVehicleResponse listAllVehicles(@RequestBody ListAllVehicleRequest listAllVehicleRequest){
        return this.listAllVehicleService.execute(listAllVehicleRequest);
    }
}
