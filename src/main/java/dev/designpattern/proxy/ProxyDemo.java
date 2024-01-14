package dev.designpattern.proxy;

import java.time.LocalDateTime;

public class ProxyDemo {
   public static void main(String[] args) {
        WeatherApi weatherApi = new WeatherApiProxy();
        System.out.println(weatherApi.getWeatherDetailsForDay(LocalDateTime.now(), "IN"));
        weatherApi.getWeatherDetailsForWeek(LocalDateTime.now().getDayOfYear()/52, "AB");
    }
} 

