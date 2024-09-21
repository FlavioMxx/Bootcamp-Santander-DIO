package edu.flaviomxx.collections.list.operacoesbasicas.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        this.tarefas.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String descricao) {
       this.tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao)); //Como eu resolvi

       //Como o instrutor resolveu
       /*
       List<Tarefa> tarefasRemover = new ArrayList<>();

       for(Tarefa t : tarefas) {
           if (t.getDescricao().equalsIgnoreCase(descricao)) {
               tarefasRemover.add(t);
           }

       }
       tarefas.removeAll(tarefasRemover);
       */
    }

    public Integer obterNumeroTotalTarefas() {
        return this.tarefas.size();
    }

    public List<String> obterDescricoesTarefas() {

        List<String> descricoes = new ArrayList<>();

        for (Tarefa desc : this.tarefas) {
            descricoes.add(desc.getDescricao());
        }

        return descricoes;

        //Como o instrutor resolveu - criou toString() - Metodo deve ser void
        //System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println(lista.obterDescricoesTarefas());
        System.out.println(lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Tarefa1");
        lista.adicionarTarefa("Tarefa2");
        lista.adicionarTarefa("Tarefa3");
        lista.adicionarTarefa("Tarefa4");
        lista.adicionarTarefa("Tarefa5");
        lista.adicionarTarefa("Tarefa4");

        System.out.println(lista.obterDescricoesTarefas());
        System.out.println(lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Tarefa4");

        System.out.println(lista.obterDescricoesTarefas());
        System.out.println(lista.obterNumeroTotalTarefas());
    }
}
