package com.example.RestPart.services;

import com.example.RestPart.models.AdditionalService;
import com.example.RestPart.repositories.ASRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ASService {
    @Autowired
    ASRepo asRepo;

    public List<AdditionalService> getAllAS() {
        return asRepo.findAll();
    }

    public AdditionalService getASById(Integer id) {
        return asRepo.findById(id).get();
    }

    public void create(AdditionalService as) {
        asRepo.save(as);
    }

    public void update(AdditionalService as, Integer id) {
        AdditionalService asToUpdate = asRepo.findById(id).get();
        if (as.getName() != null) {
            asToUpdate.setName(as.getName());
        }
        if (as.getPrice() != null) {
            asToUpdate.setPrice(as.getPrice());
        }
        asRepo.save(asToUpdate);

    }

    public void delete(Integer id) {
        asRepo.deleteById(id);
    }

}
