package edu.mps.areaquadrilaterosnotaveis;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Exercício Quadriláteros: ");
//
//        float areaQuadrado = AreaQuadrilaterosNotaveis.area(3);
//
//        float areaRetangulo = AreaQuadrilaterosNotaveis.area(5f, 5f);
//
//        float areaTrapezio = AreaQuadrilaterosNotaveis.area(7,8,
//        9);
//
//        double areaLosango = AreaQuadrilaterosNotaveis.area(5d, 5d);
//
//
//        System.out.println("Área do quadrado: " + areaQuadrado);
//        System.out.println("Área do retângulo: " + areaRetangulo);
//        System.out.println("Área do trapézio: " + areaTrapezio);
//        System.out.println("Área do losango: " + areaLosango);

        System.out.print("Informe n: ");
        float n = teclado.nextInt();
        float h = 0;
        for(float i = 1; i <= n; i++){
            h += (1/i);
        }

        h = (float) Math.round(h);
        System.out.printf("%da. H", h);
    }
}
