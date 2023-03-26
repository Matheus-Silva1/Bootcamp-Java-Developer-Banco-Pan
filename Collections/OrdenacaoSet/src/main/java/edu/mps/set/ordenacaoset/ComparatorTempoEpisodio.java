package edu.mps.set.ordenacaoset;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Series> {


    @Override
    public int compare(Series s1, Series s2) {
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.
        getTempoEpisodio());

        int nome = s1.getNome().compareTo(s2.getNome());

        if(tempoEpisodio != 0){
            return tempoEpisodio;
        }

        return nome;
    }
}
