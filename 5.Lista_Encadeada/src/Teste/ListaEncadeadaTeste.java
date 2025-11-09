public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println(lista);

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println();

        //lista.limpa();
        //System.out.println(lista);

        /*
        // busca por elemento
        System.out.println("BUSCA POR ELEMENTO");
        System.out.println("posicao do elemento: " + lista.busca(1));
        System.out.println("posicao do elemento: " + lista.busca(2));
        System.out.println("posicao do elemento: " + lista.busca(3));
        System.out.println("posicao do elemento: " + lista.busca(0));

        System.out.println();

        busca por posicao
        System.out.println("BUSCA POR POSICAO");
        System.out.println("elemento nesta pos: " + lista.buscaPorPosicao(0));
        System.out.println("elemento nesta pos: " + lista.buscaPorPosicao(1));
        System.out.println("elemento nesta pos: " + lista.buscaPorPosicao(2));
        */

        // TESTE REMOVE DO INICIO
        int removido;

        // TESTE REMOVE
        removido = lista.remove(2);
        System.out.printf("elemento removido: %d", removido);

        System.out.println();

        System.out.println("Nova lista: " + lista);

    }
}