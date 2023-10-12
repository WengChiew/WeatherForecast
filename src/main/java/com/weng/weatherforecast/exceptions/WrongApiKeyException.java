package com.weng.weatherforecast.exceptions;

public class WrongApiKeyException extends RuntimeException{

    public WrongApiKeyException(String message){
        super(message);
    }
}
