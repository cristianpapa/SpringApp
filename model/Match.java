package com.examen.examen.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "Matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;

    @NotNull
    @PositiveOrZero
    private Integer homeTeamGoals;

    @NotNull
    @PositiveOrZero
    private Integer awayTeamGoals;

    @NotNull
    @PastOrPresent
    private Date date;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    

    public Match() {
    }

    public Match(@NotNull Team homeTeam, @NotNull Team awayTeam, @NotNull @PositiveOrZero Integer homeTeamGoals,
            @NotNull @PositiveOrZero Integer awayTeamGoals, @NotNull @Future Date date, @NotNull Stadium stadium) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.date = date;
        this.stadium = stadium;
    }

    public Match(Long id, @NotNull Team homeTeam, @NotNull Team awayTeam,
            @NotNull @PositiveOrZero Integer homeTeamGoals, @NotNull @PositiveOrZero Integer awayTeamGoals,
            @NotNull @Future Date date, @NotNull Stadium stadium) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.date = date;
        this.stadium = stadium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
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

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    
}
