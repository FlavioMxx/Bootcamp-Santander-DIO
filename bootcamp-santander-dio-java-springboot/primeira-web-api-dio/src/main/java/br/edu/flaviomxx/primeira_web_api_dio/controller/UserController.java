package br.edu.flaviomxx.primeira_web_api_dio.controller;

import br.edu.flaviomxx.primeira_web_api_dio.model.User;
import br.edu.flaviomxx.primeira_web_api_dio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository repository;

    @PostMapping()
    public void save(@RequestBody User user) {
        repository.save(user);
    }

    @PutMapping()
    public void update(@RequestBody User user) {
        repository.save(user);
    }

    @GetMapping()
    public List<User> listAll() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}
