package edu.mps.streamapi.exerciciosstreamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
        Arrays.asList("1", "0", "4", "1", "2", "3",
        "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista" +
        " de String: ");

        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        System.out.println("\nPegue os cinco primeiros números e coloque" +
        " dentro de um Set: ");

        /*Set<String> numeros = new LinkedHashSet<>();

        for(int i = 0; i < 5; i++){
            numeros.add(numerosAleatorios.get(i));
        }

        numeros.stream().forEach( s -> System.out.println(s));*/

        numerosAleatorios.stream().limit(5).collect(Collectors.
                        toSet()).forEach(System.out::println);

        System.out.println("\nTransforme essa lista de String em uma" +
        " lista de números inteiros: ");

        List<Integer> collectList = numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        collectList .forEach(System.out::println);

        System.out.println("\nPegue os números pares maiores que 2 e" +
        " coloque-os em uma lista: ");

        List<Integer> listParesMaioresQue2 =
                numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter( i -> (i % 2 == 0 && i > 2))
                        .collect(Collectors.toList());

        System.out.println(listParesMaioresQue2);

        System.out.println("\nMostre a média dos números: ");

        numerosAleatorios.stream()
                        .mapToInt( s -> Integer.parseInt(s))
                .average()
                .ifPresent(v -> System.out.println(v));

        System.out.println("\nRemova os valores ímpares: ");

        List<Integer> numerosAleatorios2 = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatorios2.removeIf(integer -> (integer % 2 != 0));

        System.out.println(numerosAleatorios2);
    }
}