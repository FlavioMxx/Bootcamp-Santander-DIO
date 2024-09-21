package edu.flaviomxx.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println("Contatos: ");
        System.out.println(contatos.toString().replace("[", "").replace("]", ""));
    }

    public void pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        if (contatosPorNome.isEmpty()) {
            System.out.println("Nome não encontrado na agenda");
        } else {
            System.out.println(contatosPorNome.toString().replace("[", "").replace("]", ""));
        }
    }

    public void atualizarNumeroContato(String nome, String  novoTelefone) {
        contatos.forEach(contato -> {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(novoTelefone);
            }
        });
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Flavio", "11940028922");
        agendaContatos.adicionarContato("Jullya", "11989224002");
        agendaContatos.adicionarContato("Maria", "11987654321");
        agendaContatos.adicionarContato("Cecilia", "11912345678");
        agendaContatos.adicionarContato("Flavio Junior", "11940028922");
        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("Flavio");

        agendaContatos.atualizarNumeroContato("jullya", "11970707070");
        agendaContatos.exibirContatos();
    }
}
