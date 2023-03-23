package com.example.spaceobjects.service;

import com.example.spaceobjects.entity.dto.AddMoonDto;
import com.example.spaceobjects.entity.pojo.Moon;
import com.example.spaceobjects.entity.repository.MoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoonService {

    @Autowired
    private MoonRepository moonRepository;

    public Moon addMoon(AddMoonDto addMoonDto) {

        Moon moon = new Moon();

        moon.setName(addMoonDto.getName());

        moonRepository.save(moon);

        return moon;
    }
}
