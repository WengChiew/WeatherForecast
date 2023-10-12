package com.weng.weatherforecast.Service;

import com.weng.weatherforecast.exceptions.LocationNotInListException;
import com.weng.weatherforecast.model.Coordinates;
import org.springframework.stereotype.Service;

@Service
public class WeatherForecastService {

    public Coordinates getCoordinates(String location){
        switch(location){
            case "Amsterdam":
                return new Coordinates(52.370216, 4.895168);
            case "London":
                return new Coordinates(51.507351, -0.127758);
            case "New York":
                return new Coordinates(40.712776, -74.005974);
            case "Buenos Aires":
                return new Coordinates(34.603683, -58.381557);
            case "Sydney":
                return new Coordinates(-33.868820, 151.209290);
            case "Hong Kong":
                return new Coordinates(22.302711,114.177216);
            default:
                throw  new LocationNotInListException("This Location is not in the list");
        }
    }
}
