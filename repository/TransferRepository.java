package com.examen.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examen.examen.model.Transfer;
import java.util.Date;
import java.util.List;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
    List<Transfer> findByPlayerId(Long playerId);
    List<Transfer> findByFromTeamId(Long teamId);
    List<Transfer> findByToTeamId(Long teamId);
    List<Transfer> findByDateBetween(Date startDate, Date endDate);
}
