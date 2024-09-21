package edu.flaviomxx.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!this.livros.isEmpty()) {
            for(Livro l : this.livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalorAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalorAnos = new ArrayList<>();

        if(!this.livros.isEmpty()) {
            for (Livro l : this.livros) {
                if (l.getAnoPublicacao() >= anoInicial
                        && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalorAnos.add(l);
                }
            }
        }

        return livrosPorIntervalorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!this.livros.isEmpty()) {
            for (Livro l : this.livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        Livro livro1 = new Livro("livro1", "Maria Cecilia", 2024);
        Livro livro2 = new Livro("livro2", "Jullya", 2002);
        Livro livro3 = new Livro("livro3", "Flavio", 2000);
        Livro livro4 = new Livro("livro3", "Maria Cecilia", 2024);

        System.out.println(catalogo.livros);

        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);
        catalogo.adicionarLivro(livro3);
        catalogo.adicionarLivro(livro4);

        System.out.println(catalogo.livros);

        System.out.println(catalogo.pesquisarPorAutor("maria cecilia"));
        System.out.println(catalogo.pesquisarPorTitulo("livro3"));
        System.out.println(catalogo.pesquisarPorIntervalorAnos(2000, 2002));

    }
}
