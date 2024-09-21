package br.edu.flaviomxx.spring_data_jpa.repository;

import br.edu.flaviomxx.spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    //Query method
    List<User> findByNameContaining(String name);

    //Query method
    User findByUsername(String username);

    //Query override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%") // Tabela deve ter o nome da entity aqui
    List<User> findByName(@Param("name") String name);
}
