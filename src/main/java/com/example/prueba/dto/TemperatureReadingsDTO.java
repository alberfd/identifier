package com.example.prueba.dto;

public class TemperatureReadingsDTO {

    private int[] readings;

    public TemperatureReadingsDTO(){
    }

    public TemperatureReadingsDTO(int[] readings){
        this.setReadings(readings);
    }

    public int[] getReadings() {
        return readings;
    }

    public void setReadings(int[] readings) {
        this.readings = readings;
    }
}
