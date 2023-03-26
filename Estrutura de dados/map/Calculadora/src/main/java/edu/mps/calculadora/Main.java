package edu.mps.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        float numero1 = teclado.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float numero2 = teclado.nextFloat();

        float soma = Operacoes.somar(numero1, numero2);
        System.out.println(numero1 + " + " + numero2 + " = " + soma);

        Operacoes.subtrair(numero1, numero2);
        Operacoes.multiplicar(numero1, numero2);

        float divisao = Operacoes.dividir(numero1, numero2);
        System.out.println(numero1 + " / " + numero2
        + " = " + divisao);
    }
}