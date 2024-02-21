package com.examen.examen.repository;


import com.examen.examen.model.Team;



import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    
    
    boolean existsById(long id);
    boolean existsByName(String name);

    Team findById(long id);
    // List getAll();

}
 
