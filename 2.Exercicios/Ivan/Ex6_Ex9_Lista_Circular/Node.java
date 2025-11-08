package Ex6_Ex9_Lista_Circular;

public class Node<T> {
	private T data;
	private Node<T> prox;
	
	public Node() {
		this(null, null);
	}
	
	public Node(T data, Node<T> prox) {
		this.data = data;
		this.prox = prox;
	}

	public Node<T> getProx() { return prox; };
	public T getData(){ return data; };
	
	public void setProx(Node<T> prox) { this.prox = prox; };
	public void setData(T data) { this.data = data;	};	
	
}
