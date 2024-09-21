package edu.flaviomxx.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Recebe argumento T e retorna um resultado R
public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//        Function<Integer, Integer> dobrar = numero -> numero * 2;
//
//        List<Integer> numerosDobrados = numeros.stream()
//                .map(dobrar)
//                .toList();

//
//        List<Integer> numerosDobrados = numeros.stream()
//                .map(new Function<Integer, Integer>() {
//                  @Override
//                    public Integer apply(Integer integer) {
//                        return integer * 2;
//                  }
//                })
//                .toList();


        List<Integer> numerosDobrados = numeros.stream()
                        .map(integer -> integer * 2)
                        .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
