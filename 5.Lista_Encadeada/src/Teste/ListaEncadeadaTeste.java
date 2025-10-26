public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho da lista: " + lista.getTamanho());

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        //lista.limpa();
        //System.out.println(lista);

        // busca por elemento
        System.out.println("BUSCA POR ELEMENTO");
        System.out.println("posicao do elemento: " + lista.busca(1));
        System.out.println("posicao do elemento: " + lista.busca(2));
        System.out.println("posicao do elemento: " + lista.busca(3));
        System.out.println("posicao do elemento: " + lista.busca(0));

        System.out.println();

        // busca por posicao
        System.out.println("BUSCA POR POSICAO");
        System.out.println("elemento nesta pos: " + lista.buscaPorPosicao(0));
        System.out.println("elemento nesta pos: " + lista.buscaPorPosicao(1));
        System.out.println("elemento nesta pos: " + lista.buscaPorPosicao(2));


        System.out.println();

        int removido = lista.removeInicio();
        System.out.printf("elemento removido: %d", removido);

        System.out.println();

        System.out.println("Nova lista: " + lista);

    }
}