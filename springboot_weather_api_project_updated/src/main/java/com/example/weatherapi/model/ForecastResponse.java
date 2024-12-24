
package com.example.weatherapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ForecastResponse {
    private List<Forecast> list;

    public static class Forecast {
        private WeatherResponse.Main main;
        private List<WeatherResponse.Weather> weather;
        private String dt_txt;

        // Getters and setters
    }
}
        