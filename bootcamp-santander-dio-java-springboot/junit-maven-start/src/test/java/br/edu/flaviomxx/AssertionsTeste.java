package br.edu.flaviomxx;

import br.edu.flaviomxx.message.Mensageria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};
        int[] terceiroLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, terceiroLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoEhNulo() {
        Mensageria mensageria = null;
        assertNull(mensageria);

        Mensageria mensageria1 = new Mensageria();
        assertNotNull(mensageria1);
    }
}
