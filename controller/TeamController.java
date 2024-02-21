package com.examen.examen.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.examen.examen.dto.TeamRequestDto;
import com.examen.examen.dto.TeamResponseDto;
import com.examen.examen.mapper.TeamMapper;
// import com.examen.examen.dto.CreateInsuranceRequestDto;
// import com.examen.examen.dto.InsuranceResponseDto;
// import com.examen.examen.exception.InsuranceDeletionNotAllowedException;
// import com.examen.examen.exception.InsuranceNotFoundException;
// import com.examen.examen.mapper.InsuranceMapper;
import com.examen.examen.model.Team;
import com.examen.examen.service.TeamService;



@RestController
@RequestMapping("/team")
public class TeamController {


    private TeamService teamService;
    private TeamMapper teamMapper;

    public TeamController(TeamService teamService, TeamMapper teamMapper) {
        this.teamService = teamService;
        this.teamMapper = teamMapper;
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<TeamResponseDto> getTeamById(@PathVariable Long teamId) {
        Team team = teamService.findById(teamId);
        
        if (team == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        TeamResponseDto teamResponseDto = teamMapper.TeamToTeamResponseDto(team);
        return new ResponseEntity<>(teamResponseDto, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<TeamResponseDto> addTeam(@RequestBody TeamRequestDto teamRequestDto) {
        Team teamToAdd = teamMapper.TeamRequestDtoToTeam(teamRequestDto);
        Team savedTeam = teamService.create(teamToAdd);
        TeamResponseDto teamResponseDto = teamMapper.TeamToTeamResponseDto(savedTeam);
        return new ResponseEntity<>(teamResponseDto, HttpStatus.CREATED);
    }

//     @PostMapping
//     public ResponseEntity<InsuranceResponseDto> create(
//             @Valid
//             @RequestBody
//             CreateInsuranceRequestDto requestDto
//     ) {
//         Team insurance = insuranceMapper.createInsuranceRequestDtoToInsurance(requestDto);
//         InsuranceResponseDto response = insuranceMapper.insuranceToInsuranceResponseDto(
//             insuranceService.create(insurance));
//         return ResponseEntity.created(URI.create("/insurance" + response.getId()))
//                 .body(response);
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> delete(
//             @PathVariable Long id
//     ) {
//         try {
//             insuranceService.delete(id);
//             return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//         } catch (InsuranceDeletionNotAllowedException e) {
//             return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
//         } catch (InsuranceNotFoundException e) {
//             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//         }
//     }
    
}
