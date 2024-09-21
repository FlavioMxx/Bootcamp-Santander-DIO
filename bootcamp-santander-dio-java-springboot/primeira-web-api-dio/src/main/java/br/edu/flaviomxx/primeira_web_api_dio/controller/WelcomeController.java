package br.edu.flaviomxx.primeira_web_api_dio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Bem vindo a minha primeira api web com Springboot";
    }
}
