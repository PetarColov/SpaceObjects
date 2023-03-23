package com.example.spaceobjects.entity.dto;

import lombok.Data;

@Data
public class AddPlanetDto {

    private String name;
    private String planetType;
    private String isHabitable;
}
