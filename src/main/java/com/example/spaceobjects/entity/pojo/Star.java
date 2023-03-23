package com.example.spaceobjects.entity.pojo;

import com.example.spaceobjects.entity.enums.StarClass;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "stars")
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private StarClass starClass;

    @Column
    private int temperature;

    @Column
    private double luminosity;

    @Column
    private double mass;

    @Column
    private double size;
}
