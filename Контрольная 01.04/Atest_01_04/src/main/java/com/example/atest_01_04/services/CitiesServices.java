package com.example.atest_01_04.services;

import com.example.atest_01_04.models.Cities;
import com.example.atest_01_04.repositories.CitiesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CitiesServices {
    @Autowired
    CitiesRepository cityRepository;

    public List<Cities> getAllCities() {
        return cityRepository.findAll();
    }
    public Cities getCity(Integer id) {
        return cityRepository.findById(id).get();
    }

    public void save(Cities city) {
        cityRepository.save(city);
    }

    public void delete(Integer id){ cityRepository.deleteById(id);}
}
