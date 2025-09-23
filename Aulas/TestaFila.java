public class TestaFila {
    public static void main(String[] args) {
        Fila f = new Fila(5);
        f.enqueue(3);
        System.out.println((Integer)f.dequeue()%2);
        f.enqueue('t');
        System.out.println(f.dequeue());

    }
}
