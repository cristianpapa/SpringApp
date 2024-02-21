package com.examen.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examen.examen.dto.PlayerRequestDto;
import com.examen.examen.dto.PlayerResponseDto;
import com.examen.examen.mapper.PlayerMapper;
import com.examen.examen.model.Player;
import com.examen.examen.service.PlayerService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;
    private final PlayerMapper playerMapper;

    @Autowired
    public PlayerController(PlayerService playerService, PlayerMapper playerMapper) {
        this.playerService = playerService;
        this.playerMapper = playerMapper;
    }

    @GetMapping
    public ResponseEntity<List<PlayerResponseDto>> getAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        List<PlayerResponseDto> playerDtos = players.stream()
                .map(playerMapper::PlayerToPlayerResponseDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(playerDtos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PlayerResponseDto> createPlayer(@RequestBody PlayerRequestDto playerRequestDto) {
        Player player = playerMapper.PlayerRequestDtoToPlayer(playerRequestDto);
        Player createdPlayer = playerService.createPlayer(player);
        PlayerResponseDto createdPlayerDto = playerMapper.PlayerToPlayerResponseDto(createdPlayer);
        return new ResponseEntity<>(createdPlayerDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{playerId}")
    public ResponseEntity<Void> deletePlayer(@PathVariable long playerId) {
        playerService.deletePlayer(playerId);
        return ResponseEntity.noContent().build();
    }
}
