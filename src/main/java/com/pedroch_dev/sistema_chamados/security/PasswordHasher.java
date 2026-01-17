package com.pedroch_dev.sistema_chamados.security;

public class PasswordHasher {

    public static String hashPassword(String password) {
        return org.springframework.security.crypto.bcrypt.BCrypt.hashpw(password, org.springframework.security.crypto.bcrypt.BCrypt.gensalt());
    }
    
    public static boolean checkPassword(String password, String hashedPassword) {
        return org.springframework.security.crypto.bcrypt.BCrypt.checkpw(password, hashedPassword);
    }




}
