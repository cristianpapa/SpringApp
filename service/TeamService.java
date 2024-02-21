package com.examen.examen.service;


import com.examen.examen.exception.TeamWithSameNameExistsException;
import com.examen.examen.model.Team;
import com.examen.examen.repository.TeamRepository;

import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class TeamService {
    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    public Team create(Team team) {
        boolean teamWithSameNameExists = teamRepository.existsByName(team.getName());
        if(teamWithSameNameExists) {
            throw new TeamWithSameNameExistsException();
        }
        
        return teamRepository.save(team);
    }


    public Team findById(Long teamId) {
        Optional<Team> team = teamRepository.findById(teamId);
        return team.orElse(null);
    }

    
}

    // public void delete(long policyId) {
    //     Team insurance = insuranceRepository.findById(policyId);
    //     if (insurance != null) {
    //         if (!insurance.isActive()) {
    //             insuranceRepository.delete(insurance);
    //         } else {
    //             throw new InsuranceDeletionNotAllowedException();
    //         }
    //     } else {
    //         throw new InsuranceNotFoundException();
    //     }
    // }
    
    


   
