package Ex5_Ex8_Lista_Encadeada.Teste;

import Ex5_Ex8_Lista_Encadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista1 = new ListaEncadeada<>();
        lista1.adiciona(1);

        lista1.adiciona(1);

        lista1.adiciona(3);

        lista1.adiciona(2);

        lista1.adiciona(1);


        System.out.println("lista 1: " + lista1);  // PRINTA DEPOIS DE ADICIONAR TUDO
        System.out.println();

        int repete_cont = lista1.removerRepetidos();
        System.out.println("lista 1: " + lista1);
        System.out.println("num. de elemntos removidos: " + repete_cont);

    }
}