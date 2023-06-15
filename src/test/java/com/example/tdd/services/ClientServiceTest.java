package com.example.tdd.services;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.model.SexeEnum;
import com.example.tdd.repository.SexeRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClientServiceTest {

    @Autowired
    private ClientService clientService;
    @Autowired
    private SexeRepository sexeRepository;

    private ClientEntity client;

    @BeforeEach
    public void clientFactory(){
        client= ClientEntity.builder()
                .email("test@gmail.com")
                .nom("test")
                .prenom("test")
                .numeroTelephone("0606060606")
                .dateNaissance(LocalDate.parse("1990-01-01"))
                .sexe(sexeRepository.findById(1L).get())
                .isActive(true)
                .build();
    }

    @Test
    @Order(1)
    void findAll() throws Exception {
        List<ClientEntity> clientList =  clientService.findAll();
        assertEquals( 2, clientList.size());
    }


    @Test
    @Order(2)
    void addClient() throws Exception {
        List<ClientEntity> clients = new ArrayList<>();
        clients.add(client);
        List<ClientEntity> list = clientService.addClient(clients);

        assertEquals( SexeEnum.HOMME, SexeEnum.valueOf(list.get(0).getSexe().getLibelle()));
        assertEquals(client.getEmail(),list.get(0).getEmail());
        assertNotNull(list.get(0).getId());
        assertEquals(3, clientService.findAll().size());
    }

    @Test
    @Order(3)
    void findByMail() throws Exception {
        Optional<ClientEntity> client= clientService.findByMail("karim@gmail.com");
        assertEquals(false, client.isEmpty());
        assertEquals("karim", client.get().getPrenom());
        assertEquals(3, clientService.findAll().size());
    }

    @Test
    @Order(4)
    void deleteClient() throws Exception {
        assertEquals(3, clientService.findAll().size());
        client.setId(3L);
        clientService.deleteClient(client);
        assertEquals(2, clientService.findAll().size());
    }

    @Test
    @Order(5)
    void deleteClientNotExist() throws Exception {
        clientService.deleteClient(client);
        assertEquals(2, clientService.findAll().size());
    }

    @Test
    void findById() {
    }

    @Test
    void findAllBySexe() {
    }


    @Test
    void setIsActive() {
    }

    @Test
    void updateClient() {
    }

}