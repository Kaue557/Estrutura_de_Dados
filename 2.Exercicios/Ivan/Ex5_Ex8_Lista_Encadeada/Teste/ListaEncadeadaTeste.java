package Ex5_Ex8_Lista_Encadeada.Teste;

import Ex5_Ex8_Lista_Encadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista1 = new ListaEncadeada<>();
        lista1.adiciona(1);

        lista1.adiciona(2);

        lista1.adiciona(3);

        lista1.adiciona(4);

        lista1.adiciona(5);


        System.out.println("lista 1: " + lista1);  // PRINTA DEPOIS DE ADICIONAR TUDO
        System.out.println();

        // System.out.println("Tamanho da lista: " + lista1.getTamanho());

        // LISTA 2
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
        lista2.adiciona(10);

        lista2.adiciona(11);

        lista2.adiciona(12);

        lista2.adiciona(13);

        lista2.adiciona(14);

        System.out.println("lista 2: " + lista2);
        System.out.println();

        // System.out.println("Tamanho da lista: " + lista2.getTamanho());

        lista1.concatena(lista2);

        System.out.println("lista 1 + lista 2: " + lista1);

        System.out.println("Tamanho da lista CONCATENADA: " + lista1.getTamanho());
    }
}