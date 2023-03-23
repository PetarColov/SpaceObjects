package com.example.spaceobjects.entity.pojo;

import com.example.spaceobjects.entity.enums.GalaxyType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "galaxies")
public class Galaxy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private GalaxyType type;

    @Column
    private String age;

}
