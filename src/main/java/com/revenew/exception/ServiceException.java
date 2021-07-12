package com.revenew.exception;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceException extends Exception implements Serializable {
    private String errorCode;
    private String errorDescription;
    private String component;

    public ServiceException( String errorCode,String errorDescription,String component){
        this.errorCode=errorCode;
        this.errorDescription=errorDescription;
        this.component=component;
    }
}
