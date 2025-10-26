public class ListaEncadeada<T>{
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0; // DECLARACAO E INICIA O TAMANHO DA LISTA
    // (neste caso nao eh obrigatorio inicializar o tipo primitivo, mas eh bom especificar)
    private final int NAO_ENCONTRADO = -1; // para poder retornar o -1 la na busca

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

    // FUNCAO REMOVE DO INICIO
    public T removeInicio(){ // retorno pode ser boolean ou void, por exemplo
        if(this.tamanho == 0){
            throw new RuntimeException("Lista esta vazia!");
        }

        T removido = this.inicio.getElemento(); // guarda o elemento removido p/ mostrar depois
        this.inicio = this.inicio.getProximo(); // agora o inicio eh o prox node
        this.tamanho--; // diminui o tamanho da lista

        if(this.tamanho == 0){
            this.ultimo = null;
        }

        return removido;
    }

    // FUNCAO REMOVER DO MEIO



    public int getTamanho(){
        return this.tamanho; // RETORNA O TAMANHO
    }

    public void limpa(){
        for(No<T> atual = this.inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null); // zera o elemento em si
            atual.setProximo(null); // zera o "link" entre os nós
            atual = proximo; // o atual agora eh o proximo elemento (iterando)
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){ // verificar se a posicao "existe"
            throw new IllegalArgumentException("Posicao nao existe!");
        }

        No<T> noAtual = this.inicio;
        for(int i = 0; i < posicao; i++){
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    // BUSCA DE ELEMENTO ESPECIFICO
    public T buscaPorPosicao(int posicao){
        return this.buscaNo(posicao).getElemento();
    }

    // CONFERIR SE O ELEMENTO EXISTE
    public int busca(T elemento){
        No<T> noAtual = this.inicio;
        int pos = 0; // posicao

        while(noAtual != null){

            if(noAtual.getElemento().equals(elemento)){
                return pos; // retorna a posicao se encontrar o elemento
            }
            pos++;
            noAtual = noAtual.getProximo(); // o atual agora eh o proximo elemento (iterando)
        }
        return NAO_ENCONTRADO; // mesma coisa que retornar -1
    }

    @Override
    public String toString() { // toString pra deixar a saida bonita
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