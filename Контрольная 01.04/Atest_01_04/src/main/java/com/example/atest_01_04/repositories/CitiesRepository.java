package com.example.atest_01_04.repositories;

import com.example.atest_01_04.models.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository< Cities, Integer> {
}
