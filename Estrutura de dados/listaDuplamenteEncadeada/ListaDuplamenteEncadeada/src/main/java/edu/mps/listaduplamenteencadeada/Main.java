package edu.mps.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDuplamenteEncadeada.add("Item 1");
        minhaListaDuplamenteEncadeada.add("Item 2");
        minhaListaDuplamenteEncadeada.add("Item 3");
        minhaListaDuplamenteEncadeada.add("Item 4");

        System.out.println(minhaListaDuplamenteEncadeada.get(1));//Mostra um elemento da lista
        System.out.println(minhaListaDuplamenteEncadeada);
        minhaListaDuplamenteEncadeada.remove(1); //Remove um elemento da lista
        System.out.println(minhaListaDuplamenteEncadeada);

        System.out.println(minhaListaDuplamenteEncadeada.size());//Mostra o tamanho (Quantidade de elementos) da lista

        System.out.println(minhaListaDuplamenteEncadeada);
    }
}