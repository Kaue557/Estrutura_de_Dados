public class Pilha <T>{ // indicando que será pilha do tipo GENERICO
    //atributos
    private final static int TAM_DEFAULT = 100;
    private int topoPilha;
    private T elementos[];

    //construtores
    public Pilha(int tamanho){
        elementos = (T[]) new Object[tamanho];
        topoPilha = -1;
    }

    public Pilha(){
        this(TAM_DEFAULT); // (!) esse construtor chama o de cima atraves do this, evita repeticao
    }

    // metodos
    public void push(T n) throws Exception{ //se eu vou usar exception no metodo coloca isso aí no começo
        if(!isFull()){
            elementos[++topoPilha] = n;
      } else{
            throw new Exception("Overflow - Estouro de Pilha");
        }
    }

    public T pop()throws Exception{
        if(!isEmpty()){
            return elementos[topoPilha--];
        }else {
            throw new Exception("Underflow - Esvaziamento de pilha");
        } 
    }

    public T topo() throws Exception{
        if(!isEmpty()){
            return elementos[topoPilha];
        } else {
            throw new Exception();
        }    
    }

    public int sizeElements(){
        return topoPilha + 1;
    }
    

    public boolean isEmpty(){
        return topoPilha == -1;
    }

    public boolean isFull(){
        return topoPilha == elementos.length - 1; // retorna true se o topo for o ultimo elemento da pilha
        // o que significa que ela está cheia
    }
}