

// Classe LinkedList<T>: encarregada de manipular a estrutura de dados
// lista ligada genérica.
//
//Autor1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class LinkedList<T> {
	private Node<T> head; // Ponteiro cabeça de lista
	private int size; // Quantidade de elementos da lista ligada
	// LinkedList(): construtor da Lista encadeada
	public LinkedList() {
		head = null;
		size = 0;
	}
	// isEmpty(): verifica se a lista está vazia, retornando "true" se vazia
	// "false" se não vazia.
	public boolean isEmpty() {
		return getHead() == null;
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
	// getHead(): retorna o "Node" cabeça de lista	
	public Node<T> getHead() {
		return head;
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
    // insert(T id, int pos): insere o elemento "id" na posição "pos" passada como parâmetro
	// caso seja uma posição maior que o tamanho da lista, insere no final
	// se posição de inserção for inválida  (<= 0) retorna false
	public boolean insert(T id, int pos) {
		Node<T> aux; // Ponteiro auxiliar para o novo nó a ser inserido
		Node<T> pAnda; // Ponteiro que anda na lista ligada	
		Node<T> pAnt = null;  // Ponteiro anterior ao que anda
		if (pos <= 0) return false; // Se posição inválida, não insere e retorna
	    if (!isFull()){ // se há memória disponível
	      aux = new Node<T>(id, null);
	      if (isEmpty()){ // Insere no começo da lista
	    	  head = aux;
	    	  // Caso a posição a iserir seja a última ou superior, insere no final
	      } else if (pos >= size+1) {
	    		insertTail(id);
	      } else {// a posição a inserir é no meio da lista
	    	// Procura a posição de inserção
	    	int cont = 1;
	        pAnda = head;  // Ponteiro que anda até a posição de inserção 
            // Procura a posição de inserção  
	        while (pAnda.getProx() != null && cont != pos){
	           pAnt = pAnda;
	           pAnda = pAnda.getProx();
	           cont++;
	        }
        	aux.setProx(pAnda);
	        if (cont == 1) { // insere no cabeça de lista
	        	head = aux;
	        } else { // insere no meio
	        	pAnt.setProx(aux);
	        }
	      }
		  size++;
		  return true; // inserção realizada com sucesso
	    }
	    else return false; 
	};
	// addFirst(T id): insere o "id" passado como parâmetro no começo da 
	// lista (funcionalidade idêntica ao insertHead).	
	public boolean addFirst(T id){
		Node<T> aux; // Ponteiro auxiliar para o novo nó a ser inserido
		// se a lista não está cheia
	    if (!isFull()){  
	      aux = new Node<T>(id, null);
	      if (isEmpty()){ // Lista está vazia
	        head = aux;
	      }else { // Insere no começo e atualiza o ponteiro
	      	aux.setProx(head);
	      	head = aux;
	      }
    	  size++;
	      return true; // inserção realizada com sucesso
	    }
	    else return false; // não há espaço disponível em memória 
	};
	// insertHead(T id): insere o "id" passado como parâmetro no começo da 
	// lista (funcionalidade idêntica ao addFirst).	
	public boolean insertHead(T id){
		Node<T> aux; // Ponteiro auxiliar para o novo nó a ser inserido
	    if (!isFull()){ // se a lista não está cheia
	      aux = new Node<T>(id, null);
	      if (isEmpty()){ // Lista está vazia
	        head = aux;
	      }else { // Insere no começo e atualiza o ponteiro
	      	aux.setProx(head);
	      	head = aux;
	      }
    	  size++;
	      return true; // inserção realizada com sucesso
	    }
	    else return false; // não há espaço disponível em memória  
	};
	// insertTail(T id): insere o "id" passado como parâmetro no final da 
	// lista (funcionalidade idêntica ao addLast).		
	public boolean insertTail(T id){
		Node<T> aux; // Ponteiro auxiliar para o novo nó a ser inserido
		Node<T> pAnda; // Ponteiro que anda na lista ligada	
	    if (!isFull()){ // se a lista não está cheia
	      aux = new Node<T>(id, null);
	      if (isEmpty()){ // Lista está vazia
	        head = aux;
	      }else { // Insere no final e atualiza o ponteiro
	        pAnda = head;  // Ponteiro que anda até o final da lista 
	        while (pAnda.getProx() != null)
	           pAnda = pAnda.getProx();
	        pAnda.setProx( aux );
	      }
    	  size++;
		  return true;  // inserção realizada com sucesso
	    }
	    else return false; // não há espaço disponível em memória  
	};
	// addLast(T id): adiciona o "id" passado como parâmetro no final da 
	// lista (funcionalidade idêntica ao insertTail)
	public boolean addLast(T id){
		Node<T> aux; // Ponteiro auxiliar para o novo nó a ser inserido
		Node<T> pAnda; // Ponteiro que anda na lista ligada	
	    if (!isFull()){
	      aux = new Node<T>(id, null);
	      if (isEmpty()){ // Lista está vazia
	        head = aux;
	      }else { 
	        pAnda = head;  // Ponteiro que anda até o final da lista 
	        while (pAnda.getProx() != null)
	           pAnda = pAnda.getProx();
	        pAnda.setProx( aux ); // Insere no final e atualiza o ponteiro
	      }
    	  size++;
		  return true; // inserção realizada com sucesso
	    }
	    else return false;  // não há espaço disponível em memória
	};
	// search(T id): procura o elemento "id" dentro da lista
	// se "id" não existir ou lista vazia retorna null
	// caso contrário, retorna o "Node"
	public Node<T> search(T id){
		Node<T> pAnda; // Ponteiro que anda na lista ligada	
	    if (isEmpty()) {
			return null; // Lista vazia
	    }else{
	      pAnda = head;
	      // procura a posição do elemento na lista
	      while ((pAnda != null) && (pAnda.getDado().equals(id) != true))
	        pAnda = pAnda.getProx();
	      return pAnda; // Retorna a referência para o elemento	encontrado
	    }
	}
	// remove(T id): remove a primeira ocorrência do "id" na lista
	// retorna "true" se remoção com sucesso
	// ou "false" se não foi possível remover, nos casos: o elemento não existe
	// ou a lista está vazia
	public boolean remove(T id){
		Node<T> pAnda; // Ponteiro que anda na lista ligada		
		Node<T> pAnt = null; // Ponteiro anterior ao que anda na lista
	    if (isEmpty()) return false; // Se lista vazia, não é possível remover
	    else{  // caso haja elementos na lista
	      pAnda = head;
	      // procura a posição do elemento na lista
	      while ((pAnda != null) && (pAnda.getDado().equals(id) != true)){
	        pAnt = pAnda;
	        pAnda = pAnda.getProx();
	      }
	      if (pAnda == null) return false; // Se não encontrou o elemento
	      else { // Se elemento foi encontrado 
	      	// Verifica se está como cabeça da lista e remove
	      	if ((head == pAnda)) {
			  head = pAnda.getProx();
		    } else{ // remove elemento do meio/fim da lista
		    	pAnt.setProx(pAnda.getProx());
			}
	      	pAnda = null;
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
	      head = head.getProx();
    	  size--;
	      return pAux.getDado();
	    }
	}	
	// pollLast(): remove e retorna o último elemento da lista
	public T pollLast(){
	    if (isEmpty()) return null; // Se lista vazia, não é possível remover
	    else{  
		  Node<T> pAnda = head, pAnt = null;
	      // procura o elemento final da lista
	      while ((pAnda.getProx() != null)){
	        pAnt = pAnda;
	        pAnda = pAnda.getProx();
	      }  // Remove o elemento e retorna o dado
	      pAnt.setProx(null);
    	  size--;
	      return pAnt.getDado();
	    }
	}	
	// print(): percorre a lista e imprime todo o seu conteúdo
	public void print(){
		Node<T> pAnda; 
	    pAnda = head;
	    while (pAnda != null) {
	      System.out.println(pAnda.getDado());
	      pAnda = pAnda.getProx();
	    }
	}
	// clear(): limpa a lista ligada original, deixando-a vazia
	public void clear(){
		Node<T> pAnt; // Ponteiro anterior ao que anda
		Node<T> pAnda = head;  // Ponteiro que anda na lista original
		// Percorre toda a lista original removendo cada nó percorrido
		while(pAnda != null){
			pAnt = pAnda;  
			pAnda = pAnda.getProx();
			pAnt.setProx(null);
			pAnt = null;
		}
		size = 0;
		head = null; 	 
	}
	// toString(): Sobrescrita/sobreposição (override) do método toString(), que veio da superclasse Object.
	// O retorno do método toString() é a representação de um objeto em formato string, e toString()
	// geralmente é executado (de forma implícita) quando passamos um objeto ao System.out.print*().
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		int qtde = 0;
		sb.append("\n[Lista]\n");
	
	    sb.append("L: [ ");
	    Node<T> pAnda = head;
	    while (pAnda != null) {
	      sb.append(pAnda.getDado()+" ");
	      qtde++;
	      pAnda = pAnda.getProx();
	    }
	    sb.append("]\n");
	    
	    sb.append("Qtde.: " + qtde);
	    sb.append("\n");
	    
	    return sb.toString();
	}
	
}
