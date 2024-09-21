package edu.flaviomxx.enums;

import static edu.flaviomxx.enums.EstadoBrasileiro.SAO_PAULO;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(String.format("%s - %s", e.getSigla(), e.getNome()));
        }

        // EstadoBrasileiro eb = EstadoBrasileiro.MARANHAO;
        EstadoBrasileiro eb = SAO_PAULO; //Um enum, por ser estatico por padrão, me permite o seu uso sem que eu necessite de sua "classe" para usar;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
