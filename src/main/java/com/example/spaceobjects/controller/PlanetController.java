package com.example.spaceobjects.controller;

import com.example.spaceobjects.entity.dto.AddPlanetDto;
import com.example.spaceobjects.entity.pojo.Planet;
import com.example.spaceobjects.service.GalaxyService;
import com.example.spaceobjects.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @PostMapping("/planet/add")
    public Planet addPlanet(@RequestBody AddPlanetDto addPlanetDto){
        return planetService.addPlanet(addPlanetDto);
    }
}
