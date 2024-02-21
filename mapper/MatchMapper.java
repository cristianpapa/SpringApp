package com.examen.examen.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.examen.dto.MatchRequestDto;
import com.examen.examen.dto.MatchResponseDto;
import com.examen.examen.model.Match;
import com.examen.examen.model.Stadium;
import com.examen.examen.model.Team;
import com.examen.examen.service.StadiumService;
import com.examen.examen.service.TeamService;
@Component
public class MatchMapper {

    @Autowired
    private TeamService teamService;

    @Autowired
    private StadiumService stadiumService;

    public Match MatchRequestDtoToMatch(MatchRequestDto request)
    {
        Team homeTeam = teamService.findById(request.getHomeTeamId());
        Team awayTeam = teamService.findById(request.getAwayTeamId());
        Stadium stadium = stadiumService.findById(request.getStadiumId());
        return new Match(homeTeam,awayTeam,request.getHomeTeamGoals(),request.getAwayTeamGoals(),request.getDate(),stadium);
    }

    public MatchResponseDto MatchToMatchResponseDto(Match model)
    {
        return new MatchResponseDto(model.getId(),model.getHomeTeam().getId(),model.getAwayTeam().getId(),model.getHomeTeamGoals(),model.getAwayTeamGoals(),model.getDate(),model.getStadium().getId());
    }

    // public MatchResponseDto MatchToMatchResponseDto(Match model)
    // {
    //     return new MatchResponseDto();
    // }
}
