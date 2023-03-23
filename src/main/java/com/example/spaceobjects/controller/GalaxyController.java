package com.example.spaceobjects.controller;


import com.example.spaceobjects.entity.dto.AddGalaxyDTO;
import com.example.spaceobjects.entity.pojo.Galaxy;
import com.example.spaceobjects.service.GalaxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GalaxyController {

    @Autowired
    private GalaxyService galaxyService;

    @PostMapping("/galaxy/add")
    public Galaxy addGalaxy(@RequestBody AddGalaxyDTO addGalaxyDTO){
        return galaxyService.addGalaxy(addGalaxyDTO);
    }
}
