package edu.flaviomxx.tiposevariaveis;

public class TipoVariaveis {
    public static void main(String[] args) {
        int numero = 1;
        numero = 2; // Uma variável pode ter seu valor alterado frequentemente dentro de um programa, desde que sempre obedeça seu tipo;

        //Caso queira que a "Variavel" NUNCA seja mudada, ou seja, fique constante usamos o final no inicio de sua declaração...
        //Por convenção também escrevemos seu nome sempre em caixa alta e separando os compostos por underline
        final double PI = 3.14; //Temos PI como exemplo, ele nunca poderá ser alterado, PI é 3.1415.... e pronto, náo podemos dizer que PI é 4.x... Entáo conseguimos travar essas mudanças com o final;

    }
}
