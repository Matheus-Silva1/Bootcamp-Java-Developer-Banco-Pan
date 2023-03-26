package edu.mps.linkedlist;

import java.util.LinkedList;

public class ExercicioLinkedList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista chamada notas2 e coloque "
        + "todos os elementos da list Arraylist nessa lista: ");

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.push(7.0);
        notas2.push(8.5);
        notas2.push(9.3);
        notas2.push(5.0);
        notas2.push(8.0);
        notas2.push(7.0);
        notas2.push(0.0);
        notas2.push(3.6);
        System.out.println(notas2);

        System.out.print("\nMostre a primeira nota da nova lista sem removê-la: ");
        System.out.println(notas2.get(0));
        System.out.println(notas2);

        System.out.print("\nMostre a primeira nota da lista removendo-a: ");
        System.out.println(notas2.pop());

        System.out.println(notas2);
    }
}
