package com.example.spaceobjects.controller;

import com.example.spaceobjects.entity.dto.AddGalaxyDTO;
import com.example.spaceobjects.entity.dto.AddMoonDto;
import com.example.spaceobjects.entity.pojo.Galaxy;
import com.example.spaceobjects.entity.pojo.Moon;
import com.example.spaceobjects.service.MoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoonController {

    @Autowired
    private MoonService moonService;

    @PostMapping("/moon/add")
    public Moon addMoon(@RequestBody AddMoonDto addMoonDto){
        return moonService.addMoon(addMoonDto);
    }
}
