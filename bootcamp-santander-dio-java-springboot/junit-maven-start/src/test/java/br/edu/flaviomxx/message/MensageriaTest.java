package br.edu.flaviomxx.message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MensageriaTest {

    public static final String MENSAGEM = "Olá, ";
    public static final String NOME = "Maria Cecília";

    @Test
    void mandarSaudacoes() {
        Mensageria mensageria = new Mensageria();
        assertEquals(MENSAGEM + NOME, mensageria.mandarSaudacoes(NOME));
    }
}