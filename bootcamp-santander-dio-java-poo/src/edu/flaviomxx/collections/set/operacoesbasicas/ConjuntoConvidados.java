package edu.flaviomxx.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
        contarConvidados();
    }

    public void removerConvidadoPeloCodigoConvite(int codigoConvite) {
        convidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
        contarConvidados();
    }

    private void contarConvidados() {
        System.out.printf("Há %d convidado(s)\n", convidados.size());
    }

    public void exibirConvidados() {
        /*System.out.println("Nome dos convidados: "); //Como resolvi caso precise só precisar do nome, poderia ser definido no toString() tbm.
        for(Convidado c : convidados) {
            System.out.println(c.getNome());
        }*/

        System.out.println("Convidados: " + convidados.toString().replace("[", "").replace("]", ""));
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Maria", 90124738);
        conjuntoConvidados.adicionarConvidado("Cecília", 90124739);
        conjuntoConvidados.adicionarConvidado("Jullya", 90124740);
        conjuntoConvidados.adicionarConvidado("Flavio", 90124740);
        System.out.println("================================");

        conjuntoConvidados.removerConvidadoPeloCodigoConvite(90124738);

        conjuntoConvidados.adicionarConvidado("Maria", 90124738);
        conjuntoConvidados.adicionarConvidado("Flavio", 90124741);

        conjuntoConvidados.exibirConvidados();
    }
}
