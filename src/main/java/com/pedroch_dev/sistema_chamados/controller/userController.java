package com.pedroch_dev.sistema_chamados.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedroch_dev.sistema_chamados.model.user;
import com.pedroch_dev.sistema_chamados.services.userServices;

@RestController
@RequestMapping("/users")
public class userController {
        
    @GetMapping
    public ArrayList<user> list(){
        
        userServices urServices = new userServices();
        ArrayList<user> users = urServices.listUsers();

        return users;

    }

    


}
