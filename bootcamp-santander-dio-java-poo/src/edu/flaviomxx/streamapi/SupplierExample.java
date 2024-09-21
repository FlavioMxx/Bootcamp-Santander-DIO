package edu.flaviomxx.streamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Recebe nenhum argumento e retorna T
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)";

//        List<String> listaSaudacoes = Stream.generate(
//                        new Supplier<String>() {
//                            @Override
//                            public String get() {
//                                return "Olá, seja bem vindo(a)";
//                            }
//                        }
//                )
//                .limit(5)
//                .toList();

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)")
                        .limit(5)
                        .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
