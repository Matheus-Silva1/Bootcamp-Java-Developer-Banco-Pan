package edu.mps.set.ordenacaoset;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Series> {


    @Override
    public int compare(Series serie1, Series serie2) {
        int genero = serie1.getGenero().compareTo(serie2.getGenero());

        return genero;
    }
}
