package com.example.spaceobjects.entity.pojo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "moons")
public class Moon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
