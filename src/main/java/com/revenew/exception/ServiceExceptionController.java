package com.revenew.exception;

import com.revenew.error.ErrorResponse;
import com.revenew.error.ServiceError;
import com.revenew.rest.model.ServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.engine.path.PathImpl;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@Slf4j
@ControllerAdvice
public class ServiceExceptionController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse onConstraintValidationException(final MethodArgumentNotValidException ex) {
        ErrorResponse response = new ErrorResponse();
        ex.getBindingResult().getFieldErrors().stream().filter(fieldError -> !ObjectUtils.isEmpty(fieldError.getDefaultMessage())).forEach(fieldError -> {
            response.setErrorCode(ServiceError.VALUE_REQUIRED.getCode());
            response.setErrorDescription(ServiceError.VALUE_REQUIRED.getDescription());
            response.setComponent(fieldError.getField());

        });

        return response;
    }

    private ServiceResponse getServiceResponse(){
        ServiceResponse response = new ServiceResponse(){
            @Override
            public String getErrorDescription() {
                return null;
            }

            @Override
            public void setErrorDescription(String errorDescription) {

            }

            @Override
            public String getErrorCode() {
                return null;
            }

            @Override
            public void setErrorCode(String errorCode) {

            }

            @Override
            public String getComponent() {
                return null;
            }

            @Override
            public void setComponent(String component) {

            }
        };
        return  response;
    }

}
