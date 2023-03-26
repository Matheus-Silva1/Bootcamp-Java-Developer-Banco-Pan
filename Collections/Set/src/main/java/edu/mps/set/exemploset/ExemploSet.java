package edu.mps.set.exemploset;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um projeto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,
        9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5: \n");
        //Como a lista HashSet não possui índice e os elementos ficam
        //dispostos de forma aleatória na lista, não é possível pes-
        //quisar pelo índice, logo, não será possível resolver essa
        //questão

        System.out.println("Adicione a nota 8 na posição 4: \n");
        //Novamente, por causa da ordem aleatória e a falta do índice,
        //não será possível resolver esse tipo de questão

        System.out.println("Substitua a nota 5.0 pela nota 6.0: \n");
        //Também não será possível fazer a substituição, pois HashSet
        //não possui métodos que permitam a substituição

        System.out.print("Confira se a nota 5.0 está no conjunto: ");

        boolean contem; //do verbo Conter
        if(notas.contains(5d)){
            contem = true;
        }
        else{
            contem = false;
        }

        System.out.print(contem);

        System.out.println("Exiba a terceira nota adicionada: \n");
        //Não é possível, por causa da ausência de métodos que utili-
        //zem índices para pesquisar dentro do HashSet

        System.out.print("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.print("\nExiba a maior nota: " + Collections.max(notas));

        System.out.print("\nExiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;

        for(int i = 0; i < notas.size(); i++){
            if(iterator.hasNext()){
                double next = iterator.next();
                soma += next;
            }
        }
        System.out.printf("%.1f\n", soma);

        System.out.printf("\nExiba a média das notas: %.1f\n", soma/notas.size());

        System.out.print("\nRemova a nota 0.0: ");

        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0 ");
        //Não é possível, pois não dá para utilizar índices no
        //HashSet

        System.out.println("\nRemova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }

        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem em que " +
        "foram informada: ");
        //Na interface HashSet os elementos não ficam na mesma ordem em
        //que foram informados, portanto, utilizaremos a LinkedHashSet
        //para mostrar os elementos em sua ordem informada:
        //7d, 8.5, 9.3, 5d, 7d, 0d, 3.6
        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.print("\nExiba todas as notas na ordem crescente: ");
        //Para isso precisamos utilizar a implementação TreeSet, pois ela
        //organiza de acordo com a ordem natural dos elementos
        //7d, 8.5, 9.3, 5d, 7d, 0d, 3.6
        Set<Double> notas3 = new TreeSet<>();
        notas3.add(7d);
        notas3.add(8.5);
        notas3.add(9.3);
        notas3.add(5d);
        notas3.add(7d);
        notas3.add(0d);
        notas3.add(3.6);

        System.out.println(notas3);

        System.out.println("\nApague todo o conjunto: ");
        //Vamos apagar o primeiro conjunto (notas)
        notas.clear();

        System.out.print("\nConfira se o conjunto notas está vazio: ");
        System.out.println(notas.isEmpty());

        System.out.print("\nConfira se o conjunto notas2 está vazio: ");
        System.out.println(notas2.isEmpty());

        System.out.print("\nConfira se o conjunto notas3 está vazio: ");
        System.out.println(notas3.isEmpty());
    }
}