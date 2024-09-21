package edu.flaviomxx.dio.gof.design_patterns_spring.service.impl;

import edu.flaviomxx.dio.gof.design_patterns_spring.model.Cliente;
import edu.flaviomxx.dio.gof.design_patterns_spring.model.Endereco;
import edu.flaviomxx.dio.gof.design_patterns_spring.repository.ClienteRepository;
import edu.flaviomxx.dio.gof.design_patterns_spring.repository.EnderecoRepository;
import edu.flaviomxx.dio.gof.design_patterns_spring.service.ClienteService;
import edu.flaviomxx.dio.gof.design_patterns_spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteRepository repository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = repository.findById(id);

        if(cliente.isPresent())
            return cliente.get();

        throw new RuntimeException("Cliente não existe!");
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clientes = repository.findById(id);

        if (clientes.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        Long cep = cliente.getEndereco().getId();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(String.valueOf(cep));
            enderecoRepository.save(novoEndereco);

            return novoEndereco;
        });
        cliente.setEndereco(endereco);

        repository.save(cliente);
    }
}
