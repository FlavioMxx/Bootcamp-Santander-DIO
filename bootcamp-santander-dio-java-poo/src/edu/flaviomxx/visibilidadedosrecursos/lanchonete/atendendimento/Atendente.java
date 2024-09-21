package edu.flaviomxx.visibilidadedosrecursos.lanchonete.atendendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha(); // Um método pode chamar outros métodos, inclusive quando são privados.
        System.out.println("SERVINDO MESA");
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    void trocarGas() { // não escrever o nivel de visualização, torna um "default", ou seja, protected...visivel somente para classes que estão no mesmo pacote.
        System.out.println("ATENDENTE TROCANDO O GAS");
    }

    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
