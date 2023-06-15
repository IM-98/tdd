package com.example.tdd.repository;

import com.example.tdd.entity.SexeEntity;
import com.example.tdd.model.SexeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SexeRepository extends JpaRepository<SexeEntity, Long> {
}

