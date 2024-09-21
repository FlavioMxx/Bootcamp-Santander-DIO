package edu.flaviomxx.collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos); //TreeSet verifica que temos um comparable e organiza para nós
        System.out.println(produtosPorNome.toString().replace("[", "").replace("]", ""));
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new CompararPreco());
        produtosPorPreco.addAll(produtos);

        System.out.println(produtosPorPreco.toString().replace("[", "").replace("]", ""));
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto1", 1, 15.0, 5);
        cadastroProdutos.adicionarProduto("Produto7", 4, 17.0, 10);
        cadastroProdutos.adicionarProduto("Produto4", 6, 11.0, 51);
        cadastroProdutos.adicionarProduto("Produto5", 10, 4.0, 15);

        System.out.println(cadastroProdutos.produtos.toString().replace("[", "").replace("]", ""));

        cadastroProdutos.exibirProdutosPorNome();

        cadastroProdutos.exibirProdutosPorPreco();
    }
}
