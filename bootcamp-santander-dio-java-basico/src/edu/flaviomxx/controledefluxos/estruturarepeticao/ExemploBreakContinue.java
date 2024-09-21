package edu.flaviomxx.controledefluxos.estruturarepeticao;

import java.util.Random;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for(int numero = 1; numero <= 5; numero++) {
            if(numero == 3)
                break; //Se condicao for verdadeira, ele pula pra fora do for

            System.out.println(numero);
        }

        System.out.println("-");

        for(int numero = 1; numero <= 5; numero++) {
            if(numero == 3)
                continue; //Se condicao for verdadeira, ele volta para uma nova iteracao, "cancelando" a atuacao deste instante

            System.out.println(numero);
        }
    }
}
