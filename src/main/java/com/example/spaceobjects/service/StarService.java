package com.example.spaceobjects.service;

import com.example.spaceobjects.entity.dto.AddStarDTO;
import com.example.spaceobjects.entity.enums.StarClass;
import com.example.spaceobjects.entity.pojo.Star;
import com.example.spaceobjects.entity.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarService {
    @Autowired
    private StarRepository starRepository;

    public Star addStar(AddStarDTO addStarDTO) {
        Star star = new Star();
        star.setName(addStarDTO.getName());
        star.setTemperature(addStarDTO.getTemperature());
        star.setLuminosity(addStarDTO.getLuminosity());
        star.setMass(addStarDTO.getMass());
        star.setSize(addStarDTO.getSize());

        Integer temperature = addStarDTO.getTemperature();
        double luminosity = addStarDTO.getLuminosity();
        double mass = addStarDTO.getMass();
        double size = addStarDTO.getSize();

        setStarClass(star, temperature, luminosity, mass, size);

        starRepository.save(star);

        return star;
    }

    private void setStarClass(Star star, Integer temperature, double luminosity, double mass, double size) {
        if(temperature >= 30000 && luminosity >= 30000 && mass >= 16 && size >= 6.6){
            star.setStarClass(StarClass.O);
        }else if ((temperature < 30000 && temperature > 10000) && (luminosity > 25 && luminosity < 30000) && (mass > 2.1 && mass < 16) && (size > 1.8 && size < 6.6)){
            star.setStarClass(StarClass.B);
        }else if ((temperature > 7500 && temperature <= 10000) && (luminosity > 5 && luminosity <= 25) && (mass > 1.4 && mass <= 2.1) && (size > 1.4 && size <= 1.8)){
            star.setStarClass(StarClass.A);
        }else if ((temperature > 6000 && temperature <= 7500) && (luminosity > 1.5 && luminosity <= 5) && (mass > 1.04 && mass <= 1.4) && (size > 1.15 && size <= 1.4)){
            star.setStarClass(StarClass.F);
        }else if ((temperature > 5200 && temperature <= 6000) && (luminosity > 0.6 && luminosity <= 1.5) && (mass > 0.8 && mass <= 1.04) && (size > 0.96 && size <= 1.15)){
            star.setStarClass(StarClass.G);
        }else if ((temperature > 3700 && temperature <= 5200) && (luminosity > 0.08 && luminosity <= 0.6) && (mass > 0.45 && mass <= 0.8) && (size > 0.7 && size <= 0.96)){
            star.setStarClass(StarClass.K);
        }else if ((temperature > 2400 && temperature <= 3700) && (luminosity <= 0.08) && (mass > 0.08 && mass <= 0.45) && (size <= 0.7)){
            star.setStarClass(StarClass.M);
        }else {
            star.setStarClass(StarClass.M);
        }
    }
}
