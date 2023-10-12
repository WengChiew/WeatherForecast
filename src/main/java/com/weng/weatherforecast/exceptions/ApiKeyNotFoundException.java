package com.weng.weatherforecast.exceptions;

public class ApiKeyNotFoundException extends RuntimeException {
    public ApiKeyNotFoundException(String message){
        super(message);
    }
}
