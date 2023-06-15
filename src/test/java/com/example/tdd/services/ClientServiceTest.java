package com.example.tdd.services;

import com.example.tdd.entity.ClientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ClientServiceTest {

    @Autowired
    private ClientService clientService;
    @Test
    void findAll() throws Exception {
        List<ClientEntity> clientList =  clientService.findAll();
        assertEquals( 2, clientList.size());
    }


    @Test
    void addClient() {
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