package com.weng.weatherforecast.controller;

import com.weng.weatherforecast.DTO.WeatherForecastDTO;
import com.weng.weatherforecast.Service.WeatherForecastService;
import com.weng.weatherforecast.exceptions.*;
import com.weng.weatherforecast.model.Coordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherForecastService weatherForecastService;

    @GetMapping("/forecast")
    public ResponseEntity<List<WeatherForecastDTO>>weatherForecastDTOList(@RequestParam(required = false) String location, @RequestParam(required = false)  Double latitude, @RequestParam(required = false) Double longitude, @RequestParam int days, @RequestHeader(value = "apikey", required = false) String apikey){

        if(apikey ==null ){
            throw new ApiKeyNotFoundException("You are not authorized to access this app");
        }
        if(!apikey.equals("mY+0p$EcrE+")){
            throw new WrongApiKeyException("Wrong Api Key loser");
        }

        if(location==null){
            if(longitude==null || latitude==null) {
                throw new LocationNotSpecifiedException("No location data was given");
            } else{
                if (longitude >= -180 && longitude <= 180){
                    if(latitude >= -90 && latitude <= 90){









                    } else{
                        throw new LatitudeOutOfBoundException("Brother give some good latitude values pls");
                    }
                } else{
                    throw new LongitudeOutOfBoundsException("Brother give some good longitude values pls");
                }
            }
        } else if (longitude != null || latitude != null){
            throw new LocationNotSpecifiedException("Only give one Location data you poopoo");
        } else {
            Coordinates coordinates = weatherForecastService.getCoordinates(location);
        }

        if(days > 14 || days < 1){
            throw new DaysOutOfBoundException("Days should be between 1 and 14");
        }


        throw new UnsupportedOperationException(":(");

    }


}
