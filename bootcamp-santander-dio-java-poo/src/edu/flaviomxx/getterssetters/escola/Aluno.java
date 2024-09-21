package edu.flaviomxx.getterssetters.escola;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() { // Por ser um método publico, eu consigo acessar ele no projeto inteiro, consigo então usa-lo para acessar um atributo privado, que só a minha classe vê.
        return nome; //Me retorna o atributo privado
    }

    public void setNome(String nome) { // Por ser um método publico, eu consigo acessar ele no projeto inteiro, consigo então usa-lo para alterar um atributo privado, que só a minha classe vê.
        this.nome = nome; //atribuindo um valor de parametro ao meu atributo privado
    }

    public int getIdade() { // Por ser um método publico, eu consigo acessar ele no projeto inteiro, consigo então usa-lo para acessar um atributo privado, que só a minha classe vê.
        return idade;
    }

    public void setIdade(int idade) {// Por ser um método publico, eu consigo acessar ele no projeto inteiro, consigo então usa-lo para alterar um atributo privado, que só a minha classe vê.
        this.idade = idade;
    }
}
