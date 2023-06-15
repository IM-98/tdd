package com.example.tdd.entity;

import com.example.tdd.model.SexeEnum;
import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "client")
public class ClientEntity {

    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String nom;

    private String prenom;

    private String numeroTelephone;

    private String dateNaissance;

    @Column(columnDefinition = "ENUM('HOMME', 'FEMME')")
    @Enumerated(EnumType.STRING)
    private SexeEnum sexe;

    private boolean isActive;

}
