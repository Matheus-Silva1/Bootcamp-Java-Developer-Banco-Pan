package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int numeroA = 1;
        int numeroB = numeroA;

        System.out.println("numeroA = " + numeroA + " numeroB = "
        + numeroB);

        numeroA = 2;
        System.out.println("\nnumeroA = " + numeroA + " numeroB = "
        + numeroB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + " objB = " + objB);

        objA.setNum(2);
        System.out.println("objA = " + objA + " objB = " + objB);
    }
}
