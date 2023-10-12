package com.weng.weatherforecast.exceptions;

public class LatitudeOutOfBoundException extends RuntimeException{

    public LatitudeOutOfBoundException(String message){
        super(message);
    }
}
