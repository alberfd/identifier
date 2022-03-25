package com.example.prueba.controller;

import com.example.prueba.dto.TemperatureReadingsDTO;
import com.example.prueba.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="stats")
public class TemperatureController {

    @Autowired
    private TemperatureService temperatureService;

    @PostMapping(value = "compute")
    public int compute(@RequestBody TemperatureReadingsDTO temperatureReadings){
        return temperatureService.getMaxIncrement(temperatureReadings);
    }
}
