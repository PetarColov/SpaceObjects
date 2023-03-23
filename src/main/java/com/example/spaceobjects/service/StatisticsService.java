package com.example.spaceobjects.service;

import com.example.spaceobjects.entity.pojo.Galaxy;
import com.example.spaceobjects.entity.pojo.Moon;
import com.example.spaceobjects.entity.pojo.Planet;
import com.example.spaceobjects.entity.pojo.Star;
import com.example.spaceobjects.entity.repository.GalaxyRepository;
import com.example.spaceobjects.entity.repository.MoonRepository;
import com.example.spaceobjects.entity.repository.PlanetRepository;
import com.example.spaceobjects.entity.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticsService {

    @Autowired
    private GalaxyRepository galaxyRepository;
    @Autowired
    private StarRepository starRepository;
    @Autowired
    private PlanetRepository planetRepository;
    @Autowired
    private MoonRepository moonRepository;


    public List<Object> getAll() {
        List<Object> allSpaceObjects = new ArrayList<>();

        List<Galaxy> galaxyList = galaxyRepository.findAll();

        List<Star> starList = starRepository.findAll();

        List<Planet> planetList = planetRepository.findAll();

        List<Moon> moonList = moonRepository.findAll();

        allSpaceObjects.addAll(galaxyList);
        allSpaceObjects.addAll(starList);
        allSpaceObjects.addAll(planetList);
        allSpaceObjects.addAll(moonList);

        return allSpaceObjects;
    }
}
