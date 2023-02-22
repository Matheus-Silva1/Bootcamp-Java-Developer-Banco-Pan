
package com.mycompany.televisao;

import java.util.Scanner;

public class Ligada {
    
    
    public static void ligada(boolean status, short canal, short volume){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\nTelevisão ligada");
            System.out.println("Escolha uma opção: ");
            System.out.println("Mudar de canal [a], aumentar o volu"
            + "me [b], diminuir o volume[c], Desligar[d]");
            
            String escolha = teclado.next();
            switch (escolha){
                case "a" -> {
                    System.out.print("\nEscolha o canal: ");
                    canal = Canal.mudar(canal);
                    
                    if (canal <= 100) {
                        
                        System.out.println("\nCanal atual " + canal);
                    }
                    else {
                        System.out.println("\nOperação inválida.");
                    }
                }
                
                case "b" -> {
                    do {
                        if (volume < 100) {
                            volume = Volume.aumentar(volume);
                            System.out.println("\nVolume atual: " + volume);
                        }
                        else {
                            System.out.println("\nVolume máximo: " + volume);
                        }
                        
                        Ligada.ligada(status, canal, volume);
                    } while (escolha == "b");
                }
                
                case "c" -> {
                    do {
                        if (volume > 0) {
                            volume = Volume.diminuir(volume);
                            System.out.println("\nVolume atual: " + volume);
                        }
                        else {
                            System.out.println("\nVolume mínimo: " + volume);
                        }
                        Ligada.ligada(status, canal, volume);
                    } while (escolha == "c");
                }
                
                case "d" -> {
                    Desligada.desligada(status, canal, volume);
                }
            }
    }
}
