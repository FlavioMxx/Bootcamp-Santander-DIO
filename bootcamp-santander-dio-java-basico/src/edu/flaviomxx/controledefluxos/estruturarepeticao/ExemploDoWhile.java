package edu.flaviomxx.controledefluxos.estruturarepeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        //estrutura do controle de fluxo while

        /*
         * do { faça --- Independente da expressao booleana for falsa desde o inicio, esse bloco sera executado pelo menos uma vez!
         *      /implementacao do codigo
         * } while(expressao booleana de validacao);
         */

        System.out.println("Discando...");

            do {
                //executa repetidas vezes até que alguem atenda
                System.out.println("Tocando");
            } while(tocando());

        System.out.println("Alô?");
    }

    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(5) == 1;
        System.out.println("Atendeu? " + (atendeu == true ? "sim" : "não"));
        return !atendeu;
    }
}
