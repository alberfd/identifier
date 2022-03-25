package com.example.prueba.service;

import com.example.prueba.dto.TemperatureReadingsDTO;

public interface TemperatureService {

    int getMaxIncrement(final TemperatureReadingsDTO temperatureReadings);

}
