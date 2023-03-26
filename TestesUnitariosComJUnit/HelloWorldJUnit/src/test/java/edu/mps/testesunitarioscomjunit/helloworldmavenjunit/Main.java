package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

public class Main {
    public static void main(String[] args) {

        Conta conta3 = new Conta("1234", 100);

        conta3.lancaCredito(140);
        System.out.println("Saldo da conta 3: " + conta3.getSaldo());
    }
}
