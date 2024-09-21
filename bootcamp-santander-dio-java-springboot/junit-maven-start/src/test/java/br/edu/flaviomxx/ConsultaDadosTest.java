package br.edu.flaviomxx;


import org.junit.jupiter.api.*;

import static br.edu.flaviomxx.database.BancoDeDados.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultaDadosTest {

    @BeforeAll //Roda antes de tudo
    static void BeforeAll() {
        adicionarDados();
    }
    @BeforeEach //Roda antes de cada teste
    void setUp() {
        iniciarConexao();
    }

    @AfterAll //Roda depois de tudo
    static void AfterAll() {
        removerDados();
    }

    @AfterEach //Roda depois de cada teste
    void closeAll() {
        fecharConexao();
    }

    @Test
    void validarDadosRetorno() {
        assertTrue(true);
    }
}
