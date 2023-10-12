package com.weng.weatherforecast.controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class WeatherForecastDTO {

    private int maxTemp, minTemp;
    private LocalDate date;

    public WeatherForecastDTO(){

    }
}
