package com.example.atest_01_04.services;

import com.example.atest_01_04.models.flight;
import com.example.atest_01_04.repositories.flightRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class flightServices {
    @Autowired
    flightRepository FlightRepository;

    public List<flight> getAllflight() {
        return FlightRepository.findAll();
    }

    public flight getflight(Integer id) {
        return FlightRepository.findById(id).get();
    }

    public void save(flight Fl) {
        FlightRepository.save(Fl);
    }

    public void delete(Integer id) {
        FlightRepository.deleteById(id);
    }
}
