package edu.flaviomxx.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AbrindoContas {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.printf("Informacoes:\n Conta: %d\nTitular: %s\nSaldo: R$ %.1f", contaBancaria.numero, contaBancaria.titular, contaBancaria.saldo);
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) { // Pegadinha, tava escrito apenas Bancaria
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() { //Implementado para outro exercicio
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}