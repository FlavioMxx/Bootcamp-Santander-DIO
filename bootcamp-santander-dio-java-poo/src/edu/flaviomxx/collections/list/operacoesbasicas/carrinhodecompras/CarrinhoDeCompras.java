package edu.flaviomxx.collections.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) { //Poderia receber o obj
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public void calcularValorTotal() {
        double valor = 0;
        for(Item i : itens) {
            double valorTotItem = i.getPreco() * i.getQuantidade();

            valor += valorTotItem;
        }

        mostraValorTotal(valor);
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    private void mostraValorTotal(double valor) {
        System.out.printf("Valor total: R$ %.2f%n", valor);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();

        carrinho.adicionarItem("Coca-Cola", 9.0, 1);

        carrinho.exibirItens();

        carrinho.removerItem("coca-cola");

        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        carrinho.adicionarItem("Coca-Cola", 9.0, 2);
        carrinho.adicionarItem("Detergente", 2.30, 6);
        carrinho.adicionarItem("Fralda", 32.0, 1);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
