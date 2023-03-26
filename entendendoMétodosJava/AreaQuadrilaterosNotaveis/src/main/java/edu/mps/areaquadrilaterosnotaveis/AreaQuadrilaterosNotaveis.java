package edu.mps.areaquadrilaterosnotaveis;

public class AreaQuadrilaterosNotaveis {
    public static float area(float lado){
        float areaQuadrado = lado * lado;

        return areaQuadrado;
    }

    public static float area(float lado1, float lado2){
        float areaRetangulo = lado1 * lado2;
        return areaRetangulo;
    }

    public static float area(float baseMaior, float baseMenor, float
    altura){
        float areaTrapezio = (baseMaior + baseMenor) * altura/2;

        return areaTrapezio;
    }

    public static double area(double diagonal1, double diagonal2){
        double areaLosango = (diagonal1 * diagonal2)/2;

        return areaLosango;
    }
}
