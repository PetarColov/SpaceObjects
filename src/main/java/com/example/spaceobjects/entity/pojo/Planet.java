package com.example.spaceobjects.entity.pojo;

import com.example.spaceobjects.entity.enums.PlanetType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@Data
@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private PlanetType planetType;

    @Column
    private boolean isHabitable;
}
