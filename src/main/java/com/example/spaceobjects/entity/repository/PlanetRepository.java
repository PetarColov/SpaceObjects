package com.example.spaceobjects.entity.repository;

import com.example.spaceobjects.entity.pojo.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
