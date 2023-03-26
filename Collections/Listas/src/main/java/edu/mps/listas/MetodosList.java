package edu.mps.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.print("Exiba a posição da nota 5.0: ");

        System.out.println(notas.indexOf(5.0));

        System.out.print("Adicione na lista a nota 8 na posição 4: ");

        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.print("Substitua a nota 5.0 pela nota 6.0: ");

        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d) + "\n");

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for(Double nota: notas){
            System.out.println(nota);
        }

        System.out.print("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.print("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        //Outro maneira (usando o método get e o loop for)
        /*for(int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }*/

        System.out.println(soma);

        System.out.println("Exiba o tamanho (número de elementos) da lista: "
        + notas.size());

        System.out.printf("Exiba a média das notas: %.2f\n", soma/notas.size());

        System.out.print("Remova a nota 0.0: ");

        notas.remove(notas.indexOf(0.0));
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");

        notas.remove(0);
        System.out.println(notas);

        System.out.print("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }

        //Outra maneira (mais simples) de fazer
        /*for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) < 7){
                notas.remove(i);
            }
        }*/

        System.out.println(notas);

        System.out.print("Apague toda a lista: ");

        notas.clear();
        System.out.println(notas);

        System.out.print("Verifique se a lista está vazia: ");
        System.out.println(notas.isEmpty());
    }
}