package com.example.tdd.services;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.model.SexeEnum;
import com.example.tdd.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {
    private final ClientRepository clientRepository;
    @Override
    public List<ClientEntity> findAll() {
        return clientRepository.findAll();
    }
    @Override
    public List<ClientEntity> addClient(List<ClientEntity> client)  {
        return clientRepository.saveAll(client);
    }
    @Override
    public Optional<ClientEntity> findByMail(String mail)  {
        return clientRepository.findByEmail(mail);
    }
    @Override
    public Optional<ClientEntity> findById( Long id) {
        return clientRepository.findById(id);
    }
    @Override
    public List<ClientEntity> findAllBySexe(SexeEnum sexe) {
        return clientRepository.findAllBySexe_Libelle(sexe);
    }
    @Override
    public void deleteClient(ClientEntity client) {
        clientRepository.delete(client);
    }
    @Override
    public void setIsActive(Long id, boolean isActive)  {
        Optional<ClientEntity> client = clientRepository.findById(id);
        if(client.isPresent()){
            client.get().setActive(isActive);
            clientRepository.save(client.get());
        } else {
            throw new NoSuchElementException("Client not found");
        }
    }
    @Override
    public void updateClient(Long id, ClientEntity client) {
      //check if client exist and then save it to update
        Optional<ClientEntity> clientToUpdate = clientRepository.findById(id);
        if(clientToUpdate.isPresent()){
            clientToUpdate.get().setEmail(client.getEmail());
            clientToUpdate.get().setNom(client.getNom());
            clientToUpdate.get().setPrenom(client.getPrenom());
            clientToUpdate.get().setNumeroTelephone(client.getNumeroTelephone());
            clientToUpdate.get().setDateNaissance(client.getDateNaissance());
            clientToUpdate.get().setSexe(client.getSexe());
            clientToUpdate.get().setActive(client.isActive());
            clientRepository.save(clientToUpdate.get());
        } else {
            throw new NoSuchElementException("Client not found");
        }

    }

    Long count(){
        return clientRepository.count();
    }
}
