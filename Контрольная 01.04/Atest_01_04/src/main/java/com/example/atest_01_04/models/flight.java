package com.example.atest_01_04.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="filght")
@Data
public class flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="routeID")
    private Route Rid;

    private String name;

    private Date departureTime;
    private int flightTime;
}
