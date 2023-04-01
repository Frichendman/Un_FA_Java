package com.example.atest_01_04.controlles;


import com.example.atest_01_04.models.flight;
import com.example.atest_01_04.services.flightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/filghts")
public class flightController {

    @Autowired
    flightServices FlightService;

    @GetMapping("")
    public List<flight> getAllFlights() {
        return FlightService.getAllflight();
    }

    @GetMapping("/{id}")
    public flight getflightById(@PathVariable Integer id) {
        return FlightService.getflight(id);

    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody flight Fl) {
        FlightService.save(Fl);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody flight Fl, @PathVariable Integer id) {
        try {
            FlightService.getflight(id);
            Fl.setId(id);
            FlightService.save(Fl);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<flight>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        FlightService.delete(id);
    }


}
