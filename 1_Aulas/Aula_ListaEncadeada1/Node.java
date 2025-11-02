// Classe Node: relativa a um nó (node) da estrutura de dados  
// Lista Ligada capaz de armazenar dados genéricos
// De qualquer tipo de dado não primitivo.
// Autor1: Ivan Carlos Alcântara de Oliveira.
// Data da Criação: 10/10/2024. 15h.
public class Node <T>{
	private T dado; // dado (tipo genérico) a ser armazenado no Node
	private Node<T> prox; // ponteiro para o próximo Node (nó) da lista ligada
	// Node(): construtor vazio
	public Node() {
		this(null, null);
	}
	// Node(T dado, Node<T> prox): construtor com parâmetros
	public Node(T dado, Node<T> prox) {
		this.dado = dado;
		this.prox = prox;
	}
    // getProx(): obtém o ponteiro para o próximo Node (nó) da lista ligada
	public Node<T> getProx() { return prox; };
	// getDado(): obtém o dado armazenado no Node (nó)
	public T getDado(){ return dado; };
	// setProx(Node<T> prox): atribui o endereço do próximo Node (nó) da lista ligada
	public void setProx(Node<T> prox) { this.prox = prox; };
	// setDado(T dado): atribui o dado a ser armazenado no Node
	public void setDado(T dado) { this.dado = dado;	};	
}
