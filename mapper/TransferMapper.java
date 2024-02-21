package com.examen.examen.mapper;
import com.examen.examen.dto.TransferRequestDto;
import com.examen.examen.dto.TransferResponseDto;
import com.examen.examen.model.Transfer;
import com.examen.examen.service.PlayerService;
import com.examen.examen.service.TeamService;
import com.examen.examen.model.Player;

import com.examen.examen.model.Team;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferMapper {

    @Autowired
    private PlayerService playerService;
    @Autowired
    private TeamService teamService;

    public Transfer TransferRequestDtoToTransfer(TransferRequestDto request)
    {
        // Team homeTeam = teamService.findById(request.getHomeTeamId());
        // Team awayTeam = teamService.findById(request.getAwayTeamId());
        // Stadium stadium = stadiumService.findById(request.getStadiumId());
        Player player = playerService.findById(request.getPlayerId());
        Team fromTeam = teamService.findById(request.getFromTeamId());
        Team toTeam = teamService.findById(request.getToTeamId());
        return new Transfer(player,fromTeam,toTeam,request.getTransferFee(),request.getDate());
    }

    public TransferResponseDto TransferToTransferResponseDto(Transfer model)
    {
        return new TransferResponseDto(model.getPlayer().getId(),model.getFromTeam().getId(),model.getToTeam().getId(),model.getTransferFee(),model.getDate());
    }
}
