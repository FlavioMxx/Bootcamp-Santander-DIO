package br.edu.flaviomxx.spring_security_dio.config;

import br.edu.flaviomxx.spring_security_dio.model.User;
import br.edu.flaviomxx.spring_security_dio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        User user = repository.findByUsername("flavio.milani");

        if(Objects.isNull(user)) {
            user = new User();
            user.setName("ADMIN");
            user.setUsername("flavio.milani");
            user.setPassword("admin");
            user.getRoles().add("ADMIN");

            repository.save(user);
        }

        user = repository.findByUsername("frm.junior");

        if (Objects.isNull(user)) {
            user = new User();
            user.setName("Flavio Milani");
            user.setUsername("frm.junior");
            user.setPassword("senha123");
            user.getRoles().add("USER");

            repository.save(user);
        }

    }
}
