package com.examen.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.model.Match;
import com.examen.examen.repository.MatchRepository;

import java.util.List;

@Service
public class MatchService {

    private final MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Match createMatch(Match match) {
        // Check if the same match already exists (same home and away teams on the same date)
        List<Match> existingMatches = matchRepository.findByHomeTeamAndAwayTeamAndDate(
                match.getHomeTeam(), match.getAwayTeam(), match.getDate());
        if (!existingMatches.isEmpty()) {
            throw new IllegalArgumentException("Match already exists with the same home and away teams on the same date.");
        }
        
        // Add any additional validation or business logic before saving the match
        return matchRepository.save(match);
    }

    public Match findMatchById(Long matchId) {
        return matchRepository.findById(matchId)
                              .orElseThrow(() -> new IllegalArgumentException("Match not found with ID: " + matchId));
    }

    public List<Match> findAllMatches() {
        return matchRepository.findAll();
    }

    public void deleteMatchById(Long matchId) {
        matchRepository.deleteById(matchId);
    }

}

