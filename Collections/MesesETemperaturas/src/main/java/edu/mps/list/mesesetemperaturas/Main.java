package edu.mps.list.mesesetemperaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<>();

        double graus;
        double soma = 0;
        for(int i = 0; i < 6; i++){
            System.out.println("Informe a temperatura do "
            + (i + 1) + "º mês: ");
            temperatura.add(i, teclado.nextDouble());
            soma += temperatura.get(i);
        }

        System.out.println(temperatura);

        System.out.println("Soma: " + soma + "º");
        double media = soma/temperatura.size();
        System.out.printf("Média semestral %.1fº\n ", media);

        int mes;
        System.out.println("\nMeses com temperatura acima da média: ");
        for(int i = 0; i < temperatura.size(); i++){
            if(temperatura.get(i) > media){
                mes = (i+1);

                switch (mes){
                    case 1 -> {
                        System.out.println("Janeiro: "+ temperatura.get(i) + "º");
                    }

                    case 2 -> {
                        System.out.println("Fevereiro: " + temperatura.get(i) + "º");
                    }

                    case 3 -> {
                        System.out.println("Março: " + temperatura.get(i) + "º");
                    }

                    case 4 -> {
                        System.out.println("Abril: " + temperatura.get(i) + "º");
                    }

                    case 5 -> {
                        System.out.println("Maio: " + temperatura.get(i) + "º");
                    }

                    case 6 -> {
                        System.out.println("Junho: " + temperatura.get(i) + "º");
                    }
                }
            }
        }

        //Outra forma de mostrar as temperaturas(utilizando o método
        //forEach)
        ///temperatura.forEach(t -> System.out.print(t + " "));
    }
}
