package com.revenew.validator;

import com.revenew.exception.ServiceException;
import com.revenew.rest.model.ServiceRequest;

/**
 * Service validator interface.
 * @param <R>
 */
public interface ServiceValidator<R extends ServiceRequest> {

    default void execute(R request) throws ServiceException {
        this.validate(request) ;
    }
    void validate(R request) throws ServiceException;
}
