package com.example.tdd.entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name = "sexe", schema = "tdd")
public class SexeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String libelle;
}
