package com.example.dz2_train.services;

import com.example.dz2_train.models.Train;
import com.example.dz2_train.repositories.TrainRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TrainService {
    @Autowired
    TrainRepository trainRepository;

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }
    public Train getTrain(Integer id) {
        return trainRepository.findById(id).get();
    }

    public void save(Train train) {
        trainRepository.save(train);
    }

}
