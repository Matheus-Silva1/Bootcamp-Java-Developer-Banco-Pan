package edu.mps.set.ordenacaoset;

import edu.mps.set.ordenacaoset.Series;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
            if(nome != 0){
                return nome;
            }
        int genero = s1.getGenero().compareTo(s2.getNome());
            if(genero != 0){
                return genero;
            }

        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        return tempoEpisodio;
    }
}

