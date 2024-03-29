package com.hashan.solid.d.solution;

import java.util.Arrays;

public class WeatherAggregator {
    private final WeatherSource[] weatherSources;

    public WeatherAggregator(WeatherSource[] weatherSources){
        this.weatherSources = weatherSources;
    }

    public double getTemperature(){
        return Arrays.stream(weatherSources)
                .mapToDouble(WeatherSource::getTemperatureToCelcius)
                .average()
                .getAsDouble();
    }
}
