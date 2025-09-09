public class Pilha {
    private int[] elementos;
    private int topoPilha;
    private final static int TAM_DEFAULT = 100;

    // Construtor com tamanho definido
    public Pilha(int tamanho) {
        elementos = new int[tamanho];
        topoPilha = -1;
    }

    // Construtor padrão
    public Pilha() {
        this(TAM_DEFAULT);
    }

    // Empilhar
    public void push(int n) throws Exception {
        if (!isFull()) {
            elementos[++topoPilha] = n;
        } else {
            throw new Exception("Overflow - Estouro de Pilha");
        }
    }

    // Desempilhar
    public int pop() throws Exception {
        if (!isEmpty()) {
            return elementos[topoPilha--];
        } else {
            throw new Exception("Underflow - Pilha vazia");
        }
    }

    // Ver topo
    public int topo() throws Exception {
        if (!isEmpty()) {
            return elementos[topoPilha];
        } else {
            throw new Exception("Pilha vazia");
        }
    }

    // Tamanho atual
    public int sizeElements() {
        return topoPilha + 1;
    }

    // Está vazia?
    public boolean isEmpty() {
        return topoPilha == -1;
    }

    // Está cheia?
    public boolean isFull() {
        return topoPilha == elementos.length - 1;
    }
}
