package com.example.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
public class WeatherResponse {
    private String name;
    private Main main;
    private List<Weather> weather;

    @Data // Lombok for inner class
    public static class Main {
        @JsonProperty("temp")
        private double temperature;

        @JsonProperty("feels_like")
        private double feelsLike;

        @JsonProperty("temp_min")
        private double tempMin;

        @JsonProperty("temp_max")
        private double tempMax;

        @JsonProperty("humidity")
        private int humidity;
    }

    @Data // Lombok for inner class
    public static class Weather {
        private String description;
    }
}
