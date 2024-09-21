package edu.flaviomxx.controledefluxos.estruturarepeticao;

public class ExemploFor {
    public static void main(String[] args) {
        // estrutura do controle de fluxo for

        /*
         *   for(bloco de inicializacao; expressao de validacao; bloco de incremento){
         *      //comando que será executado até que a expressão de validacao se torne falsa
         *  }
         */

        //  para variavel       ; enquanto verdadeira; incremente variavel
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + (carneirinhos == 1 ? " carneirinho" : " carneirinhos")); //Implementacao
        }

        System.out.println("Maria Cecília dormiu!");
    }
}
