package com.weng.weatherforecast.controller;

import com.weng.weatherforecast.controller.DTO.WeatherForecastDTO;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {




    @GetMapping("/forecast")
    public ResponseEntity<List<WeatherForecastDTO>>weatherForecastDTOList(@RequestParam(required = false) String Location, @RequestParam(required = false)  Double latitude, @RequestParam(required = false) Double longitude, @RequestParam int days, @RequestParam String apikey){
        throw new UnsupportedOperationException(":(");

    }


}
