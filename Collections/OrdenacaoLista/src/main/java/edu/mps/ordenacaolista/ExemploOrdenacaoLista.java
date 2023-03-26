package edu.mps.ordenacaolista;

import java.util.*;

/*Dadas as seguintes informações sobre meus gatos, crie
        uma lista e ordene essa lista exibindo: (Nome, idade, cor)

        Gato1 = nome: Jon, idade: 18, cor: preto
        Gato2 = nome: Simba, idade: 6, cor: tigrado
        Gato3 = nome: Jon, idade: 12, cor: amarelo*/
public class ExemploOrdenacaoLista {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>()
        {{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};

        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem de Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem de Cor\t---");
        meusGatos.sort(new ComparatorCor());
        //collections.sort(meusGatos, new ComparatorCor);
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem de Nome, Cor e Idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2){

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0){
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0){
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}