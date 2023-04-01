package com.example.atest_01_04.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="cities")
@Data
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}