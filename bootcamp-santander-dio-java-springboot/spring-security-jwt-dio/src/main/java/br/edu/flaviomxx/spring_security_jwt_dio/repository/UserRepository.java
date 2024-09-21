package br.edu.flaviomxx.spring_security_jwt_dio.repository;

import br.edu.flaviomxx.spring_security_jwt_dio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = (:username)")
    public User findByUsername(@Param("username") String username);

    boolean existsByUsername(String username);
}
