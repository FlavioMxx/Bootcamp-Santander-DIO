package edu.flaviomxx.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Aceita um tipo T e retorna um boolean
public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

//        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
//
//        palavras.stream()
//                .filter(maisDeCincoCaracteres)
//                .forEach(System.out::println);

//        palavras.stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        return s.length() > 5;
//                    }
//                })
//                .forEach(System.out::println);

        palavras.stream()
                .filter(string -> string.length() > 5)
                .forEach(System.out::println);
    }
}
