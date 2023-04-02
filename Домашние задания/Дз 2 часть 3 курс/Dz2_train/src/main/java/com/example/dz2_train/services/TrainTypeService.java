package com.example.dz2_train.services;

import com.example.dz2_train.models.TrainType;
import com.example.dz2_train.repositories.TrainTypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TrainTypeService {
    @Autowired
    TrainTypeRepository trainTypeRepository;

    public List<TrainType> getAllTrainTypes() {
        return trainTypeRepository.findAll();
    }
    public TrainType getTrainType(Integer id) {
        return trainTypeRepository.findById(id).get();
    }

    public void save(TrainType trainType) {
        trainTypeRepository.save(trainType);
    }

}
