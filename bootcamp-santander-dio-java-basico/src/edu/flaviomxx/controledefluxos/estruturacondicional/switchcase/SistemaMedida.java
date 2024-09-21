package edu.flaviomxx.controledefluxos.estruturacondicional.switchcase;

public class SistemaMedida {
    public static void main(String[] args) {
        char sigla = 'A';

        switch (sigla) { //Para a nossa(variavel)
            case 'P': //caso variavel == P
                System.out.println("Pequeno"); //Faça isso - implementação
                break; //Pare a execução do switch, pois caso tenha mais casos abaixo, ele "cai" em todos eles sendo verdadeiros ou não... caso esse satisfaça o pedido
            case 'M':
                System.out.println("Médio");
                break;
            case 'G':
                System.out.println("Grande");
                break;
            default: //Caso nenhuma condição seja satisfeita, temos a opção padrão
                System.out.println("Indefinido");
        }
    }
}
