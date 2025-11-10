package Ex5_Ex8_Lista_Encadeada.Teste;

import Ex5_Ex8_Lista_Encadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista1 = new ListaEncadeada<>();
        lista1.adiciona(7);

        lista1.adiciona(1);

        lista1.adiciona(3);

        lista1.adiciona(3);

        lista1.adiciona(9);

        lista1.adiciona(8);

        lista1.removerEntre(1, 9);
        System.out.println("lista: " + lista1);

    }
}