public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        lista.adiciona(2);

        lista.adiciona(3);

        lista.adiciona(4);

        lista.adiciona(5);


        System.out.println(lista);  // PRINTA DEPOIS DE ADICIONAR TUDO

        System.out.println("Tamanho da lista: " + lista.getTamanho());

    }
}