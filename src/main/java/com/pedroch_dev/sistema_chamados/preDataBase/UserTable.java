package com.pedroch_dev.sistema_chamados.preDataBase;

import java.util.ArrayList;

import com.pedroch_dev.sistema_chamados.model.User;
import com.pedroch_dev.sistema_chamados.security.PasswordHasher;

public class UserTable {

    ArrayList<User> UserDB = new ArrayList<>();
    int id = 1;

    public void newUser(String nome, String email, String senha, String cargo) {

        UserDB.add(new User(nome, email, PasswordHasher.hashPassword(senha), cargo));
        UserDB.getLast().setId(id);
        id++;

    }

    public void deleteUser(int id) {
        for (int i = 0; i < UserDB.size(); i++) {
            if (UserDB.get(i).getId() == id) {
                UserDB.remove(i);
            }
        }
    }

    public ArrayList<User> listUsers() {

        return UserDB;
    }

}
