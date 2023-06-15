package com.example.tdd.repository;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.model.SexeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    List<ClientEntity> findAll() throws Exception {
        throw new Exception("Not implemented yet");
    }
    void addClient(List<ClientEntity> client) throws Exception {
        throw new Exception("Not implemented yet");
    }
    Optional<ClientEntity> findByMail(String mail) throws Exception {
        throw new Exception("Not implemented yet");
    }
    Optional<ClientEntity> findById( Long id) throws Exception {
        throw new Exception("Not implemented yet");
    }
    List<ClientEntity> findAllBySexe(SexeEnum sexe) throws Exception {
        throw new Exception("Not implemented yet");
    }
    void deleteClient(Long id) throws Exception {
        throw new Exception("Not implemented yet");
    }

    void setIsActive(Long id, boolean isActive) throws Exception {
        throw new Exception("Not implemented yet");
    }

    void updateClient(Long id, ClientEntity client) throws Exception {
        throw new Exception("Not implemented yet");
    }


}
