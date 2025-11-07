package _ACircleLinkedListGenericsA;

public class ListaCircularTeste {
    public static void main(String[] args) {
        CircleLinkedList<Integer> lista = new CircleLinkedList<Integer>();
        lista.addLast(1);

        lista.addLast(2);

        lista.addLast(3);

        lista.addLast(4);

        lista.addLast(5);


        System.out.println(lista);  // PRINTA DEPOIS DE ADICIONAR TUDO

        System.out.println("Tamanho da lista circular: " + lista.getSize());

        lista.inverte();

        System.out.println(lista);

    }
}