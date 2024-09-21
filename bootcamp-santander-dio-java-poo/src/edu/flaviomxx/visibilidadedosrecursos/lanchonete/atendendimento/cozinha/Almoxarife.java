package edu.flaviomxx.visibilidadedosrecursos.lanchonete.atendendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    protected void entregarIngredientes() { // protected ou "default" torna o método/parametro visivel somente para classes que estão no mesmo pacote.
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() { // não escrever o nivel de visualização, torna um "default", ou seja, protected...visivel somente para classes que estão no mesmo pacote.
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}
