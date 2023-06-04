package com.example.RestPart.repositories;

import com.example.RestPart.models.AdditionalService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ASRepo extends JpaRepository<AdditionalService, Integer> {
}
