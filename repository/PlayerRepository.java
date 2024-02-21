package com.examen.examen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
    
    boolean existsById(long id);
    boolean existsByFirstNameAndLastName(String firstName,String lastName);

    Player findById(long id);
    List<Player> findByFirstNameAndLastName(String firstName,String lastName);
    List<Player> findByPosition(String position);
    List<Player>findByDateOfBirthBefore(Date dateOfBirth);
}

