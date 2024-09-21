package edu.flaviomxx.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Aritmetico '+', '-', '*' e '/'.
        // Operador aritmetico é utilizado para realizar operações matemáticas.

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 17 / 3; // Em casos que eu vou ter um resultado com casas decimais, como foi definido como int, só vou receber o valor inteiro.
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        //O operador '+' quando usado em tipos String(texto) tem o papel de juntar as palavras
        String primeiroNome = "Maria";
        String segundoNome = " Cecilia";
        String nomneCompleto = primeiroNome + segundoNome;
        System.out.println(nomneCompleto);

        //Qual resultado abaixo? - DEBUG

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; // resultado = 31 -- Ele somou os 3 primeiros valores e concatenou com o ultimo... 1+1+1=3 + String 1= 31;

        concatenacao = 1 + "1" + 1 + 1; // resultado = 1111 --Como o segundo valor é uma String ele aprende rápido que seu trabalho é concatenar;

        concatenacao = 1 + "1" + 1 + "1"; // resultado = 1111 --Como o segundo valor é uma String ele aprende rápido que seu trabalho é concatenar;

        concatenacao = "1" + 1 + 1 + 1; // resultado = 1111 --Como o primeiro valor é uma String ele aprende rápido que seu trabalho é concatenar;

        concatenacao = "1" + (1 + 1 + 1); // resultado = 13 --Como o primeiro valor é uma String ele aprende rápido que seu trabalho é concatenar, porem ele concatena com o resultado de dentro do parenteses;
    }
}
