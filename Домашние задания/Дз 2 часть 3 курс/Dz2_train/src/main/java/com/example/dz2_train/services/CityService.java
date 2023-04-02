package com.example.dz2_train.services;

import com.example.dz2_train.models.City;
import com.example.dz2_train.repositories.CityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
    public City getCity(Integer id) {
        return cityRepository.findById(id).get();
    }

    public void save(City city) {
        cityRepository.save(city);
    }
}
