package com.examen.examen.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen.dto.MatchRequestDto;
import com.examen.examen.dto.MatchResponseDto;
import com.examen.examen.mapper.MatchMapper;
import com.examen.examen.model.Match;
import com.examen.examen.service.MatchService;


@RestController
@RequestMapping("/matches")
public class MatchController {

    private final MatchService matchService;
    private final MatchMapper matchMapper;

    @Autowired
    public MatchController(MatchService matchService, MatchMapper matchMapper) {
        this.matchService = matchService;
        this.matchMapper = matchMapper;
    }

    @GetMapping
    public ResponseEntity<List<MatchResponseDto>> getAllMatches() {
        List<Match> matches = matchService.findAllMatches();
        
        if (matches.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        
        List<MatchResponseDto> matchResponseDtos = matches.stream()
                .map(matchMapper::MatchToMatchResponseDto)
                .collect(Collectors.toList());
        
        return new ResponseEntity<>(matchResponseDtos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MatchResponseDto> createMatch(@Valid @RequestBody MatchRequestDto matchRequestDto) {
        Match match = matchMapper.MatchRequestDtoToMatch(matchRequestDto);
        Match createdMatch = matchService.createMatch(match);
        MatchResponseDto matchResponseDto = matchMapper.MatchToMatchResponseDto(createdMatch);
        return new ResponseEntity<>(matchResponseDto, HttpStatus.CREATED);
    }
}