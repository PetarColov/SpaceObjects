package com.example.spaceobjects.entity.repository;

import com.example.spaceobjects.entity.pojo.Star;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarRepository extends JpaRepository<Star, Long> {
}
