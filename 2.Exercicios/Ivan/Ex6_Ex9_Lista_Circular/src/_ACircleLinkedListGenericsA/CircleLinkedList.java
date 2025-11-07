package _ACircleLinkedListGenericsA;

//Classe CircleLinkedList<T>: encarregada de manipular a estrutura de dados
//lista ligada circular genérica.
//
//Autor1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class CircleLinkedList<T> {
	private Node<T> head; // ponteiro do cabeça de lista
	private Node<T> tail;  // ponteiro do final da lista
	private int size; // tamanho da lista
	// CircleLinkedList(): construtor da Lista encadeada circular
	public CircleLinkedList() {
		head = tail = null;
		size = 0;
	}
	// getHead(): retorna o "Node" cabeça de lista	
	public Node<T> getHead() {
		return head;
	}
	// getTail(): retorna o "Node" final da lista	
	public Node<T> getTail() {
		return tail;
	}
	// isEmpty(): verifica se a lista está vazia, retornando "true" se vazia
	// "false" se não vazia.
	public boolean isEmpty() {
		return head == null;
	}
	// isFull(): verifica se a lista está cheia, retornando "true" se cheia
	// "false" se não cheia.
	public boolean isFull() {
		Node<T> aux = new Node<T>();
		return aux == null;
	}
	// getSize(): retorna o tamanho da lista (total de elementos armazenados).
	public int getSize() {
		return size;
	}
	// get(int pos): retorna o "Node" que se encontra na posição "pos" da lista.	
	//   O head está na posição 1. Lista vazia retorna null. Se pos > size retorna null.
	public Node<T> get(int pos) {
		if (isEmpty()) return null;
		if (pos <= 0 || pos > size) return null;
		int cont = 1;
		Node<T> pAnda = head;
		while (cont != pos){
			pAnda = pAnda.getProx();
			cont++;
		}
		return pAnda;
	}
	// insertTail(T data): insere o "data" passado como parâmetro no final da 
	// lista (funcionalidade idêntica ao addLast).	
	public boolean insertTail(T data){
		Node<T> aux;
	    if (!isFull()){ // Não há espaço de memória
	      aux = new Node<T>(data, null);
	      if (isEmpty()){ // Lista está vazia insere no cabeça
	    	aux.setProx(head);
	        head = tail = aux;
	      }else { // Insere no final e atualiza os ponteiros
	    	tail.setProx(aux);
	    	aux.setProx(head);
	    	tail = aux;
	      }
	      size++;
		  return true;
	    }
	    else return false; 
	};
	// addFirst(T data): insere o "data" passado como parâmetro no começo da 
	// lista (funcionalidade idêntica ao insertHead).
	public boolean addFirst(T data){
		Node<T> aux;
	    if (!isFull()){
	      aux = new Node<T>(data, null);
	      if (isEmpty()){ // Lista está vazia
			head = tail = aux;
		    aux.setProx(head);
	      }else { // Insere no começo e atualiza os ponteiros
	      	aux.setProx(head);
	      	head = aux;
	      	tail.setProx(head);
	      }
	      size++;
	      return true;
	    }
	    else return false; 
	};
	// addLast(T data): adiciona o "data" passado como parâmetro no final da 
	// lista (funcionalidade idêntica ao insertTail)
	public boolean addLast(T data){
		Node<T> aux;
	    if (!isFull()){ // Não há espaço de memória
	      aux = new Node<T>(data, null);
	      if (isEmpty()){ // Lista está vazia insere no cabeça
	    	aux.setProx(head);
	        head = tail = aux;
	      }else { // Insere no final e atualiza os ponteiros
	    	tail.setProx(aux);
	    	aux.setProx(head);
	    	tail = aux;
	      }
	      size++;
		  return true;
	    }
	    else return false; 
	};
	// insertHead(T data): insere o "data" passado como parâmetro no começo da 
	// lista (funcionalidade idêntica ao addFirst).	
	public boolean insertHead(T data){
		Node<T> aux;
	    if (!isFull()){
	      aux = new Node<T>(data, null);
	      if (isEmpty()){ // Lista está vazia
			head = tail = aux;
		    aux.setProx(head);
	      }else { // Insere no começo e atualiza os ponteiros
	      	aux.setProx(head);
	      	head = aux;
	      	tail.setProx(head);
	      }
	      size++;
	      return true;
	    }
	    else return false; 
	};
	
    // insert(T data, int pos): insere o elemento "data" na posição "pos" passada como parâmetro
	// caso seja uma posição maior que o tamanho da lista, insere no final
	// se posição de inserção for inválida  (<= 0) retorna false
	public boolean insert(T data, int pos) {
		Node<T> aux; // Ponteiro auxiliar para o novo nó a ser inserido
		Node<T> pAnda; // Ponteiro que anda na lista ligada	
		Node<T> pAnt = null;  // Ponteiro anterior ao que anda
		if (pos <= 0) return false; // Se posição inválida, não insere e retorna
	    if (!isFull()){ // se há memória disponível
	      aux = new Node<T>(data, null);
	      if (isEmpty()){ // Insere no começo da lista
	    	  head = tail = aux;
	    	  // Caso a posição a iserir seja a última ou superior, insere no final
	      } else if (pos >= size+1) {
	    		insertTail(data);
	      } else {// a posição a inserir é no meio da lista
	    	// Procura a posição de inserção
	    	int cont = 1;
	        pAnda = head;  // Ponteiro que anda até a posição de inserção 
            // Procura a posição de inserção  
	        while (cont != pos){
	           pAnt = pAnda;
	           pAnda = pAnda.getProx();
	           cont++;
	        }
        	aux.setProx(pAnda);
	        if (cont == 1) { // insere no cabeça de lista
	        	head = aux;
	        	tail.setProx(head);
	        } else { // insere no meio
	        	pAnt.setProx(aux);
	        }
	      }
		  size++;
		  return true; // inserção realizada com sucesso
	    }
	    else return false; 
	};
	// search(T data): procura o elemento "data" dentro da lista
	// se "data" não existir ou lista vazia retorna null
	// caso contrário, retorna o "Node"	
	public Node<T> search(T data){
		Node<T> pAnda;
		
	    if (isEmpty()) {
			return null; // Lista vazia
	    }else{
	      pAnda = head;
	      // procura a posição do elemento na lista
	      while ((pAnda.getProx() != head) && (pAnda.getData().equals(data) != true))
	        pAnda = pAnda.getProx();
	      if (pAnda.getData().equals(data))
	    	  return pAnda; // Retorna a referência para o No 
	      return null; // elemento não encontrado
	    }
	}
	// print(): percorre a lista e imprime todo o seu conteúdo
	public void print(){
		Node<T> pAnda; 
	    if (!isEmpty()) {
	    	pAnda = head;
	    	System.out.print("[ ");
	    	while (pAnda.getProx() != head) {
	    		System.out.println(pAnda.getData()+" ");
	    		pAnda = pAnda.getProx();
	    	}
	    	System.out.println(pAnda.getData()+" ");
	    }
	    System.out.print("], Qtde.: " + size + ".\n");
	}
	// clear(): limpa a lista ligada original, deixando-a vazia
	public void clear(){
		Node<T> pAnt, pAnda = head;
		
		while(pAnda.getProx() != head){
			pAnt = pAnda;  // Libera o nó
			pAnda = pAnda.getProx();
			pAnt.setProx(null);
			pAnt = null;
		}
		size = 0;
		tail = head = null;	
	}
	
	// remove(T data): remove a primeira ocorrência do "data" na lista
	// retorna "true" se remoção com sucesso
	// ou "false" se não foi possível remover, nos casos: o elemento não existe
	// ou a lista está vazia
	public boolean remove(T data){
		Node<T> pAnda; // Ponteiro que anda na lista ligada		
		Node<T> pAnt = null; // Ponteiro anterior ao que anda na lista
	    if (isEmpty()) return false; // Se lista vazia, não é possível remover
	    else{  // caso haja elementos na lista
	      pAnda = head;
	      // procura a posição do elemento na lista
	      int contador = 1;
	      while ((contador != size) && (pAnda.getData().equals(data) != true)){
	        pAnt = pAnda;
	        pAnda = pAnda.getProx();
	        contador++;
	      }
	      if ((contador == size) && (pAnda.getData().equals(data) != true))
	    	  return false; // Se não encontrou o elemento
	      else { // Se elemento foi encontrado 
	      	// se tem somente um elemento na lista
	    	if (size == 1) {
	    		head = tail = null;
	    	   // Verifica se está como cabeça da lista e remove
	    	   // e tem mais de um elemento
	    	} else if ((head == pAnda)) {
			    head = pAnda.getProx();
		        tail.setProx(head);
		    } else { // remove elemento do meio/fim da lista
		    	// Se o elemento estiver no fim
		    	if (pAnda == tail)
		    		tail = pAnt; // Atualiza o fim
		    	pAnt.setProx(pAnda.getProx());
			}
    		pAnda.setProx(null);
	      	pAnda = pAnt = null;
	    	size--;
	      	return true;    // remoção realizado como sucesso
	      }
	    }
	}
	// pollFirst(): remove e retorna o primeiro elemento da lista
	public T pollFirst(){
	    if (isEmpty()) return null; // Se lista vazia, não é possível remover
	    else{  // Remove primeiro elemento da lista e retorna o dado
		  Node<T> pAux = head;
		  if (size == 1) { // caso haja somente um elemento na lista
			  head = tail = null;
		  } else { // há mais de um elemento na lista
			  head = head.getProx();
			  tail.setProx(head);
		  }
    	  size--;
	      return pAux.getData();
	    }
	}	
	// pollLast(): remove e retorna o último elemento da lista
	public T pollLast(){
	    if (isEmpty()) return null; // Se lista vazia, não é possível remover
	    else{  
		  Node<T> pAnda = head, pAnt = null;
	      // procura o elemento final da lista
		  int contador = 1;
	      while ((contador != size)){
	        pAnt = pAnda;
	        pAnda = pAnda.getProx();
	        contador++;
	      }  // Remove o elemento e retorna o dado
	      if (size == 1) {
	    	  head = tail = null;
	      } else {
	    	  tail = pAnt;
	    	  pAnt.setProx(pAnda.getProx());
	      }
    	  size--;
	      return pAnda.getData();
	    }
	}

	// ---------------------------------------- METODO INVERTE (exercicio 6) ----------------------------------------
    /*
    6) Fazer um método da classe CircleLinkedList que inverte o conteúdo da lista ligada circular.
    Protótipo: public void inverte().
    */
    public void inverte(){
        if(size <= 1){
            return;
        }

        Node<T> anterior = this.tail;  // Ponteiro anterior ao que anda
		Node<T> pAnda = this.head; // Ponteiro que anda na lista ligada
        Node<T> proximo = pAnda.getProx(); // Ponteiro para o proximo node


		while(proximo != this.head){
			pAnda.setProx(anterior);
			anterior = pAnda;
			pAnda = proximo;
            proximo = proximo.getProx();
		}
		pAnda.setProx(anterior);
		this.tail = this.head;
		this.head = pAnda;
	}
	// ---------------------------------------- METODO CONCATENA (exercicio 9) ----------------------------------------
	/*
	9) Fazer um método da classe CircleLinkedList que concatena uma outra lista ligada circular no
	final da original interna à classe. Protótipo: public void concatena(CircleLinkedList<T> lista).
	*/

	public void concatena(CircleLinkedList<T> nova_lista){
		// obrigatorio tratar a primeira lista como "this"
        if(nova_lista.getSize() == 0) return;
        if(this.getHead() == null){
			this.head = nova_lista.getHead();
			this.tail = nova_lista.getTail();
			this.tail.setProx(this.head);
			this.size = nova_lista.getSize();
			return;
		}

        this.getTail().setProx(nova_lista.getHead()); // liga o ultimo node da lista 1 no head da nova lista
        nova_lista.getTail().setProx(this.head); // liga o ultimo node da nova lista no head da lista 1 (mantendo circularidade)

        this.tail = nova_lista.getTail(); // atualiza o tail
		size += nova_lista.getSize(); // atualiza o tamanho da lista
	}





	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		int qtde = 0;

	    sb.append("L: [ ");
	    Node<T> pAnda = head;
	    while (qtde != size) {
	      sb.append(pAnda.getData()+" ");
	      qtde++;
	      pAnda = pAnda.getProx();
	    }
	    sb.append("]\n");
	    
	    sb.append("Qtde.: " + size);
	    if (size != 0) {
	    	sb.append("\nPrimeiro: " + head.getData() + 
	    			", Ultimo: " + tail.getData());
	    }
    
	    return sb.toString();
	}
	
}
