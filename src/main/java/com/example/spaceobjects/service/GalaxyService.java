package com.example.spaceobjects.service;

import com.example.spaceobjects.entity.dto.AddGalaxyDTO;
import com.example.spaceobjects.entity.enums.GalaxyType;
import com.example.spaceobjects.entity.pojo.Galaxy;
import com.example.spaceobjects.entity.repository.GalaxyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalaxyService {

    @Autowired
    private GalaxyRepository galaxyRepository;

    public Galaxy addGalaxy(AddGalaxyDTO addGalaxyDTO) {
        Galaxy galaxy = new Galaxy();

        galaxy.setName(addGalaxyDTO.getName());

        switch (addGalaxyDTO.getType()){
            case "elliptical":
                galaxy.setType(GalaxyType.ELLIPTICAL);
                break;
            case "lenticular":
                galaxy.setType(GalaxyType.LENTICULAR);
                break;
            case "spiral":
                galaxy.setType(GalaxyType.SPIRAL);
                break;
            case "irregular":
                galaxy.setType(GalaxyType.IRREGULAR);
                break;
        }

        Long age = addGalaxyDTO.getAge();

        if (age < 1000000000){
            age = age / 1000000;
            galaxy.setAge(age + "M");
        }else {
            age = age / 1000000000;
            galaxy.setAge(age + "B");
        }

        galaxyRepository.save(galaxy);

        return galaxy;
    }
}
