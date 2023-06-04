package com.example.RestPart.repositories;

import com.example.RestPart.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Integer> {
}


