public class Pilha {
    private int[] dados;
    private int topo;

    // Construtor
    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    // Insere elemento na pilha
    public void push(int valor) {
        if (topo < dados.length - 1) {
            dados[++topo] = valor;
        } else {
            System.out.println("Erro: Pilha cheia!");
        }
    }

    // Remove elemento do topo da pilha
    public int pop() {
        if (topo >= 0) {
            return dados[topo--];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return -1; // valor de erro
        }
    }

    // Verifica se está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Mostra o topo sem remover
    public int peek() {
        if (topo >= 0) {
            return dados[topo];
        } else {
            System.out.println("Pilha vazia!");
            return -1;
        }
    }
}
