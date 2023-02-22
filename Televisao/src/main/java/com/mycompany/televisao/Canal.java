
package com.mycompany.televisao;

import java.util.Scanner;

public class Canal {
    public static short mudar(short canal){
        Scanner teclado = new Scanner(System.in);
        
        canal = teclado.nextShort();
        return canal;
    }
}
