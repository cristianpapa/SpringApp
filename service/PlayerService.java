package com.examen.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examen.examen.model.Player;
import com.examen.examen.repository.PlayerRepository;
import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player createPlayer(Player player) {
        if (playerRepository.existsByFirstNameAndLastName(player.getFirstName(), player.getLastName())) {
            throw new IllegalArgumentException("Player with the same first name and last name already exists.");
        }

        return playerRepository.save(player);
    }

    public Player findById(long playerId) {
        return playerRepository.findById(playerId);
    }

    public List<Player> findByFirstNameAndLastName(String firstName, String lastName) {
        return playerRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public void deletePlayer(long playerId) {
        playerRepository.deleteById(playerId);
    }
}
