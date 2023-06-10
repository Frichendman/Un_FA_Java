package com.example.ekz.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name ="RDM")
@Data
public class RdmModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private int rdm;
}
