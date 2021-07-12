package com.revenew.requesthandler;

import com.revenew.exception.ServiceException;
import com.revenew.rest.model.ServiceRequest;
import com.revenew.rest.model.ServiceResponse;
import com.revenew.validator.ServiceValidator;

/**
 * Service handler interface for all requests.
 */
public interface ServiceHandler<R extends ServiceRequest, S extends ServiceResponse> {

      default S execute(R request){

          S response = this.getServiceResponse();
          try {
          ServiceValidator<R> validator = this.getServiceValidator();
          if(validator != null){
              validator.execute(request);
          }

              this.process(request,response);
          } catch (ServiceException e) {
              e.printStackTrace();
              response.setErrorDescription(e.getErrorDescription());
              response.setErrorCode(e.getErrorCode());
              response.setComponent(e.getComponent());

          }
          return response;
    }

    S getServiceResponse();

    default ServiceValidator<R>  getServiceValidator(){
          return null;
    }
      void process(R request,S response) throws ServiceException;

}
