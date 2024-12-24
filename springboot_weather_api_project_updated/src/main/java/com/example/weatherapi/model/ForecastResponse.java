
package com.example.weatherapi.model;

import java.util.List;

public class ForecastResponse {
    private List<Forecast> list;

    public List<Forecast> getList() {
        return list;
    }

    public void setList(List<Forecast> list) {
        this.list = list;
    }

    public static class Forecast {
        private WeatherResponse.Main main;
        private List<WeatherResponse.Weather> weather;
        private String dt_txt;

        // Getters and setters
    }
}
        