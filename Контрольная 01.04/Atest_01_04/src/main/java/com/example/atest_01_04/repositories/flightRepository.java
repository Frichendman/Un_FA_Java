package com.example.atest_01_04.repositories;

import com.example.atest_01_04.models.flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface flightRepository extends JpaRepository<flight, Integer> {
}
