package com.example.spaceobjects.entity.repository;

import com.example.spaceobjects.entity.pojo.Moon;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoonRepository extends JpaRepository<Moon, Long> {
}
