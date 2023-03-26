package edu.mps.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        //Adiciona o conteúdo à lista
        minhaListaCircular.add("Item 1");
        minhaListaCircular.add("Item 2");
        minhaListaCircular.add("Item 3");
        minhaListaCircular.add("item 4");
        minhaListaCircular.add("Item 5");

        System.out.println(minhaListaCircular);

        //Remove o conteúdo um nó específico (à escolha do usuário
        //)
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        //Mostra o conteúdo de um nó específico (escolhido pelo usuário)
        System.out.println(minhaListaCircular.get(1));

        //Adicionando mais um nó para ver como a lista se comporta
        minhaListaCircular.add("Item 6");
        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.get(3));

        //Tentando mostrar o conteúdo de um nó com índice maior do que
        //o maior índice existente na lista e verificando o que acontece
        System.out.println(minhaListaCircular.get(5));

//        Mostra que a lista não tem fim, quando chegamos no head, ela
//        volta para a cauda:
//        for(int i = 0; i < 20; i++){
//            System.out.println(minhaListaCircular.get(i));
//        }
    }
}