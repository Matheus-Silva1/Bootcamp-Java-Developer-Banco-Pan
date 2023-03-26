package edu.mps.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String alunos[] = {"Camila", "Carlos", "Bruna", "Pedro"};

        double media = calcularMediaTurma(alunos, teclado);

        System.out.println("Média da turma: " + media);
    }

    public static double calcularMediaTurma(String alunos[],
         Scanner teclado){
        double soma = 0;

        for (String aluno: alunos) {
            System.out.println("Nota do aluno " + aluno + ":");
            double nota = teclado.nextDouble();
            soma += nota;
        }

        return soma/alunos.length;
    }
}
