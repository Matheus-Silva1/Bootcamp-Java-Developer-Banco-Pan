package edu.mps.exceptions.exceptionspersonalizadas;

import javax.swing.*;

public class ExceptionsCustomizadas2 {
    public static void main(String[] args) {

        int numerador[] = {4, 5, 8, 10};
        int denominador[] = {2, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; i++){

            try {
                if(numerador[i] % 2 != 0){
                    throw new DivisaoNaoExataException("Divisão inexata",
                    numerador[i], denominador[i]);
                }
                int resultado = numerador[i]/denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        e.getMessage());
            }
            catch (ArithmeticException ex){
                JOptionPane.showMessageDialog(null,
                "Impossível dividir por zero, informe " +
                "um número inteiro diferente de zero para o " +
                " denominador " + ex.getMessage());

                ex.printStackTrace();
            }
            catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,
                "Índice inexistente no Vetor.");
                e.printStackTrace();
            }
        }

        System.out.println("O programa continua...");
    }
}
