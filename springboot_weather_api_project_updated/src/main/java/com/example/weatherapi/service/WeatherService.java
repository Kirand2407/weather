
package com.example.weatherapi.service;

import com.example.weatherapi.model.ForecastResponse;
import com.example.weatherapi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {

    @Value("${openweather.api.key}")
    private String apiKey;

    @Value("${openweather.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getCurrentWeather(double lat, double lon) {
        String url = String.format("%s/weather?lat=%s&lon=%s&appid=%s&units=metric", baseUrl, lat, lon, apiKey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

    public ForecastResponse getHourlyForecast(double lat, double lon) {
        String url = String.format("%s/forecast?lat=%s&lon=%s&appid=%s&units=metric", baseUrl, lat, lon, apiKey);
        return restTemplate.getForObject(url, ForecastResponse.class);
    }
}
        