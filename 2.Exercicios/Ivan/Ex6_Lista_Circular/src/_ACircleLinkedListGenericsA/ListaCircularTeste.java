package _ACircleLinkedListGenericsA;

public class ListaCircularTeste {
    public static void main(String[] args) {
        CircleLinkedList<Integer> lista = new CircleLinkedList<>();
        lista.addFirst(1);

        lista.addFirst(1);

        lista.addFirst(1);

        lista.addFirst(1);

        lista.addFirst(1);


        System.out.println(lista);  // PRINTA DEPOIS DE ADICIONAR TUDO

        System.out.println("Tamanho da lista circular: " + lista.getSize());

        lista.inverte();

        System.out.println(lista);

    }
}