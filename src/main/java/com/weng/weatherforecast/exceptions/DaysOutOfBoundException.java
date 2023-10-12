package com.weng.weatherforecast.exceptions;

public class DaysOutOfBoundException extends RuntimeException{

    public DaysOutOfBoundException(String message){
        super(message);
    }
}
