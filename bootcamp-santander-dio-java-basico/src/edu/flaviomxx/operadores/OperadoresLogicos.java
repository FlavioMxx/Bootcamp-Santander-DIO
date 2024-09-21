package edu.flaviomxx.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Representam o recurso que nos permite criar expressões lógicas a partir de duas ou mais expressões

        boolean condicao1 = true;
        boolean condicao2 = false;

        String resultado;

        resultado = condicao1 && condicao2 ? "Faça isso" : "Faça aquilo"; // Se a condicao1 E condicao2 forem verdadeiras...
        resultado = condicao1 || condicao2 ? "Faça isso" : "Faça aquilo"; // Se a condicao1 OU condicao2 for verdadeira...
    }
}
