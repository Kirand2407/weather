
package com.example.weatherapi.Controller;

import com.example.weatherapi.model.ForecastResponse;
import com.example.weatherapi.model.WeatherResponse;
import com.example.weatherapi.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/current")
    public WeatherResponse getCurrentWeather(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.getCurrentWeather(lat, lon);
    }

    @GetMapping("/forecast")
    public List<ForecastResponse.Forecast> getHourlyForecast(@RequestParam double lat, @RequestParam double lon) {
        ForecastResponse response = weatherService.getHourlyForecast(lat, lon);
        return response.getList().stream().limit(4).toList();
    }
}
        