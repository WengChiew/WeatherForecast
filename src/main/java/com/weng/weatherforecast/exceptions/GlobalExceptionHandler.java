package com.weng.weatherforecast.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UnsupportedOperationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> EndPointNotImplemented(UnsupportedOperationException e){
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(LocationNotSpecifiedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> LocationNotSpecified(LocationNotSpecifiedException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

    }


    @ExceptionHandler(LongitudeOutOfBoundsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> LongitudeOutOfBoundsException(LongitudeOutOfBoundsException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(LatitudeOutOfBoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> LatitudeOutOfBoundsException(LatitudeOutOfBoundException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(LocationNotInListException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> LocationNotInTheListException(LocationNotInListException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ApiKeyNotFoundException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseEntity<String> ApiKeyNotFoundException(ApiKeyNotFoundException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(WrongApiKeyException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<String> WrongApiKeyException(WrongApiKeyException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
    }

}
