package com.examen.examen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen.model.Match;
import com.examen.examen.model.Team;


@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findByHomeTeamId(Long homeTeamId);

    List<Match> findByAwayTeamId(Long awayTeamId);

    List<Match> findByDateBetween(Date startDate, Date endDate);

    List<Match> findByHomeTeamIdAndDateBetween(Long homeTeamId, Date startDate, Date endDate);

    List<Match> findByAwayTeamIdAndDateBetween(Long awayTeamId, Date startDate, Date endDate);

    List<Match> findByStadiumId(Long stadiumId);

    List<Match> findByHomeTeamIdOrAwayTeamId(Long homeTeamId, Long awayTeamId);

    List<Match> findByHomeTeamAndAwayTeamAndDate(Team homeTeam, Team awayTeam, Date date);
}