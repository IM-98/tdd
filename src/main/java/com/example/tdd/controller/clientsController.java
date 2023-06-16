package com.example.tdd.controller;

import com.example.tdd.entity.ClientEntity;
import com.example.tdd.services.ClientService;
import com.example.tdd.services.IClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/clients")
public class clientsController {
    @Autowired
    private ClientService clientService;

    /*@GetMapping("/find")
    public ResposeEntity<> findAll(){
        List<ClientEntity> clients= clientService.findAll();

    }*/

}
