package Ex5_Ex8_Lista_Encadeada;
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

    // ---------------------------------------- METODO INVERTE (exercicio 5) ----------------------------------------
    /*
    5) Fazer um metodo da classe LinkedList que inverte o conteúdo da lista ligada.
    Protótipo: public void inverte( ).
    */
    public void inverte(){
        if (this.tamanho <= 1) {
            return; // Lista de tamanho 0 ou 1 já está "invertida"
        }

        // CODIGO
        No<T> pAnda = this.inicio;
        No<T> anterior = null; // pois o novo final da lista vai apontar pra nada
        No<T> proximo;

        for(int i = 0; i < this.tamanho; i++){
            proximo = pAnda.getProximo();
            pAnda.setProximo(anterior);
            anterior = pAnda;
            pAnda = proximo;
        }
        this.ultimo = this.inicio;
        this.inicio = anterior;
    }

    // ---------------------------------------- METODO CONCATENA (exercicio 8) ----------------------------------------
    /*
    8) Fazer um metodo da classe LinkedList que concatena uma outra lista no final da lista ligada.
    Protótipo:  public void concatena(LinkedLIst<T> lista). Fazer  um programa main para testes.
    */
    public void concatena(ListaEncadeada<T> lista2){
        if(lista2 == null || lista2.inicio == null){ // lista2 vazia
            return;
        }

        this.ultimo.setProximo(lista2.inicio);
        this.ultimo = lista2.ultimo;
        this.tamanho += lista2.getTamanho();

        // limpa a lista 2 - concatenacao esta na lista 1
        lista2.inicio = null;
        lista2.ultimo = null;
        lista2.tamanho = 0;
    }

    // ---------------------------------------- METODO REMOVE REPETIDO ------------------------------------------------

    // funcao remove elementos repetidos e retorna quantos foram retirados
    public int removerRepetidos(){
        No<T> pAnda = inicio; // inicia apontando para o head
        No<T> proximo = inicio.getProximo();
        int repete_cont = 0; // quantas vezes os nodes se repetem

        while(pAnda != null && proximo != null){
            if(pAnda.getElemento().equals(proximo.getElemento())){
                pAnda.setProximo(proximo.getProximo()); // atualiza o ponteiro de pAnda
                proximo.setProximo(null); // remove
                repete_cont++; // atualiza quantos foram retirados
                // agora o primeiro elemento repetido deve ter sido removido e a lista linkada corretamente
                proximo = pAnda.getProximo();
            }else{
                pAnda = pAnda.getProximo();
                proximo = proximo.getProximo(); //  1 -> 2 -> 3 -> 1
            }
        }

        return repete_cont;
    }

    // ---------------------------------------- METODO REMOVE ENTRE ------------------------------------------------
    // metodo removerEntre(noPrimeiro, noUltimo) - escolhe quais nodes quer remover (inclusive)
    public void removerEntre(T elem1, T elem2){
        if (inicio == null) return; // lista vazia

        No<T> atual = inicio;
        No<T> noPrimeiro = null; // achar o elemento de noPrimeiro
        No<T> noUltimo = null; // achar o elemento de noUltimo

        while(atual != null && noPrimeiro == null){ //  X -> C -> V -> T -> G
            if(atual.getElemento().equals(elem1)){
                noPrimeiro = atual;
            }else{
                atual = atual.getProximo();
            }
        }
        // se não encontrou o primeiro, sai
        if (noPrimeiro == null) return;

        noUltimo = noPrimeiro;
        while(noUltimo != null && !noUltimo.getElemento().equals(elem2)){
            noUltimo = noUltimo.getProximo();
        }
        // se não encontrou o segundo, sai
        if (noUltimo == null) return;

        // agora temos: noPrimeiro (início da remoção), noUltimo (fim da remoção)
        // precisamos achar o nó anterior ao noPrimeiro
        No<T> anterior = null;
        No<T> p = inicio;
        while (p != null && p != noPrimeiro) {
            anterior = p;
            p = p.getProximo();
        }

        // liga o anterior diretamente ao nó após o último
        if (anterior != null)
            anterior.setProximo(noUltimo.getProximo());
        else
            inicio = noUltimo.getProximo(); // se o primeiro nó removido era o head
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