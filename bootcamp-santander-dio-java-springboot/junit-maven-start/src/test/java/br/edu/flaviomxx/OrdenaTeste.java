package br.edu.flaviomxx;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenaTeste {

    @Test
    @Order(2)
    void validaFluxoA() {
        assertTrue(true);
    }

    @Test
    @Order(1)
    void validaFluxoB() {
        assertTrue(true);
    }

    @Test
    @Order(3)
    void validaFluxoC() {
        assertTrue(true);
    }
}
