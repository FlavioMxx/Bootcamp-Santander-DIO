package edu.flaviomxx.construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf, String endereco) { //Construtor é um metodo que me obriga a instancia um novo objeto com valores pré setados,
        this.nome = nome;                                     // ele não tem tipo de retorno nenhum e tem sempre o mesmo nome da Classe, não é uma boa prática criar um construtor com todos os atributos,
        this.cpf = cpf;                                       // apenas os relevantes para a ocasiao.
        this.endereco = endereco; // "this" se refere ao objeto que cria, por exemplo na Classe SistemaCadastro.java, esse this seria o objeto flavio, entao o nome,cpf, endereco de flavio.
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
