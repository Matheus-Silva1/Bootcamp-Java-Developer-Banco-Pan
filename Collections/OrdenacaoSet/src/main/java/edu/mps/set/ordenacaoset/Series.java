package edu.mps.set.ordenacaoset;

import java.util.Objects;

public class Series implements Comparable<Series>{

        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Series(String nome, String genero, Integer tempoEpisodio){
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome(){
            return nome;
        }

        public String getGenero(){
            return genero;
        }

        public Integer getTempoEpisodio(){
            return tempoEpisodio;
        }

        @Override
        public String toString(){
            return "[{Nome=" + nome + "}, " + "{Gênero=" + genero + "}," +
                    "{Tempo de Episódio=" + tempoEpisodio + "}]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            edu.mps.set.ordenacaoset.Series series = (edu.mps.set.ordenacaoset.Series) o;
            return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpisodio.equals(series.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

    @Override
    public int compareTo(Series serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

        if(tempoEpisodio != 0) {
            return tempoEpisodio;
        }

        return this.getGenero().compareTo(serie.getGenero());

    }
}
