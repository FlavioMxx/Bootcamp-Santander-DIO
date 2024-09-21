package edu.flaviomxx.getterssetters.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        //felipe.nome = "Flavio"; Por ser um atributo private, não posso acessar ele em nenhum lugar diferente da classe dele
        //felipe.ideade = 23;
        felipe.setNome("Flavio"); //Devo usar um método especial acessor para isso
        felipe.setIdade(23);

        System.out.println(String.format("O aluno %s tem %d anos", felipe.getNome(), felipe.getIdade()));
    }
}
