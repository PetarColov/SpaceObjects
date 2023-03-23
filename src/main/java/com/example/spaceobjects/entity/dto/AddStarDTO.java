package com.example.spaceobjects.entity.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AddStarDTO {

    private String name;
    private int temperature;
    private double luminosity;
    private double mass;
    private double size;

}
