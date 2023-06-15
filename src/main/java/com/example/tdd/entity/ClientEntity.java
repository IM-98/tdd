package com.example.tdd.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Builder
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
    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name = "sexe_id")
    private SexeEntity sexe;

    @Column(columnDefinition = "boolean default true")
    private boolean isActive;

}

