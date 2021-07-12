package com.revenew.rest;

import com.revenew.requesthandler.ServiceHandler;
import com.revenew.requesthandler.person.AddPersonService;
import com.revenew.requesthandler.person.ListAllPersonService;
import com.revenew.rest.model.person.request.AddPersonRequest;
import com.revenew.rest.model.person.request.ListAllPersonRequest;
import com.revenew.rest.model.person.response.AddPersonResponse;
import com.revenew.rest.model.person.response.ListAllPersonResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.revenew.constant.RevenewConstant.APPLICATION_JSON_CHARSET_UTF_8;

@RestController
@RequestMapping("/person/")
@Slf4j
public class PersonRestController {
    private final ServiceHandler<AddPersonRequest,AddPersonResponse> addPersonService;
    private final ServiceHandler<ListAllPersonRequest,ListAllPersonResponse> listAllPersonService;

    public PersonRestController(ServiceHandler<AddPersonRequest,AddPersonResponse> addPersonService,  ServiceHandler<ListAllPersonRequest,ListAllPersonResponse>  listAllPersonService) {
        this.addPersonService = addPersonService;
        this.listAllPersonService = listAllPersonService;
    }

    @ApiOperation(value = "Add Person Request")
    @PostMapping(value = "add", consumes = {APPLICATION_JSON_CHARSET_UTF_8},
            produces = {APPLICATION_JSON_CHARSET_UTF_8})
    @ResponseBody
    public AddPersonResponse createPerson(@RequestBody  @Valid AddPersonRequest addPersonRequest){
        return this.addPersonService.execute(addPersonRequest);
    }

    @ApiOperation(value = "Add Person Request")
    @PostMapping(value = "list/all", consumes = {APPLICATION_JSON_CHARSET_UTF_8},
            produces = {APPLICATION_JSON_CHARSET_UTF_8})
    @ResponseBody
    public ListAllPersonResponse listAllPerson(@RequestBody  ListAllPersonRequest listAllPersonRequest){
        return this.listAllPersonService.execute(listAllPersonRequest);
    }
}
