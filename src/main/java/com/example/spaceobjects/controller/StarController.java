package com.example.spaceobjects.controller;

import com.example.spaceobjects.entity.dto.AddGalaxyDTO;
import com.example.spaceobjects.entity.dto.AddStarDTO;
import com.example.spaceobjects.entity.pojo.Galaxy;
import com.example.spaceobjects.entity.pojo.Star;
import com.example.spaceobjects.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarController {

    @Autowired
    private StarService starService;

    @PostMapping("/star/add")
    public Star addStar(@RequestBody AddStarDTO addStarDTO){
        return starService.addStar(addStarDTO);
    }
}
