package com.example.atest_01_04.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="routes")
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "departure")
    private Cities cityFrom;

    @ManyToOne
    @JoinColumn(name = "destination")
    private Cities cityTo;

}
