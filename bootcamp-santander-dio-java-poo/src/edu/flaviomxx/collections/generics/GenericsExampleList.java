package edu.flaviomxx.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);   // Permite adicionar qualquer tipo de objeto. Porém pode diminuir a eficiencia por ter que ficar fazendo "cast".

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2"); //Apenas String.

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        System.out.println("===========");

        // Iterando sobre a lista sem Generics(Precisa do cast)
        for (Object elemento : listaSemGenerics) {
            String str = elemento.toString(); //(String) cast ñ deu certo com tipo Integer
            System.out.println(str);
        }
    }
}
