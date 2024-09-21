package edu.flaviomxx.escopos;

public class EscopoVariavel {

    //Escopo pode ser entendido como ambiente onde uma variavel pode ser acessada. Em Java, o escopo vai de acordo com o bloco onde ela foi decladada.
    //Em uma Classe, podemos visualizar a diferenca de escopo, os atributos sao declarados no corpo principal, sendo assim acessivel por todos os metodos - escopo global

    //public class Conta

        //Variavel da classe Conta
        double saldo = 10.0;

        public void sacar(double valor) {
            //variavel local de metodo
            double novoSaldo = saldo - saldo;
        }

        public void imprimirSaldo() {
            //disponivel em toda Classe
            System.out.println(saldo);

            //System.out.println(novoSaldo); ERRO!//somente o metodo sacar conhece essa variavel
        }

        public double calcularDividaExponencial() {
            //variavel local de metodo
            double valorParcela = 50.0;
            double valorMontante = 0.0;

                for(int x=1; x<=5; x++) { //x variavel de escopo do laco de repeticao
                    //esta variavel sera reiniciada a cada execucao
                    double valorCalculado = valorParcela * x;
                    valorMontante =+ valorCalculado;
                }

                //escopo de fluxo
                //x e valorCalculado nunca estarao disponiveis fora do laco/fluxo

            return valorMontante;
        }
}
