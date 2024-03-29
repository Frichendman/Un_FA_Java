package com.example.dz2_train.services;

import com.example.dz2_train.models.Route;
import com.example.dz2_train.repositories.RouteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RouteService {
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

}
