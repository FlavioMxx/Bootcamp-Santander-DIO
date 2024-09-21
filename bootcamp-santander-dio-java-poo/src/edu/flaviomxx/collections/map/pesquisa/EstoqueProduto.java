package edu.flaviomxx.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    Map<Integer, Produto> estoque;

    public EstoqueProduto() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Integer codigo, String nome, int quantidade, double preco) {
        estoque.put(codigo, new Produto(nome, quantidade, preco));
        System.out.printf("%s adicionado ao estoque!\n", estoque.get(codigo));
    }

    public void exibirProdutos() {
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
            Integer integer = entry.getKey();
            Produto produto = entry.getValue();
            double precoPorProduto = 0;

            precoPorProduto = produto.getPreco() * produto.getQuantidade();

            total += precoPorProduto;
        }
    return total;
    }

    public Produto obterProdutoMaisCaro() {
        Double maisCaro = 0.0;
        Integer produtoCaro = 0;

        for(Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
            Integer integer = entry.getKey();
            Produto produto = entry.getValue();

            if(produto.getPreco() > maisCaro) {
                maisCaro = produto.getPreco();
                produtoCaro = integer;
            }
        }
        return estoque.get(produtoCaro);
    }

    public Produto obterProdutoMaisBarato() {
        Double maisBarato = obterProdutoMaisCaro().getPreco();
        Integer produtoBarato = 0;

        for(Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
            Integer integer = entry.getKey();
            Produto produto = entry.getValue();

            if (produto.getPreco() < maisBarato) {
                maisBarato = produto.getPreco();
                produtoBarato = integer;
            }
        }
        return estoque.get(produtoBarato);
    }

    public Produto obterProdutoMaiorQuantidade() {
        Integer maiorQuantidade = null;
        int quantidade = 0;

        for (Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
            Integer integer = entry.getKey();
            Produto produto = entry.getValue();

            if(produto.getQuantidade() > quantidade) {
                quantidade = produto.getQuantidade();
                maiorQuantidade = integer;
            }
        }

        return estoque.get(maiorQuantidade);
    }

    public double obterValorTotalProdutoMaiorQuantidade() {
        return obterProdutoMaiorQuantidade().getQuantidade() * obterProdutoMaiorQuantidade().getPreco();
    }

    public static void main(String[] args) {
        EstoqueProduto ep = new EstoqueProduto();

        ep.exibirProdutos();

        ep.adicionarProduto(1980937, "Coca-Cola", 18, 11.99);
        ep.adicionarProduto(2348723, "Farinha de rosca", 38, 5.99);
        ep.adicionarProduto(1278342, "Caixa Bombom", 28, 9.99);
        ep.adicionarProduto(8247944, "Bolacha agua e sal", 58, 4.59);
        ep.adicionarProduto(4298190, "Agua sanitaria", 29, 2.99);
        ep.adicionarProduto(3678541, "Suco 1L de caixinha", 25, 7.69);

        ep.exibirProdutos();
        System.out.println("----------------------------------------------");

        System.out.printf("Valor total do estoque R$%.2f\n", ep.calcularValorTotalEstoque());
        System.out.println("----------------------------------------------");

        System.out.println(ep.obterProdutoMaisCaro());

        System.out.println(ep.obterProdutoMaisBarato());
        System.out.println("----------------------------------------------");

        System.out.printf("O produto mais abundante no estoque é %s e o valor total dele é de R$%.2f", ep.obterProdutoMaiorQuantidade(), ep.obterValorTotalProdutoMaiorQuantidade());
    }
}
