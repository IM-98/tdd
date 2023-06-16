package com.example.tdd.repository;

import com.example.tdd.entity.SexeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SexeRepository extends JpaRepository<SexeEntity, Long> {
}

