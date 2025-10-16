// 5. Fazer um metodo da classe LinkedList que inverte o conteúdo da lista ligada. Prototipo: public void inverte( ).

public class ListaEncadeada<T>{
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0; // DECLARACAO E INICIA O TAMANHO DA LISTA
    // (neste caso nao eh obrigatorio inicializar o tipo primitivo, mas eh bom especificar)

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        if(this.tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }


    public int getTamanho(){
        return this.tamanho; // RETORNA O TAMANHO
    }

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    public void inverte(){
       // NAO SEEEEEEEEEEEEEEI
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");

        if(this.tamanho == 0){
            return "[]";
        }

        No<T> atual = this.inicio;

        builder.append(atual.getElemento()).append(" ");
        while(atual.getProximo() != null){
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(" ");
        }
        builder.append("]");

        return builder.toString();
    }
}