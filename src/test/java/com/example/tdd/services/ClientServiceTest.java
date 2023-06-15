package com.example.tdd.services;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.entity.SexeEntity;
import com.example.tdd.model.SexeEnum;
import com.example.tdd.repository.SexeRepository;
import com.mysql.cj.xdevapi.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ClientServiceTest {

    @Autowired
    private ClientService clientService;
    @Autowired
    private SexeRepository sexeRepository;
    @Test
    void findAll() throws Exception {
        List<ClientEntity> clientList =  clientService.findAll();
        assertEquals( 2, clientList.size());
    }


    @Test
    void addClient() throws Exception {
        ClientEntity client = ClientEntity.builder()
                .email("test@gmail.com")
                .nom("test")
                .prenom("test")
                .numeroTelephone("0606060606")
                .dateNaissance(LocalDate.parse("1990-01-01"))
                .sexe(sexeRepository.findById(1L).get())
                .isActive(true)
                .build();
        List<ClientEntity> clients = new ArrayList<>();
        clients.add(client);
        List<ClientEntity> list = clientService.addClient(clients);

        assertEquals( SexeEnum.HOMME, SexeEnum.valueOf(list.get(0).getSexe().getLibelle()));

    }

    @Test
    void findByMail() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAllBySexe() {
    }

    @Test
    void deleteClient() {
    }

    @Test
    void setIsActive() {
    }

    @Test
    void updateClient() {
    }
}