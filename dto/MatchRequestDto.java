package com.examen.examen.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;


public class MatchRequestDto {
    @NotNull
    private Long homeTeamId;

    @NotNull
    private Long awayTeamId;

    @NotNull
    @PositiveOrZero
    private Integer homeTeamGoals;

    @NotNull
    @PositiveOrZero
    private Integer awayTeamGoals;

    @NotNull
    private Date date;

    @NotNull
    private Long stadiumId;


    public MatchRequestDto() {
    }

    public MatchRequestDto(@NotNull Long homeTeamId, @NotNull Long awayTeamId,
            @NotNull @PositiveOrZero Integer homeTeamGoals, @NotNull @PositiveOrZero Integer awayTeamGoals,
            @NotNull Date date, @NotNull Long stadiumId) {
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.date = date;
        this.stadiumId = stadiumId;
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
