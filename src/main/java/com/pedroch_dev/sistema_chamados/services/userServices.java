package com.pedroch_dev.sistema_chamados.services;

import java.util.ArrayList;

import com.pedroch_dev.sistema_chamados.model.user;

public class userServices {

    public ArrayList<user> listUsers(){

        ArrayList<user> users = new ArrayList<>();
        //Teste de dados 
        // A implementacao ocorreta quando aprende jpa
        users.add(new user(1, "Pedro", "pedro@gmail.com", "123", "admin"));
        users.add(new user(2, "Joao", "joao@gmail.com", "123", "user"));
        users.add(new user(3, "Maria", "maria@gmail.com", "123", "user"));

        return users;
    }
    


}
