package br.edu.flaviomxx.primeira_web_api_dio.repository;

import br.edu.flaviomxx.primeira_web_api_dio.handler.BusinessException;
import br.edu.flaviomxx.primeira_web_api_dio.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {
    public void save(User user) {
        if(Objects.isNull(user.getLogin()))
            throw new BusinessException("O campo login é obrigatório!");

        if(user.getId() == null)
            System.out.println("SAVE - Recebendo usuário na camada de repositório.");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/ID - Recebendo o id: %d para deleção%n", id);
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> userList = new ArrayList<>();
        userList.add(new User("Flavio Milani", "senha123"));
        userList.add(new User("Jullya Milani", "senha321"));
        userList.add(new User("Maria Milani", "senha456"));
        userList.add(new User("Cecilia Milani", "senha654"));

        return userList;
    }

    public User findById(Integer id) {
        System.out.printf("FIND/ID - Recebendo o id: %d para localização%n", id);
        return new User("Flavio Milani", "senha123");
    }

    public User findByUsername(String username) {
        System.out.printf("FIND/USERNAME - Recebendo o username: %s para localização%n", username);
        return new User("Flavio Milani", "senha123");
    }


}
