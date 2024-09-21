package edu.flaviomxx.dio.gof.design_patterns_spring.repository;

import edu.flaviomxx.dio.gof.design_patterns_spring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
