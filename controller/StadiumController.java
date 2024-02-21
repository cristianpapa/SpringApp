package com.examen.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen.dto.StadiumRequestDto;
import com.examen.examen.dto.StadiumResponseDto;
import com.examen.examen.mapper.StadiumMapper;
import com.examen.examen.model.Stadium;
import com.examen.examen.service.StadiumService;

@RestController
@RequestMapping("/stadium")
public class StadiumController {

    private final StadiumService stadiumService;
    private final StadiumMapper stadiumMapper;

    @Autowired
    public StadiumController(StadiumService stadiumService, StadiumMapper stadiumMapper) {
        this.stadiumService = stadiumService;
        this.stadiumMapper = stadiumMapper;
    }

    @PostMapping
    public ResponseEntity<StadiumResponseDto> addStadium(@RequestBody StadiumRequestDto stadiumRequestDto) {
        Stadium stadiumToAdd = stadiumMapper.StadiumRequestDtoToStadium(stadiumRequestDto);
        Stadium savedStadium = stadiumService.create(stadiumToAdd);
        StadiumResponseDto stadiumResponseDto = stadiumMapper.StadiumToStadiumResponseDto(savedStadium);
        return new ResponseEntity<>(stadiumResponseDto, HttpStatus.CREATED);
    }

    @GetMapping("/{stadiumId}")
    public ResponseEntity<StadiumResponseDto> getStadiumById(@PathVariable Long stadiumId) {
        Stadium stadium = stadiumService.findById(stadiumId);
        StadiumResponseDto stadiumResponseDto = stadiumMapper.StadiumToStadiumResponseDto(stadium);
        return new ResponseEntity<>(stadiumResponseDto, HttpStatus.OK);
    }

    // @PutMapping("/{stadiumId}")
    // public ResponseEntity<StadiumResponseDto> updateStadium(@PathVariable Long stadiumId,
    //                                                         @RequestBody CreateStadiumRequestDto stadiumRequestDto) {
    //     Stadium existingStadium = stadiumService.findById(stadiumId);
    //     Stadium updatedStadium = stadiumMapper.updateStadiumFromRequestDto(existingStadium, stadiumRequestDto);
    //     Stadium savedStadium = stadiumService.create(updatedStadium);
    //     StadiumResponseDto stadiumResponseDto = stadiumMapper.stadiumToStadiumResponseDto(savedStadium);
    //     return new ResponseEntity<>(stadiumResponseDto, HttpStatus.OK);
    // }

    @DeleteMapping("/{stadiumId}")
    public ResponseEntity<Void> deleteStadium(@PathVariable Long stadiumId) {
        stadiumService.delete(stadiumId);
        return ResponseEntity.noContent().build();
    }
}
