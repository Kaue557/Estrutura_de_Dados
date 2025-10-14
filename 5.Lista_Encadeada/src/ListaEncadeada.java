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

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}