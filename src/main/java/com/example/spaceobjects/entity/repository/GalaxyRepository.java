package com.example.spaceobjects.entity.repository;

import com.example.spaceobjects.entity.pojo.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalaxyRepository extends JpaRepository<Galaxy, Long> {
}
