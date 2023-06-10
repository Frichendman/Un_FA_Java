package com.example.ekz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ekz.model.RdmModel;

public interface RdmRepo extends JpaRepository<RdmModel, Integer> {
}
