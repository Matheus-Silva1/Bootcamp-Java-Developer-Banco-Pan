
package com.mycompany.televisao;

import java.util.Scanner;

public class Desligada {
    
        public static void desligada(boolean status, short canal,
        short volume){
            Scanner teclado = new Scanner(System.in);
            
            status = false;
            canal = 1;
            volume = 10;
            System.out.println("Televisão desligada");

            System.out.print("Para ligar a televisão pressione 1: ");
            String resposta = teclado.next();
        
            if (resposta.equals("1")) {
                status = true; //Televisão ligada
                while (status){                
                    Ligada.ligada(status, canal, volume);
                }

                if (status == false) {
                    Desligada.desligada(status, canal, volume);
                }
            }

            else{
                System.out.println("\nOperação inválida. ");
                Desligada.desligada(status, canal, volume);
            }
    }
            
}
