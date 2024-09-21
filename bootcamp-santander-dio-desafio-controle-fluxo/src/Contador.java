import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero um: ");
        int parametroUm = sc.nextInt();

        System.out.println("Numero dois: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }

    public static void contar(int parametroUm, int parametroDois)  throws  ParametrosInvalidosException{

        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;

            for(int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }
}
