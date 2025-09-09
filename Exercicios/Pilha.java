public class Pilha{
    //atributos

    private final static int TAM_DEFAULT = 100;
    private int topoPilha;
    private char elementos[];

    //construtores
    public Pilha(int tamanho){
        elementos = new char[tamanho];
        topoPilha = -1;
    }

    public Pilha(){
        this(TAM_DEFAULT); // (!) esse construtor chama o de cima atraves do this, evita repeticao
    }

    // metodos
    public void push(int n) throws Exception{ //se eu vou usar exception no metodo coloca isso aí no começo
        if(!isFull()){
            elementos[++topoPilha] = (char)n; //tava chiando, (char) não tava aí
      } else{
            throw new Exception("Overflow - Estouro de Pilha");
        }
    }

    public char pop()throws Exception{
        if(!isEmpty()){
            return elementos[topoPilha--];
        }else {
            throw new Exception("Underflow - Esvaziamento de pilha");
        } 
    }

    public char topo() throws Exception{
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