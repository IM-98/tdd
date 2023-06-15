package com.example.tdd.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "client", schema = "tdd")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    private String numeroTelephone;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToOne
    @JoinColumn(name = "sexe_id")
    private SexeEntity sexe;

    @Column(columnDefinition = "boolean default true")
    private boolean isActive;

}

