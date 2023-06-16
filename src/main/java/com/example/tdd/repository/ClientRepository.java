package com.example.tdd.repository;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.model.SexeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    Optional<ClientEntity> findByEmail(String email);

    List<ClientEntity> findAllBySexe_Libelle(SexeEnum sexe);
}
