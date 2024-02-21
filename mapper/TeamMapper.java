package com.examen.examen.mapper;

import org.springframework.stereotype.Component;

import com.examen.examen.dto.TeamRequestDto;
import com.examen.examen.dto.TeamResponseDto;
import com.examen.examen.model.Team;

@Component
public class TeamMapper {
    public Team TeamRequestDtoToTeam(TeamRequestDto request)
    {
        return new Team(request.getName(),request.getCity(),request.getCountry());
    }

    public  TeamResponseDto TeamToTeamResponseDto(Team model)
    {
        return new TeamResponseDto(model.getId(),model.getName(),model.getCity(),model.getCountry());
    }

}
