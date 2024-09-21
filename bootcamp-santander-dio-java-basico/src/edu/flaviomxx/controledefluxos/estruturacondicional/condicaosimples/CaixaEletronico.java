package edu.flaviomxx.controledefluxos.estruturacondicional.condicaosimples;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception{
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        //Um if tem a estrutura -
        // if(condicao) {
        // implementacao
        // }
        // ou
        //if(condicao)
        //  implementadao ----Indentada

        if (valorSolicitado < saldo)  //Se (condição de decisão for verdade)
            saldo -= valorSolicitado; //Faça - implementação de codigo

        System.out.println(saldo);

    }
}
