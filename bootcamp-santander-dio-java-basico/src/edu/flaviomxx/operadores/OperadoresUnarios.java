package edu.flaviomxx.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        //Unarios
        // Operador unarios sao aplicados juntamente com outro operador aritmetico. Eles realizam os trabalhos de incrementar, decrementar, inverter valors numericos e booleanos

        int numero = 5; // Por padrão ele já é um valor positivo, mas poderia ser repesentrado com um + na frente.
        System.out.println(-numero); // Posso definir também que um valor seja negativo, apenas indicando na frente dele;

        // Incremento de um valor por repetição
        numero = numero + 2; //Aqui eu redefini o valor de numero, porém apenas incrementamos, já que passamos o valor que ele já tinha + 2.

        numero++; //significa a mesma coisa que numero = numero + 1;
        numero--; //significa a mesma coisa que numero = numero - 1;

        // Negando valores booleanos
        boolean variavelTrue = true;
        System.out.println(!variavelTrue); // ! significa não, ou seja, NÃO é true.. se não é true, é FALSA;

        boolean variavelFalse = !variavelTrue;
        System.out.println(variavelFalse); // ! significa não, ou seja, NÃO é false.. se não é false, é TRUE;

        // Ternario
        //Operador que de forma resumida cria uma condição que escolhe um valor ou outro.
        //Sua sintaxe é:
        //Condição ? Condição verdadeira : Condição falsa

        int a, b;
        a = 5;
        b = 6;

        String c = a == b ? "true" : "false"; // Aqui eu digo, A é igual a B? (?)Se sim, imprime true (:)Se não, imprime false
        System.out.println(c);
    }
}
