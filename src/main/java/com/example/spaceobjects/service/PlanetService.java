package com.example.spaceobjects.service;

import com.example.spaceobjects.entity.dto.AddPlanetDto;
import com.example.spaceobjects.entity.enums.PlanetType;
import com.example.spaceobjects.entity.pojo.Planet;
import com.example.spaceobjects.entity.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    @Autowired
    private PlanetRepository planetRepository;

    public Planet addPlanet(AddPlanetDto addPlanetDto) {

        Planet planet = new Planet();

        planet.setName(addPlanetDto.getName());

        if (addPlanetDto.getIsHabitable().equals("true")){
            planet.setHabitable(true);
        }else {
            planet.setHabitable(false);
        }

        setPlanetClass(addPlanetDto, planet);

        planetRepository.save(planet);

        return planet;
    }

    private void setPlanetClass(AddPlanetDto addPlanetDto, Planet planet) {
        switch (addPlanetDto.getPlanetType()){
            case "terrestrial":
                planet.setPlanetType(PlanetType.TERRESTRIAL);
                break;
            case "giant planet":
                planet.setPlanetType(PlanetType.GIANT_PLANET);
                break;
            case "ice giant":
                planet.setPlanetType(PlanetType.ICE_GIANT);
                break;
            case "mesoplanet":
                planet.setPlanetType(PlanetType.MESOPLANET);
                break;
            case "mini-neptune":
                planet.setPlanetType(PlanetType.MINI_NEPTUNE);
                break;
            case "planetar":
                planet.setPlanetType(PlanetType.PLANETAR);
                break;
            case "super-earth":
                planet.setPlanetType(PlanetType.SUPER_EARTH);
                break;
            case "super-jupiter":
                planet.setPlanetType(PlanetType.SUPER_JUPITER);
                break;
            case "sub-earth":
                planet.setPlanetType(PlanetType.SUB_EARTH);
                break;
        }
    }
}
