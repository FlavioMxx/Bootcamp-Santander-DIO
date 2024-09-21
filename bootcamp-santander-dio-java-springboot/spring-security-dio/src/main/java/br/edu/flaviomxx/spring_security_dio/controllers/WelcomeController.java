package br.edu.flaviomxx.spring_security_dio.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Bem vindo a minha API web usando Springboot";
    }

    @GetMapping("/usuarios") // Por algum motivo que eu desconheço, ele está dando ruim com /users
    public String users() {
        return "Usuário autorizado!";
    }

    @GetMapping("/admins")
    public String admins() {
        return "Administrador autorizado!";
    }
}
