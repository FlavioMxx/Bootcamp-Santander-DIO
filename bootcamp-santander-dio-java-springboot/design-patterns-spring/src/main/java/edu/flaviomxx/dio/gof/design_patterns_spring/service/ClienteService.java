package edu.flaviomxx.dio.gof.design_patterns_spring.service;

import edu.flaviomxx.dio.gof.design_patterns_spring.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
