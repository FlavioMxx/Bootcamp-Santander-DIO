package br.edu.flaviomxx.message;

public class Mensageria {
    private String nome;

    public Mensageria() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mandarSaudacoes(String nome) {
        return "Olá, " + nome;
    }
}
