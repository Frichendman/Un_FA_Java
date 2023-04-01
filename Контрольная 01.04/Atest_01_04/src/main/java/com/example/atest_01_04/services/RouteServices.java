package com.example.atest_01_04.services;

import com.example.atest_01_04.models.Route;
import com.example.atest_01_04.repositories.RouteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RouteServices {
    @Autowired
    RouteRepository routeRepository;

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRoute(Integer id) {
        return routeRepository.findById(id).get();
    }

    public void save(Route route) {
        routeRepository.save(route);
    }

    public void delete(Integer id) {
        routeRepository.deleteById(id);
    }
}