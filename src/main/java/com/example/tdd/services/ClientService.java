package com.example.tdd.services;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.model.SexeEnum;
import com.example.tdd.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService{
    private final ClientRepository clientRepository;

    List<ClientEntity> findAll() throws Exception {
        return clientRepository.findAll();
    }
    List<ClientEntity> addClient(List<ClientEntity> client) throws Exception {
        return clientRepository.saveAll(client);
    }
    public Optional<ClientEntity> findByMail(String mail) throws Exception {
        return clientRepository.findByEmail(mail);
    }
    Optional<ClientEntity> findById( Long id) throws Exception {
        throw new Exception("Not implemented yet");
    }
    List<ClientEntity> findAllBySexe(SexeEnum sexe) throws Exception {
        throw new Exception("Not implemented yet");
    }
    void deleteClient(ClientEntity client) throws Exception {
        clientRepository.delete(client);
    }

    void setIsActive(Long id, boolean isActive) throws Exception {
        throw new Exception("Not implemented yet");
    }

    void updateClient(Long id, ClientEntity client) throws Exception {
        throw new Exception("Not implemented yet");
    }

    Long count(){
        return clientRepository.count();
    }
}
