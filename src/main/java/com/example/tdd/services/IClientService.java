package com.example.tdd.services;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.model.SexeEnum;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    List<ClientEntity> findAll();
    List<ClientEntity> addClient(List<ClientEntity> client);
    Optional<ClientEntity> findByMail(String mail);
    Optional<ClientEntity> findById( Long id);
    List<ClientEntity> findAllBySexe(SexeEnum sexe);
    void deleteClient(ClientEntity client);

    void setIsActive(Long id, boolean isActive);

    void updateClient(Long id, ClientEntity client);

    Long count();

}
