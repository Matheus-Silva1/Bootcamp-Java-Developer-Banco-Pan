
package com.mycompany.televisao;

import java.util.Scanner;

public class Volume {
    Scanner teclado = new Scanner(System.in);
    
    public static short aumentar(short volume){
        short novoVolume = ++volume;
        return novoVolume;
    }
    
    public static short diminuir (short volume){
        short novoVolume = --volume;
        return novoVolume;
    }
}