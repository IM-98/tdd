package com.example.tdd.controller;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.services.ClientService;
import com.example.tdd.services.IClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<Object> findAll() throws Exception {
        List<ClientEntity> clients = clientService.findAll();

       return new ResponseEntity<>(clients, HttpStatus.OK);
//        throw new Exception("Not implemented");
    }

    @GetMapping("/{id}")
    public void findById(@PathVariable Long id) throws Exception {
//        List<ClientEntity> clients= clientService.findById(id);
        throw new Exception("Not implemented");
    }


}
