package com.weng.weatherforecast.exceptions;

public class LocationNotInListException extends RuntimeException{

    public LocationNotInListException(String message){
        super(message);
    }
}
