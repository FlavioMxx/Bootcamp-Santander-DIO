package br.edu.flaviomxx.spring_data_jpa;

import br.edu.flaviomxx.spring_data_jpa.model.User;
import br.edu.flaviomxx.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("Milani");
        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser() {
        User user = new User();
        user.setName("Maria Cecilia Cassimiro Milani");
        user.setUsername("mcc.milani");
        user.setPassword("senha123");

        repository.save(user);

        for(User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
