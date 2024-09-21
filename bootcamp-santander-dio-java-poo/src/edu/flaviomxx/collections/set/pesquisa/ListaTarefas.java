package edu.flaviomxx.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);

        System.out.printf("Tarefa '%s' adicionada!\n", tarefa.getDescricao());
    }

    private void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
        System.out.printf("Tarefa '%s' removida!\n", tarefa.getDescricao());
    }

    public void exibirTarefa() {
        System.out.println("Tarefas: ");
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista!");
        } else {
            System.out.println(tarefas.toString().replace("[", "").replace("]", ""));
        }

    }

    public void contarTarefas() {
        System.out.printf("Existem %d tarefas.\n", tarefas.size());
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        if (tarefasConcluidas.isEmpty()) {
            System.out.println("Não há tarefas concluídas.");
        } else {
            System.out.println(tarefasConcluidas.toString().replace("[", "").replace("]", ""));
        }
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        if (tarefasPendentes.isEmpty()) {
            System.out.println("Não há tarefas concluídas.");
        } else {
            System.out.println(tarefasPendentes.toString().replace("[", "").replace("]", ""));
        }
    }

    public void marcarTarefaConcluida(Tarefa tarefa) {
        for (Tarefa t : tarefas) {
            if (t.equals(tarefa)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(Tarefa tarefa) {
        for (Tarefa t : tarefas) {
            if (t.equals(tarefa)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }




    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefa();
        System.out.println("==========================");

        Tarefa t1 = new Tarefa("Aprender Java completo", true);
        Tarefa t2 = new Tarefa("Aprender Spring completo", false);
        Tarefa t3 = new Tarefa("Aprender UT completo", true);

        listaTarefas.adicionarTarefa(t1);
        listaTarefas.exibirTarefa();
        listaTarefas.contarTarefas();
        System.out.println("==========================");

        listaTarefas.removerTarefa(t1);
        listaTarefas.exibirTarefa();
        System.out.println("==========================");

        listaTarefas.adicionarTarefa(t1);
        listaTarefas.adicionarTarefa(t2);
        listaTarefas.adicionarTarefa(t3);

        listaTarefas.exibirTarefa();

        listaTarefas.contarTarefas();
        listaTarefas.obterTarefasConcluidas();
        System.out.println("==========================");
        listaTarefas.obterTarefasPendentes();
        System.out.println("==========================");

        listaTarefas.marcarTarefaConcluida(t2);
        listaTarefas.obterTarefasConcluidas();
        System.out.println("==========================");

        listaTarefas.marcarTarefaPendente(t3);
        listaTarefas.obterTarefasPendentes();
        System.out.println("==========================");

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefa();
    }
}
