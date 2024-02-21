package com.examen.examen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    
    Contract findById(long id);
    List<Contract> findByStartDateBefore(Date date);
    
    List<Contract> findByWageGreaterThan(double wage);
    
    List<Contract> findByReleaseClauseGreaterThan(double releaseClause);
}
