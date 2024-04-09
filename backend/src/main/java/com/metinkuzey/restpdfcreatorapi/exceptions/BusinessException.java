package com.metinkuzey.restpdfcreatorapi.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String businessException){
        super(businessException);
    }
}
