package com.examen.examen.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.examen.examen.model.Stadium;
import com.examen.examen.repository.StadiumRepository;

@Service
public class StadiumService {

    private final StadiumRepository stadiumRepository;

    public StadiumService(StadiumRepository stadiumRepository) {
        this.stadiumRepository = stadiumRepository;
    }

    public Stadium create(Stadium stadium) {
        // Check if the stadium with the same name already exists
        if (stadiumRepository.existsByName(stadium.getName())) {
            throw new IllegalArgumentException("Stadium with the same name already exists.");
        }
        return stadiumRepository.save(stadium);
    }

    public Stadium findById(Long stadiumId) {
        Optional<Stadium> stadium = stadiumRepository.findById(stadiumId);
        if (stadium==null) {
            throw new IllegalArgumentException("Stadium not found with ID: " + stadiumId);
        }
        return stadium.get();
    }

    public Stadium findByName(String name) {
        Stadium stadium = stadiumRepository.findByName(name);
        if (stadium == null) {
            throw new IllegalArgumentException("Stadium not found with name: " + name);
        }
        return stadium;
    }

    public void delete(Long stadiumId) {
        if (!stadiumRepository.existsById(stadiumId)) {
            throw new IllegalArgumentException("Stadium not found with ID: " + stadiumId);
        }
        stadiumRepository.deleteById(stadiumId);
    }
}
