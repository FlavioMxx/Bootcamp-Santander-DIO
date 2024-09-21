import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int number;
        String agency;
        String clientName;
        double saldo;

        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor digite o numero da conta: ");
        number = sc.nextInt();

        System.out.println("Por favor digite o numero da agência: ");
        agency = sc.next();

        System.out.println("Por favor digite o seu nome: ");
        clientName = sc.next();

        System.out.println("Por favor digite o saldo da conta: ");
        saldo = sc.nextDouble();


        System.out.println("===================================");
        System.out.println("Olá "
                .concat(clientName)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é "
                        .concat(agency)
                        .concat(", conta No").concat(String.valueOf(number))
                        .concat(" e seu saldo R$").concat(String.valueOf(saldo))
                        .concat(" já está disponível!")));
    }
}
