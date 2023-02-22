
package com.mycompany.televisao;

import java.util.Scanner;

public class Televisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        boolean ligada = false;
        short canal = 1;
        short volume = 10;
        
        Desligada.desligada(ligada, canal, volume);
    }
}
