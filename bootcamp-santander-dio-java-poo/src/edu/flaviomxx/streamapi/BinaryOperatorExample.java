package edu.flaviomxx.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//Recebe dois argumentos T iguais e retorna o mesmo tipo T
public class BinaryOperatorExample {
    public static void main(String[] args) {
       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
//
//        BinaryOperator<Integer> somar = Integer::sum; //mesma coisa que (n1, n2) -> n1 + n2;
//
//        int resultado = numeros.stream()
//                .reduce(0, somar);

//        int resultado = numeros.stream()
//                .reduce(0, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) {
//                        return integer + integer2;
//                    }
//                });

        int resultado = numeros.stream()
                        .reduce(0, Integer::sum);

        System.out.println(resultado);
    }

}
