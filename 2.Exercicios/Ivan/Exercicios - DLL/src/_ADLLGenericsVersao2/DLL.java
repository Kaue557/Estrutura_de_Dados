package _ADLLGenericsVersao2;

//Classe DLL<T>: encarregada de manipular a estrutura de dados
//lista duplamente ligada ordenada e circular genérica segundo uma chave (key)
// do tipo int.
//
//Autor1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class DLL<T> {
	private	Node<T> head;
	private int size;
	
	// DLL(): Construtor vazio
	// inicia o cabeça da lista como null e tamanho = 0
	public DLL(){
		this.head = null;
		this.size = 0;
	}
	// isEmpty(): verifica se a lista está vazia, retornando "true" se vazia
	// "false" se não vazia.
	public boolean isEmpty() { // Verifica se DLL está vazia
		return head == null;
	}
	// isFull(): verifica se a lista está cheia, retornando "true" se cheia
	// "false" se não cheia.
	public boolean isFull() {
		return false;
	}
	

	// getSize(): retorna o tamanho da lista (total de elementos armazenados).
	public int getSize() { return size; }
	
	// getHead(): retorna o Node cabeça de lista.
	public Node<T> getHead() { return head; }
	
	// showAscending(): Percorre a DLL em ordem crescente 
	// e mostra os seus valores
	public void showAscending(){
		// Percorre a lista e imprime os valores
		// em ordem Crescente
		if (isEmpty()) System.out.print( "Lista vazia!\n");
		else{
			System.out.print( "Lista: [ ");
			Node<T> pAnda = this.head;
			while (pAnda.getRight() != this.head){
				System.out.print( pAnda.getData());
				pAnda= pAnda.getRight();
			}
			System.out.print( pAnda.getData() +"]");
		}
	}
	// showDescending(): Percorre a DLL em ordem decrescente e mostra os seus valores
	public void showDescending(){
		// Percorre a lista e imprime os valores
		// em ordem decrescente
		if (isEmpty()) System.out.print( "Lista vazia!\n" );
		else{
			System.out.print( "Lista: [ " );
			Node<T> pAnda = this.head;
			while (pAnda.getLeft() != this.head){
				pAnda= pAnda.getLeft();
				System.out.print( pAnda.getData() );
			}
			System.out.print( pAnda.getLeft().getData() + "]");
		}
	}

	// insertAscending(int Key, T data): Insere um novo elemento na DLL na ordem
	// crescente
	public boolean insertAscending(int Key, T data){
		if (isFull()) return false; // desnecessario*
		
		// Cria um novo no
		Node<T> novoNo = new Node<T>(Key, data, null, null);

		// se lista vazia, insere o nó no ponteiro cabeça
		// e faz o nó apontar para ele mesmo
		if (isEmpty()) {
			this.head = novoNo;
			novoNo.setRight(novoNo);
			novoNo.setLeft(novoNo);
		} else { 
		    // Caso contrário, procura posição de inserção
		    // na ordem crescente de valores
			Node<T> pAnda = this.head, pAnt = null;
			while (pAnda.getRight() != head && pAnda.getKey() < Key){
					pAnt = pAnda;
					pAnda = pAnda.getRight();
			}	
			// Se não andou na lista e a Key que pAnda aponta
		    // é maior que a Key a ser inserida, significa que a Key
			// a ser inserida é antes do cabeça
			// e cabeça precisa ser redefinido
			if (pAnt == null && pAnda.getKey() > Key){
				novoNo.setLeft(this.head.getLeft());
				this.head.getLeft().setRight(novoNo);
				this.head.setLeft(novoNo);
				novoNo.setRight(this.head);
				this.head = novoNo;
			} else {
				// Caso pAnda tenha caminhado na lista e
				// a Key que o pAnda aponta é maior do que a Key a ser inserido
				// insere o nó depois do ponteiro anterior pAnt
			 	if (pAnda.getKey() > Key && pAnt != null) {	 
					pAnt.getRight().setLeft(novoNo);
					novoNo.setRight(pAnda);
					pAnt.setRight(novoNo);
					novoNo.setLeft(pAnt);
				} else {// Senão, insere a Key depois do pAnda
			    	pAnda.getRight().setLeft(novoNo);
					novoNo.setRight(pAnda.getRight());
					pAnda.setRight(novoNo);
					novoNo.setLeft(pAnda);
				}
			}
		}
		this.size++;
		return true;
	}	
	// search(int Key): procura e retorna o nó da Key passada como parâmetro
	public Node<T> search(int Key){
			// Lista vazia
		if (isEmpty()) return null;
		
		// Procura o elemento 
		Node<T> pAnda = this.head;
		while (pAnda.getRight() != this.head && pAnda.getKey() != Key){
			pAnda = pAnda.getRight();
		}
		
		if (pAnda.getRight() == this.head && pAnda.getKey() != Key){// elemento não encontrado
			return null;
		} else { // elemento encontrado
			return pAnda;
		}
	}
	// get(int pos): retorna o "Node" que se encontra na posição "pos" da lista. 
	// O head está na posição 1. Lista vazia retorna null. Se pos > size retorna null.
	public Node<T> get(int pos){
	   if (isEmpty()) return null;
	   if (pos <= 0 || pos > size) return null;
	   int cont = 1;
	   Node<T> pAnda = head;
	   while (cont != pos){
		pAnda = pAnda.getRight();
		cont++;
	   }
	   return pAnda; 
	}
	// clear(): limpa a lista ligada original, deixando-a vazia
	public void clear(){
	   Node<T> pAnt, pAnda = head;
	   int total = size;
	   int cont = 0;
	   while(cont != total){
		pAnt = pAnda; // Libera o nó
		pAnda = pAnda.getRight();
		pAnt.setRight(null);
		pAnt.setLeft(null);
		pAnt = null;
	   }
	   size = 0;
	   head = null; 
	}

	// remove(int Key): Remove um elemento da DLL
	// retornando verdadeiro (se removido com sucesso) ou falso (senão foi removido)
	public boolean remove(int Key) {
		// Lista vazia
		if (isEmpty()) return false;
		
		// Procura o elemento a ser removido
		Node<T> pAnda = this.head, pAnt = null;
		while (pAnda.getRight() != this.head && pAnda.getKey() != Key){
			pAnt = pAnda;
			pAnda = pAnda.getRight();
		}
		
		if (pAnda.getRight() == this.head && pAnda.getKey() != Key){// elemento não encontrado
			return false;
		} else {
			// elemento encontrado no cabeça
			if (pAnt == null && pAnda.getKey() == Key){
				pAnda.getLeft().setRight(pAnda.getRight());
				this.head = this.head.getRight();
				this.head.setLeft(pAnda.getLeft());
				pAnda.setLeft(null);
				pAnda.setRight(null);
			} else { // elemento encontra-se no meio da lista
			    pAnt.setRight(pAnda.getRight());
			    pAnda.getRight().setLeft(pAnt);
			    pAnda.setLeft(null);
			    pAnda.setRight(null);
			}
			pAnda = null;
			this.size--;
			return true;
		}
	}

    // FUNCAO PARA INSERIR NO MEIO DA LISTA (INDEPENDENTE DO TAMANHO)
    public boolean insertMiddle(T data) {
    if (isEmpty()) return false; // nao da pra inserir em lista vazia

		int meio = size / 2;
		Node<T> pAnda = head;

		// CORRE ATE O MEIO DA LISTA
		for (int i = 0; i < meio; i++){
			pAnda = pAnda.getRight();
		}

		// inserir após pAnda (não importa se par ou ímpar)
        // ---------ERRADO(?) ESTA INSERINDO UM DEPOIS DO MEIO---------
		/*
		 primeiro linkamos o novo node com os vizinhos,
		 depois os vizinhos com o novo node
		 */
		Node<T> novo = new Node<>(data);
		novo.setRight(pAnda.getRight());
		novo.setLeft(pAnda);
		pAnda.getRight().setLeft(novo);
		pAnda.setRight(novo);
		
		size++;
    	return true;
    }

	// FUNCAO PARA INSERIR NO FIM DA LISTA
	public boolean insertEnd(T data){
        Node<T> novo = new Node<>(data);
        Node<T> pAnda = head; // inicia o pAnda (que nao vai andar)
        // nao precisa correr ate o fim da lista(?) ja que ela eh circular

        /*
		 primeiro linkamos o novo node com os vizinhos,
		 depois os vizinhos com o novo node
		 */
        novo.setLeft(pAnda.getLeft());
        novo.setRight(pAnda);
        pAnda.getLeft().setRight(novo);
        pAnda.setLeft(novo);

        return true;
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		int qtde = 0;
		sb.append("\n[Lista]\n");
	
	    sb.append("L: [ ");
	    Node<T> pAnda = head;
	    while (qtde != size) {
	      sb.append(pAnda.getData());
	      qtde++;
	      pAnda = pAnda.getRight();
	    }
	    sb.append("]\n");
	    
	    sb.append("Qtde.: " + size);
	    sb.append("");	    
	    return sb.toString();
	}
	
}