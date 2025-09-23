public class Fila <T> {
    // atributos
    private static final int TAM_DEFAULT = 100;
    private int inicio, fim, qtde;
    private T e[];

    // construtores
    public Fila (int tamanho){
        inicio = 0;
        fim = 0;
        qtde = 0;
        e = (T[]) new Object[tamanho];
    }

    public Fila (){
        this(TAM_DEFAULT);
    }

    public boolean isEmpty(){
        return qtde == 0;
    }

    public boolean isFull(){
        return qtde == e.length;
    }

    public void enqueue(T elem){
        if(!isFull()){
            e[fim++] = elem;
            fim = fim % e.length; // uma forma de "circular" a posição do fim. aqui garante a circularidade
            qtde++;
        }else{
            System.out.println("Overflow");
        }
    }
}
