package com.weng.weatherforecast.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class LocationNotSpecifiedException extends RuntimeException{

    public LocationNotSpecifiedException(String message){
        super(message);
    }
}
