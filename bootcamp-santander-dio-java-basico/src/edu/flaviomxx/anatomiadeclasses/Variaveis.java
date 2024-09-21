package edu.flaviomxx.anatomiadeclasses;

public class Variaveis {
    public static void main(String[] args) { // Método especial capaz de iniciar/executar.

        // Seu nome deve conter apenas letras, underline, cifrão ou numeros.
        // Nunca iniciar seu nome com número;
        // Não ter espaços;
        // Nome deve ser único dentro do seu escopo
        // Não se deve usar acentos e/ou espaços ao criar o nome da variável;

        //Estrutura de uma variável:
        // Tipo nomeBemDefinido = valor -- valor é opcional(N/A a CONSTANTES)!

        // Nome de variável sempre inicia com letra minuscula mas em casos compostos deve ser maiúscula a partir de sua segunda 'palavra';
        String minhaVariavel = "Minha Variável"; //minhaVariavel vale "Minha Variável¨;
        minhaVariavel = "Minha Variável Alterada"; // Agora minhaVariavel vale "Minha Variável Alterada¨;


        // Nome de variável quando escrita completamente em maiúscula, se torna uma constante... ou seja, esse valor não pode ser mudado;
        // Como tudo deve ser maiúsculo, em caso de nome composto, usamos o underline para separa-las
        final String CONSTANTE = "Constante";  // Podemos usar 'final' para que seja travado alguma tentativa de alteração;
        // CONSTANTE = "ERRO"; - Isso me retorna um erro, principalmente por ser final, já que apenas deixar tudo maiúsculo é uma convernção, mas não impede ninguem de mexer;
    }
}