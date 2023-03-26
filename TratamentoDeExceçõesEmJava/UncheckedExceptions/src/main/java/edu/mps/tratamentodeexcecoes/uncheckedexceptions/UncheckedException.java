package edu.mps.tratamentodeexcecoes.uncheckedexceptions;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class UncheckedException {
    public static void main(String[] args) {



        boolean continueLooping = true;
        do{
            try{
                String a = JOptionPane.showInputDialog("Numerador: ");
                String b = JOptionPane.showInputDialog("Denominador: ");


                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Entrada Inválida, informe um número " +
                                "inteiro " + e.getMessage());
                //e.printStackTrace();
            } catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null,
                        "Impossível dividir por 0.");
            }
            finally {

                //e.printStackTrace();
                System.out.println("Chegou no finally!");
            }
        }while(continueLooping);

        System.out.println("O código continua...");
    }

    static int dividir(int a, int b){
        int resultado = a/b;
        return resultado;
    }
}
