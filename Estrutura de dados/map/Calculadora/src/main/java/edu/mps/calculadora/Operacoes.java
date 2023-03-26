package edu.mps.calculadora;

public class Operacoes {

    public static float somar(float numero1, float numero2){
        float soma = numero1 + numero2;

        return soma;
    }

    public static void subtrair(float numero1, float numero2){
        System.out.println(numero1 + " - " + numero2 + " = " +
        (numero1 - numero2));
    }

    public static void multiplicar(float numero1, float numero2){
        System.out.println(numero1 + " * " + numero2 + " = "
        + (numero1 * numero2));
    }

    public static float dividir(float numero1, float numero2){
        return numero1/numero2;
    }
}
