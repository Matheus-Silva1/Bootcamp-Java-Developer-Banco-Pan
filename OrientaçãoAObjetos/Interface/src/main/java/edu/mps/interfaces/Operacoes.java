package edu.mps.interfaces;

public class Operacoes implements OperacoesMatematicas{

    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();

        operacoes.somar(5, 2);
        operacoes.subtrair(5, 2);
        operacoes.multiplicar(7, 3);
        operacoes.dividir(10, 5);
    }

    @Override
    public void somar(float operando1, float operando2){
        float soma = operando1 + operando2;
        System.out.println(operando1 + " + " + operando2 + " = "
        + soma);
    }

    @Override
    public void subtrair(float operando1, float operando2){
        float diferenca = operando1 - operando2;
        System.out.println(operando1 + " - " + operando2 + " = "
        + diferenca);
    }

    @Override
    public void multiplicar(float operando1, float operando2){
        float produto = operando1 * operando2;
        System.out.println(operando1 + " X " + operando2 + " = "
        + produto);
    }

    @Override
    public void dividir(float operando1, float operando2){
        float quociente = operando1 / operando2;
        System.out.println(operando1 + " / " + operando2 + " = "
        + quociente);
    }
}