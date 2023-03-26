package edu.mps.set.ordenacaoset;

import java.util.*;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene esse conjunto exibindo:
(Nome - Gênero - Tempo de episódio)

        Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that 70's show, genero: comédia, tempoEpisodio: 25
        */
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("---\tOrdem Aleatória\t---");

        Set<Series> minhasSeries = new HashSet<>();

        minhasSeries.add(new Series("Got", "Fantasia",
                60));
        minhasSeries.add(new Series("Dark", "Drama",
                60));
        minhasSeries.add(new Series("That 70s Show",
                "Comedia", 25));

        for (Series serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero()
                    + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n---\tOrdem de Inserção\t---");

        Set<Series> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Series("Got", "Fantasia",
                    60));
            add(new Series("Dark", "Drama",
                    60));
            add(new Series("That 70s Show", "Comedia",
                    25));
        }};

        for (Series serie2 : minhasSeries2) {
            System.out.println(serie2.getNome() + " - " +
                    serie2.getGenero() + " - " + serie2.getTempoEpisodio());
        }

        System.out.println("\n---\tOrdem Natural (Tempo de Episódio)\t---");
        Set<Series> minhasSeries3 = new TreeSet<>(minhasSeries2);

        /*Outra maneira de adicionar os elementos:
        {{
            add(new Series("Got", "Fantasia",
            60));
            add(new Series("Dark", "Drama",
            60));
            add(new Series("That 70s Show", "Comedia",
            25));
        }};*/

        for (Series serie3 : minhasSeries3) {
            System.out.println(serie3.getNome() + " - " +
                    serie3.getGenero() + " - " + serie3.getTempoEpisodio());
        }

        System.out.println("\n---\tOrdem Nome/Gênero/Tempo de Episódio\t"
                + "---");

        Set<Series> minhasSeries4 = new TreeSet<>(
                new ComparatorNomeGeneroTempoEpisodio());

        minhasSeries4.addAll(minhasSeries2);
        for (Series serie4 : minhasSeries4) {
            System.out.println(serie4.getNome() + " - " + serie4.
                    getGenero() + " - " + serie4.getTempoEpisodio());
        }

        System.out.println("\n---\tOrdem de Gênero\t---");
        Set<Series> minhasSeries5 = new TreeSet<>(
                new ComparatorGenero());

        minhasSeries5.addAll(minhasSeries2);

        for (Series serie5 : minhasSeries5) {
            System.out.println(serie5.getNome() + " - " + serie5.
                    getGenero() + " - " + serie5.getTempoEpisodio());
        }

        System.out.println("\n---\tOrdem de Tempo de Episódio\t---");
        Set<Series> minhasSeries6 = new TreeSet(
        new ComparatorTempoEpisodio());

        minhasSeries6.addAll(minhasSeries5);
        for (Series serie6 : minhasSeries6) {
            System.out.println(serie6.getNome() + " - " +
            serie6.getGenero() + " - " + serie6.getTempoEpisodio());
        }
    }
}