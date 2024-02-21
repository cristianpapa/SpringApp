package com.examen.examen.dto;

import java.util.Date;

public class MatchResponseDto {
    private Long id;
    private Long homeTeamId;
    private Long awayTeamId;
    private Integer homeTeamGoals;
    private Integer awayTeamGoals;
    private Date date;
    private Long stadiumId;
    public MatchResponseDto() {
    }
    public MatchResponseDto(Long id, Long homeTeamId, Long awayTeamId, Integer homeTeamGoals, Integer awayTeamGoals,
            Date date, Long stadiumId) {
        this.id = id;
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.date = date;
        this.stadiumId = stadiumId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getHomeTeamId() {
        return homeTeamId;
    }
    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }
    public Long getAwayTeamId() {
        return awayTeamId;
    }
    public void setAwayTeamId(Long awayTeamId) {
        this.awayTeamId = awayTeamId;
    }
    public Integer getHomeTeamGoals() {
        return homeTeamGoals;
    }
    public void setHomeTeamGoals(Integer homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }
    public Integer getAwayTeamGoals() {
        return awayTeamGoals;
    }
    public void setAwayTeamGoals(Integer awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Long getStadiumId() {
        return stadiumId;
    }
    public void setStadiumId(Long stadiumId) {
        this.stadiumId = stadiumId;
    }

    
}
