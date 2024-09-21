package edu.flaviomxx.collections.map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agenda.put(data, new Evento(nome, atracao));
    }

    public TreeMap<LocalDate, Evento> exibirAgenda() {
        TreeMap<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agenda);
        return agendaOrdenada;
    }

    public Evento obterProximoEvento() {
        Evento eventoProximo = null;
        LocalDate dataProxima = LocalDate.MAX;

        for (Map.Entry<LocalDate, Evento> entry : agenda.entrySet()) {
            LocalDate localDate = entry.getKey();
            Evento evento = entry.getValue();

            if(localDate.isBefore(dataProxima)) {
                dataProxima = localDate;
                eventoProximo = evento;
            }
        }
        return eventoProximo;
    }

    public static void main(String[] args) {
        AgendaEventos ae = new AgendaEventos();

        ae.exibirAgenda();
        System.out.println("==================");

        ae.adicionarEvento(LocalDate.now().plusDays(7L), "Terminar Bootcamp DIO java + angular Santander", "Flavio Milani");
        ae.adicionarEvento(LocalDate.now().plusDays(12L), "Iniciar BootCamp Java INTER", "Flavio Milani");
        ae.adicionarEvento(LocalDate.now(), "Terminar Módulo de collections java", "Flavio Milani");
        ae.adicionarEvento(LocalDate.now().plusDays(1L), "Iniciar novo modulo bootcamp", "Flavio Milani");
        ae.adicionarEvento(LocalDate.now().plusDays(5L), "Terminar projeto de estudos", "Flavio Milani");

        System.out.println(ae.exibirAgenda());
        System.out.println("==================");

        System.out.println(ae.obterProximoEvento());

    }
}
