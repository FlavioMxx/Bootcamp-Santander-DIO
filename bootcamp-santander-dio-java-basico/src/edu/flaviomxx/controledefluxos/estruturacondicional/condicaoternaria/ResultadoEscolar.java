package edu.flaviomxx.controledefluxos.estruturacondicional.condicaoternaria;

public class ResultadoEscolar {
    public static void main(String[] args) {

        //Cenario 1
        int nota = 3;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

/*======================================================================================*/

        //Cenario 2
        resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
    }
}
