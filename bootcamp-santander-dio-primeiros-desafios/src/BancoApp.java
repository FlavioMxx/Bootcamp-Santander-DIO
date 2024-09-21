import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, periodo);

        String formato = "###0.00";
        DecimalFormat df = new DecimalFormat(formato);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

    public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int período) {
        double juros = 0.0;
        double valorFinal = valorInicial;

        for(int i = 1; i <= período; i++) {
            juros = valorFinal * taxaJuros;
            valorFinal += juros;
        }

        return valorFinal;
    }
}