package edu.mps.debugging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no método main.");
        a();

        System.out.println("Finalizou o programa no método main.");
    }

    static void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b(){
        System.out.println("Entrou no método b.");

        for(int i = 0; i <= 4; i++){
            System.out.println(i);
        }

        c();

        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Iniciou o método c.");
        Thread.dumpStack();
        System.out.println("Finazou o método c.");
    }

    //Quando estamos lendo a Stack Trace (Exceção causada pelo
    //método Thead.dumpStack()), lemos de baixo para cima, e
    //para finalizar os métodos lemos de cima para baixo
}
