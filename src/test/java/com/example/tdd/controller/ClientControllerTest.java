package com.example.tdd.controller;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.entity.SexeEntity;
import com.example.tdd.model.SexeEnum;
import com.example.tdd.services.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ClientController.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientService clientService;

    @Test
    void findAll_ShouldReturnClientList() throws Exception {
        // Arrange
        List<ClientEntity> clients = new ArrayList<>();
        ClientEntity client = ClientEntity.builder()
                .email("karim@gmail.com")
                .nom("karim")
                .prenom("karim")
                .numeroTelephone("0606060606")
                .dateNaissance(LocalDate.parse("1990-01-01"))
                .sexe(new SexeEntity(1L, SexeEnum.HOMME))
                .isActive(true)
                .build();
        clients.add(client);
        when(clientService.findAll()).thenReturn(clients);

        // Act & Assert
        mockMvc.perform(get("/api/clients/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].email").value("karim@gmail.com"));
    }

    @Test
    void findById_ShouldThrowException() throws Exception {
        // Arrange
        Long clientId = 1L;

        // Act & Assert
        mockMvc.perform(get("/api/clients/{id}", clientId))
                .andExpect(status().isInternalServerError());
    }
}
