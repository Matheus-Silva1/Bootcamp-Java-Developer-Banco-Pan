package edu.mps.upcastsedowncasts;

public class Main {
    public static void main(String[] args) {
        //Instanciando o objeto da classe Funcionario
        Funcionario funcionario = new Funcionario();

        //Upcasts
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();

        //Downcasts (Devem ser evitados)
//        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}