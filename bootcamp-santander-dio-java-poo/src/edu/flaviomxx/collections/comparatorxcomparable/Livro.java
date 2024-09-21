package edu.flaviomxx.collections.comparatorxcomparable;

import java.util.Comparator;

//Uma Classe Livro implements Comparable
public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    // Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Usado para ordenar livros por ano

    @Override
    public int compareTo(Livro livro) {
        return titulo.compareTo(livro.titulo);
    }

    // Classe para comparar Livro por autor
    static class ComparaAutor implements Comparator<Livro> {

        @Override
        public int compare(Livro livro1, Livro livro2) {
            return livro1.getAutor().compareTo(livro2.autor);
        }
    }

    // Classe para comparar Livro por ano
    static class CompararAno implements Comparator<Livro> {

        @Override
        public int compare(Livro livro1, Livro livro2) {
            if (livro1.getAno() < livro2.getAno())
                return -1;
            if (livro1.getAno() > livro2.getAno())
                return 1;
            else
                return 0;
        }
    }

    static class CompararAnoAutorTitulo implements Comparator<Livro> {

        @Override
        public int compare(Livro livro1, Livro livro2) {
            //int ano = compare(livro1, livro2);
            int ano = Integer.compare(livro1.getAno(), livro2.getAno()); //Substitui o método acima;

            if(ano != 0)
                return ano;

            int autor = livro1.getAutor().compareTo(livro2.getAutor());
            if (autor != 0)
                return autor;

            return livro1.titulo.compareTo(livro2.getTitulo());
        }
    }
}
