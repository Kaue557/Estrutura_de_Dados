public class _AGenericsLinkedListA {

	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();

		int ids1[] = { 5, 2, 15, 7, 35, 77, 81, 15, 12, 115, 17, 135, 177, 181  };
	    
		// Insere o vetor ids1 no final da lista 
		for (int i = 0; i < ids1.length; ++i)
			lista.insertTail(ids1[i]);
		System.out.println(lista);
		
		// Verifica se o 35 está na lista
		int valor = 35;
		if (lista.search(valor) !=  null)
			System.out.println(String.format("Valor: %d, existe na lista", lista.search(valor).getDado().intValue()));
		else
			System.out.println(String.format("Valor: %d, não existe na lista", valor));
	    
	    // Remove o elemento 12 da lista
		System.out.println("Remoção do 12: ");
	    lista.remove(12);
	    System.out.println(lista);	
	    
	    // Percorre a lista e apresenta os dados
	    System.out.print("L: [ ");
	    int tam = lista.getSize();
	    for(int pos = 1; pos <= tam; pos++) {
	    	if (pos != tam)
	    	   System.out.print(String.format("%2do:%d,", pos, lista.get(pos).getDado().intValue()));
	    	else 
	    	   System.out.print(String.format("%2do:%d ", pos, lista.get(pos).getDado().intValue()));
	    }
	    System.out.println("]");
	    
	    // Insere um elemento em posição definida
	    lista.insert(200, 10);
	    System.out.println(lista);
	    }

}
