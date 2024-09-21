package edu.flaviomxx.controledefluxos.estruturarepeticao;

public class ExemplosForArray {
    public static void main(String[] args) {
        //Percorrendo array com for
        String alunos[] = {"Flavio", "Jullya", "Maria", "Cecilia"};

        for(int i = 0; i < alunos.length; i++) {
            System.out.println("O(A) aluno(a) que está no indice i=" + i + " é " + alunos[i]);
        }

        System.out.println("===============================================");

        //foreach
        //Para cada variavel do tipo  : dentro de alunos { implementacao }
        for(String aluno : alunos) {
            System.out.println("O(A) nome do(a) aluno(a) é " + aluno);
        }
    }
}
