package edu.flaviomxx.collections.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaContatos {
    private Map<String, String> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public Map<String, String> getContatos() {
        return contatos;
    }

    public void setContatos(Map<String, String> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContatoPorNome(String nome) {
      contatos.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public void pesquisarPorNome(String nome) {
        System.out.println(contatos.get(nome));
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.exibirContatos();

        ac.adicionarContato("Flavio", "11940028922");
        ac.adicionarContato("Junior", "11989224002");
        ac.adicionarContato("Maria", "11992400282");
        ac.adicionarContato("Cecilia", "11940922028");
        ac.adicionarContato("Jullya", "11924029208");
        ac.adicionarContato("Merli", "11984200292");
        ac.adicionarContato("Merli Milani", "11990208224");

        ac.exibirContatos();

        ac.removerContatoPorNome("Junior");
        ac.exibirContatos();

        ac.pesquisarPorNome("Merli");
    }
}

