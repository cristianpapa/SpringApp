package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.model.Stadium;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long>{
    
    boolean existsById(long id);
    boolean existsByName(String name);

    Stadium findById(long id);
    Stadium findByName(String name);
}
