package edu.flaviomxx.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Relacionais
        //Operadores usados para efeitos de comparações, muito usado em estruturas de condição/repetição
        int numero1 = 1;
        int numero2 = 2;

        boolean resultado ;

        resultado = numero1 == numero2; // Numero 1 é IGUAL ao número 2?
        resultado = numero1 != numero2; // Numero 1 é DIFERENTE de numero 2?
        resultado = numero1 > numero2; // Numero 1 é MAIOR que o número 2?
        resultado = numero1 < numero2; // Numero 1 é MENOR que o número 2?
        resultado = numero1 >= numero2; // Numero 1 é MAIOR ou IGUAL ao número 2?
        resultado = numero1 <= numero2; // Numero 1 é MENOR ou IGUAL ao número 2?

        //Em casos de Objetos, podemos e DEVEMOS usar .equals
        String nomeUm = "Flavio";
        String nomeDois = new String("Flavio");


        resultado = nomeUm.equals(nomeDois);
        System.out.println(resultado);
    }
}
