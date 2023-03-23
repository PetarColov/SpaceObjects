package com.example.spaceobjects.controller;


import com.example.spaceobjects.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/statistics/all")
    public List<Object> getAllSpaceObjects(){
        return statisticsService.getAll();
    }
}
