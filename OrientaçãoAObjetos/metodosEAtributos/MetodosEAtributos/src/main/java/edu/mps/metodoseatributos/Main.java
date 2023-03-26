package edu.mps.metodoseatributos;

import static edu.mps.metodoseatributos.Carro.cor;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nUsando os métodos Getters e Setter");
        System.out.println("---------------------------------------\n");
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Sedan");
        carro1.setCapacidadeTanque(40);

        System.out.println("Cor do carro 1: " + carro1.getCor());
        System.out.println("Modelo do carro 1: " + carro1.getModelo());
        System.out.println("Capacidade do Tanque do carro 1: " + carro1.
        capacidadeTanque);

        System.out.println("Valor total a pagar do carro 1: " + carro1.
        valorTotalTanque(5.25));

        System.out.println("\n--------------------------------------------");
        System.out.println("Usando a sobrecarga do Método Construtor");
        System.out.println("--------------------------------------------\n");

        Carro carro2 = new Carro("Cinza", "Mercedes Benz",
        30);

        System.out.println("Cor do carro 2: " + carro2.cor);
        System.out.println("Modelo do carro 2: " + carro2.modelo);
        System.out.println("Capacidade do Tanque do carro 2: " +
        carro2.capacidadeTanque);

        System.out.println("Valor total a pagar do carro 2: " +
        carro2.valorTotalTanque(5));
    }
}