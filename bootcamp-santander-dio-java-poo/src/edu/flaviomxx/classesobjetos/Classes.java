package edu.flaviomxx.classesobjetos;

public class Classes {

    //As classes existentes em nosso projeto serão compostas por:

    //Identificador, Caracteristicas e Comportamentos.

    //* Classe(class): A estrutura e ou representação que direciona a criacao dos objetos de mesmo tipo.
    //* Identificador(identity): Proposito existencial aos objetos que serão criados.
    //* Caracteristicas(states): Também conhecido como atributos ou propriedades, é toda informação que representa o estado do objeto
    //* Comportamentos(behavior): Também conhecido como ações ou métodos, é toda parte comportamental que um objeto dispõe.
    //* Instanciar(new): É o ato de criar um objeto a partir de uma estrutura definida em uma classe.

    //Seguindo algumas convenções, as nossas classes são classificadas como:

    //* Classe de modelo(model): classes que representam estrutura de dominio da aplicação, exemplo: Cliente, Pedido, NotaFiscal e etc.
    //* Classe de serviço(service): classes que contém regras de negócio e validação de nosso sistema, exemplo: ClienteService possui o método de validar o CPF do cliente cadastrado.
    //* Classe de repositório(repository): classes que contém uma integração com o banco de dados, exemplo: ClienteRepository.
    //* Classe de controle(controller): classes que possuem a finalidade de disponibilizar alguma comunicação esterna a nossa aplicação, tipo http web ou webservices.
    //* Classe utilitário(util): classes que contém recursos comuns a toda nossa aplicação.
    //* Classe de visibilidade(view): Classes que possuem alguma interacão com a interface grafica acessada pelo usuário.
}
