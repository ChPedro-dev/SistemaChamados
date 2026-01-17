package com.pedroch_dev.sistema_chamados.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedroch_dev.sistema_chamados.security.PasswordHasher;
import com.pedroch_dev.sistema_chamados.services.LoginService;

@RestController
@RequestMapping("/login")
public class loginController {

    @PostMapping("/auth")
    public ResponseEntity<Object> auth(@RequestHeader String token, @RequestBody Map<String, String> requestBody) {
        if (token == null || token.isEmpty()) {
            if (LoginService.isCadastrado(requestBody.get("email"))) {
                if (PasswordHasher.checkPassword(getSenhaBanco(), requestBody.get("senha"))) {
                    


                } else {
                    Map<String, String> response = new HashMap<>();
                    response.put("status", "error");
                    response.put("message", "Senha incorreta");
                }

            } else {
                Map<String, String> response = new HashMap<>();
                response.put("status", "error");
                response.put("message", "Usuario nao cadastrado");
            }

        }

        if (token.equals("123")) {
            Map<String, String> response = new HashMap<>();
            response.put("status", "success");
            response.put("message", "User authenticated successfully");
            return ResponseEntity.ok(response);
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "Invalid credentials");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }

    }

}
