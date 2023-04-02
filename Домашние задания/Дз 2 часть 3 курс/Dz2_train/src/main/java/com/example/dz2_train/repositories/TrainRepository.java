package com.example.dz2_train.repositories;

import com.example.dz2_train.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Integer> {
}
