package com.example.ekz.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ekz.repo.RdmRepo;


@Service
@Transactional

public class RDMserv {

    @Autowired
    static
    RdmRepo RDMRepository;
    public static void save(int rdm) {
        RDMRepository.save(rdm);
    }
}
