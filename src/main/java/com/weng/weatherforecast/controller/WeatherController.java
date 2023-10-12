package com.weng.weatherforecast.controller;

import com.weng.weatherforecast.DTO.WeatherForecastDTO;
import com.weng.weatherforecast.exceptions.LatitudeOutOfBoundException;
import com.weng.weatherforecast.exceptions.LocationNotSpecifiedException;
import com.weng.weatherforecast.exceptions.LongitudeOutOfBoundsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @GetMapping("/forecast")
    public ResponseEntity<List<WeatherForecastDTO>>weatherForecastDTOList(@RequestParam(required = false) String location, @RequestParam(required = false)  Double latitude, @RequestParam(required = false) Double longitude, @RequestParam int days, @RequestParam String apikey){
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

        }


        throw new UnsupportedOperationException(":(");

    }


}
