package br.edu.flaviomxx.exceptions;

import br.edu.flaviomxx.message.Mensageria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ExceptionsTeste {

    @Test
    void jogarErroTeste() {
        Exceptions exceptions = new Exceptions();
        Mensageria mensageria = new Mensageria();
        assertThrows(RuntimeException.class, exceptions::jogarErro);
        assertDoesNotThrow(() -> mensageria.mandarSaudacoes("Flavio"));
    }
}