package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos =  {
                "Junior",
                "Jullya",
                "Maria",
                "Cecilia",
                "Vincente"
        };

        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato) {
       int tentativas = 1;
       boolean continuarTentando = true;
       boolean atendeu = false;

       do {
        atendeu = atender();
        continuarTentando = !atendeu;

        if (continuarTentando) {
            tentativas++;
        } else {
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }
       } while(continuarTentando && tentativas < 3);

       if (atendeu) {
           System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NA " + tentativas + "a TENTATIVA");
       } else {
           System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + ", NUMERO DE MAXIMO DE TENTATIVAS " + tentativas + " REALIZADAS");
       }
    }

    public static boolean atender() {
        return new Random().nextInt(1, 3) == 1;
    }

    public static void imprimirSelecionados() {
        String[] candidatos =  {
                "Junior",
                "Jullya",
                "Maria",
                "Cecilia",
                "Vincente"
        };

        System.out.println("Imprimindo candidatos informando o indice do elemento");

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de No" + (i+1) + " é o(a) " + candidatos[i]);
        }

        System.out.println("Forma abreviada usando foreach");

        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado foi: " + candidato);
        }
    }

    public static void selecaoCandidatos() {
        double salarioBase = 2000.0;
        String[] candidatos =  {
                "Junior",
                "Jullya",
                "Maria",
                "Cecilia",
                "Vincente",
                "Merli",
                "Flavio",
                "Gustavo",
                "Joselaine",
                "Pedro"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicita um salario de R$" + salarioPretendido);

            if (valorPretendido() <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }


            candidatoAtual++;
        }
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}