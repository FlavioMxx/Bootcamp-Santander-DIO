package edu.flaviomxx.collections.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);   // Permite adicionar qualquer tipo de objeto. Porém pode diminuir a eficiencia por ter que ficar fazendo "cast".

        // Exemplo com Generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2"); //Apenas String.

        // Iterando sobre a conjunto com Generics
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }

        System.out.println("===========");

        // Iterando sobre a conjunto sem Generics(Precisa do cast)
        for (Object elemento : conjuntoSemGenerics) {
            String str = elemento.toString(); //(String) cast ñ deu certo com tipo Integer
            System.out.println(str);
        }
    }
}
