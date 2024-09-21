package edu.flaviomxx.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Recebe um argumento <T> e não retorna nada.
public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if(numero % 2 == 0) {
//                System.out.print(numero + "-");
//            }
//        };
//
//        numeros.stream().forEach(imprimirNumeroPar);

        numeros.forEach(integer -> {
            if(integer % 2 == 0) {
                System.out.print(integer + "-");
            }
        });

//        numeros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                if(integer % 2 == 0) {
//                    System.out.print(integer + "-");
//                }
//            }
//        });
    }
}
