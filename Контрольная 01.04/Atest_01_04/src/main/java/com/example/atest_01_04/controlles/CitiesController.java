package com.example.atest_01_04.controlles;

import com.example.atest_01_04.models.Cities;
import com.example.atest_01_04.services.CitiesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cities")
public class CitiesController {
    @Autowired
    CitiesServices citiesService;

    @GetMapping("")
    public List<Cities> getAllCities() {
        return citiesService.getAllCities();
    }

    @GetMapping("/{id}")
    public Cities getCityById(@PathVariable Integer id) {
        return citiesService.getCity(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Cities city) {
        citiesService.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Cities city, @PathVariable Integer id) {
        try {
            citiesService.getCity(id);
            city.setId(id);
            citiesService.save(city);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Cities>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        citiesService.delete(id);
    }

}