package edu.mps.map.ordenacaomap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        int paginas = Integer.compare(l1.getValue().getPaginas(),
        l2.getValue().getPaginas());

        return paginas;
    }
}
