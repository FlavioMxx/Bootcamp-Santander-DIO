package br.edu.flaviomxx.spring_security_jwt_dio.controller;

import br.edu.flaviomxx.spring_security_jwt_dio.model.User;
import br.edu.flaviomxx.spring_security_jwt_dio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    private void updateUser(@RequestBody  User user) {
        service.createUser(user);
    }
}
