package _ADLLGenericsVersao2;

public class Node<T>{
	private	int key;  // Key foi definida com inteiro, mas poderia ser String (por ex.)
	private T data;
	private	Node<T> left, right;
	
	public Node(T data) {
    this(-1, data, null, null);
}

	public Node(int key, T data, Node<T> left, Node<T> right){
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
	};

	public T getData() { return data;};
	public Node<T> getLeft(){ return left;};
	public Node<T> getRight(){ return right;};
	public int getKey(){ return key; };
	public void setData(T data) { this.data = data;};
	public void setKey(int key){ this.key = key; };
	public void setLeft(Node<T> left){ this.left = left; };
	public void setRight(Node<T> right){ this.right = right; };
}
