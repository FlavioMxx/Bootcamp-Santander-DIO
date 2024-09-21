package edu.flaviomxx.controledefluxos.estruturarepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        //estrutura do controle de fluxo while

        /*
         * while (expressao booleana de validacao) {--- enquanto for verdade
         *       faca - implementacao
         *
         *      na implementaca é OBRIGATORIA uma expressao torne a validacao falsa em algum momento, se nao causara um loop infinito
         * }
         */

        double mesada = 50.0;

        while(mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada; //Validacao unica apenas para exemplo, quando saldo insuficiente ele "troca" para um doce do valor que possui.

            System.out.println("Doce de valor: R$" + valorDoce + "Adicionado no carrinho!");
            mesada -= valorDoce; // expressao que torna a validacao cada vez mais perto do false
        }

        System.out.println("Mesada: R$" + mesada);
        System.out.println("Joãozinho gastou tudo em doces!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
