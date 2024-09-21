package edu.flaviomxx.controledefluxos.estruturacondicional.condicaocomposta;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception{
        double saldo = 25.0;
        double valorSolicitado = 16.0;

        //Um if tem a estrutura -
        // if(condicao) {
        // implementacao
        // }
        // ou
        //if(condicao)
        //  implementadao ----Indentada

        if (valorSolicitado < saldo) { //Se (condição de decisão for verdade)
            saldo -= valorSolicitado; //Faça - implementação de codigo
            System.out.println("Novo saldo: R$" + saldo);
        } else { //senão
            System.out.println("R$" + saldo);
        }
    }
}
