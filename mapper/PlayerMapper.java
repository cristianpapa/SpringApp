package com.examen.examen.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.examen.dto.PlayerRequestDto;
import com.examen.examen.dto.PlayerResponseDto;
import com.examen.examen.model.Contract;
import com.examen.examen.model.Player;
import com.examen.examen.service.ContractService;
@Component
public class PlayerMapper {
    
    @Autowired
    private ContractService contractService;

    public Player PlayerRequestDtoToPlayer(PlayerRequestDto request)
    {
        Contract contract = contractService.getContractById(request.getContractId());
        return new Player(request.getFirstName(),request.getLastName(),request.getPosition(),request.getDateOfBirth(),contract);
    }

    public PlayerResponseDto PlayerToPlayerResponseDto(Player player)
    {
        return new PlayerResponseDto(player.getId(),player.getFirstName(),player.getLastName(),player.getPosition(),player.getDateOfBirth(),player.getContract().getId());
    }
}
