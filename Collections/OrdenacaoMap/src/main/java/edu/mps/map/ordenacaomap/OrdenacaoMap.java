package edu.mps.map.ordenacaomap;

/*Dadas as seguintes informações sobre meus livros favoritos
e seus autores, crie um dicionário e ordene esse dicionário,
exibindo: (Nome do Autor - Nome do Livro)

Autor = Rawking, Stephen - Livro = Uma breve história do tempo. Páginas: 256
Autor = Duhigg, Charles - Livro = O poder do hábito. Páginas: 408
Autor = Harari, Yuval Noah - Livro = 21 lições para o século 21. Páginas: 432
*/



import java.util.*;
import java.util.Map.Entry;

public class OrdenacaoMap{
    public static void main(String[] args) {

        System.out.println("\n---\tOrdem aleatória\t---");

        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve" +
            " história do tempo", 256));

            put("Duhigg, Charles", new Livros("O poder do " +
            "hábito", 408));

            put("Harari, Yuval Noah", new Livros("21 Lições " +
            "para o século 21", 432));
        }};

        for (Entry<String, Livros> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.
            getValue().getNome());
        }

        System.out.println("\n---\tOrdem de inserção\t---");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve história" +
            " do tempo", 356));

            put("Duhigg, Charles", new Livros("O poder do hábito",
            408));

            put("Harari, Yuval Noah", new Livros("21 Lições para o século 21",
            432));
        }};

        for(Entry<String, Livros> livro1: meusLivros1.entrySet()){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().
            getNome());
        }

        System.out.println("\n---\tOrdem alfabética de autores\t---");

        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);

        for (Entry<String, Livros> livro2: meusLivros2.entrySet()){
            System.out.println(livro2.getKey() + " - " + livro2.
            getValue().getNome());
        }

        System.out.println("\n---\tOrdem alfabética dos nomes dos" +
        " livros\t---");

        Set<Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());

        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livros> livro3: meusLivros3) {
            System.out.println(livro3.getKey() + " - "
            + livro3.getValue().getNome());
        }

        System.out.println("\n---\tOrdem de número de páginas\t---");
        Set<Entry<String, Livros>> meusLivros4 = new TreeSet<>(
        new ComparatorNumeroPaginas());

        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro4: meusLivros4) {
            System.out.println(livro4.getKey() + " - " +
            livro4.getValue().getNome() + " - " +
            livro4.getValue().getPaginas() + "p");//p de páginas
        }
    }
}