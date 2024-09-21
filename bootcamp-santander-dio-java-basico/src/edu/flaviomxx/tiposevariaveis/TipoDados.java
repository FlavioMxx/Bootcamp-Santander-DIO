package edu.flaviomxx.tiposevariaveis;

public class TipoDados {
    public static void main(String[] args) {
        //Tipos primitivos
        byte idade = 123;
        short ano = 2024;
        int cep = 20304050; // Se começar com zero, talvez tenha que ser outro tipo.
        long cpf = 98765432112L; // Se começar com zero, talvez tenha que ser outro tipo.
        float pi = 3.14f;
        double salario = 1412.01;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = (short) numeroNormal; //  ERRO! Java é fortemente tipado e por mais que numero normal seja atualmente 1,
        // ^                  // ele pode se tornar um valor maior que "short" pode suportar! A unica forma é usar o casting,
        //casting              // que tamb[em não deve ser usado frequentemente;
    }
}
