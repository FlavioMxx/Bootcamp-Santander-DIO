package br.edu.flaviomxx.spring_security_jwt_dio.service;

import br.edu.flaviomxx.spring_security_jwt_dio.model.User;
import br.edu.flaviomxx.spring_security_jwt_dio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user) {
        String password = user.getPassword();
        user.setPassword(encoder.encode(password)); // criptografa senha


        repository.save(user);
    }

}
