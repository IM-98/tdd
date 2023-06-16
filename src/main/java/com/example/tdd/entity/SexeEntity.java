package com.example.tdd.entity;

import com.example.tdd.model.SexeEnum;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sexe", schema = "tdd")
public class SexeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private SexeEnum libelle;

    public SexeEntity (SexeEnum roleName) {this.libelle = roleName;}

    public String getLibelle() {
        return libelle.toString();
    }

}
