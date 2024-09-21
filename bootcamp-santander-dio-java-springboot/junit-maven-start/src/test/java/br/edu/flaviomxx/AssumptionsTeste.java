package br.edu.flaviomxx;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioFlavio() {
        Assumptions.assumeTrue("flavio-dev".equals(System.getenv("USER"))); //Realiza teste somente se a condição for verdadeira
    }
}
