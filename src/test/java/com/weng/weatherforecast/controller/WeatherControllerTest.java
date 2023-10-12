package com.weng.weatherforecast.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
//@WebMvcTest(controllers = WeatherControllerTest.class)
public class WeatherControllerTest {

    @Autowired
    private MockMvc weatherController;


    @Test
    @DisplayName("Return the correct weatherforecast when making a get request to the endpoint - /forecast")
    public void shouldReturnGet() throws Exception{
        weatherController.perform(get("/forecast")
                            .header("apikey", "mY+0p$EcrE+")
                            .queryParam("location", "Amsterdam")
                            .queryParam("days", "1"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.size()", Matchers.greaterThan(0)))
                .andExpect(jsonPath("$[0].date", Matchers.notNullValue()))
                .andExpect(jsonPath("$[0].minTemp", Matchers.notNullValue()))
                .andExpect(jsonPath("$[0].maxTemp", Matchers.notNullValue()));
    }
}
