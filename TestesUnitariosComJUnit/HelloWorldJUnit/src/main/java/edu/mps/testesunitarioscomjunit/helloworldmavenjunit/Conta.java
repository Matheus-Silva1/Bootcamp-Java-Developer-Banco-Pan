package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

public class Conta {

    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void lancaCredito(double credito){
        this.saldo += credito;
    }
}
