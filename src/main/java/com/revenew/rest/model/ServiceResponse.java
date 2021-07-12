package com.revenew.rest.model;

import java.io.Serializable;

/**
 * Based model class for response.
 */
public interface ServiceResponse extends Serializable {

    String getErrorDescription();

    void setErrorDescription(String errorDescription);

    public String getErrorCode() ;

    public void setErrorCode(String errorCode) ;

    public String getComponent() ;

    public void setComponent(String component) ;
}
