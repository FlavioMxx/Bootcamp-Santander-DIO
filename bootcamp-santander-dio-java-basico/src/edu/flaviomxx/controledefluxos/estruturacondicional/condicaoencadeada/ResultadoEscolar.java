package edu.flaviomxx.controledefluxos.estruturacondicional.condicaoencadeada;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 7) { //Se (condição de decisão for verdade)
            System.out.println("Aprovado"); //Faça - implementação de codigo
        } else if (nota >= 5){ // senão se(condição de decisão for verdade) --Pode existir "infinitos" senão se
            System.out.println("Recuperação"); //Faça - implementação de codigo
        } else { //senão
            System.out.println("Reprovado"); //Faça - implementação de codigo
        }
    }
}
