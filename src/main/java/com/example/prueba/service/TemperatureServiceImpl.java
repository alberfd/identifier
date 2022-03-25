package com.example.prueba.service;

import com.example.prueba.dto.TemperatureReadingsDTO;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService{

    public int getMaxIncrement(final TemperatureReadingsDTO temperatureReadings) {

        final int[] readings = temperatureReadings.getReadings();
        if(readings.length <= 1){
            return 0;
        }

        int baseMeasure = readings[0];
        int maxIncrement = 0;
        for(int i = 1; i<readings.length; i++){
            if(readings[i] - baseMeasure > maxIncrement ){
                maxIncrement = readings[i] - baseMeasure;
            }

            if (readings[i] < baseMeasure){
                baseMeasure = readings[i];
            }
        }

        return maxIncrement;
    }
}
