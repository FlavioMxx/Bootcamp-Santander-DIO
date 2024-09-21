package edu.flaviomxx.collections.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenericsExampleMap {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", "Valor 1"); // Funciona como chave valor
        mapaSemGenerics.put("Chave 2", 10);   // Permite adicionar qualquer tipo de objeto. Porém pode diminuir a eficiencia por ter que ficar fazendo "cast".

        // Exemplo com Generics
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20); //Apenas String, Integer.

        // Iterando sobre a conjunto com Generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println(String.format("Chave: %s, Valor: %d", chave , valor));
        }

        System.out.println("===========");

        // Iterando sobre a conjunto sem Generics(Precisa do cast)
        for (Object obj : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + " Valor: " + valor);
        }
    }
}
