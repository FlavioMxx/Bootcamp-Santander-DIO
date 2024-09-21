package br.edu.flaviomxx.database;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void fecharConexao(){
        LOGGER.info("Fechou conexão");
    }

    public static void adicionarDados(){
        LOGGER.info("Adicionou dados");
    }

    public static void removerDados(){
        LOGGER.info("Removeu dados");
    }
}
