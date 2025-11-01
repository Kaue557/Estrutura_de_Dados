package FilaCircularGenerica;

public class FilaCircular <T>{
	// Constante e Atributos Privados
	private static final int TAM_DEFAULT = 100;
	private int inicio, fim, qtde;
	private T e[ ];
	// Métodos públicos
	public FilaCircular(int tamanho) {// construtor 1 (com tamanho)
		  this.inicio = this.fim = this.qtde = 0;
		  e = (T[]) new Object[tamanho];
	}
	
	public FilaCircular() {  // construtor 2 (sem parâmetros).
		this(TAM_DEFAULT);
	}

	// verifica se a fila está vazia
	public boolean qIsEmpty() {
		return (qtde == 0);
	}
	
	// Verifica se a fila está cheia
    public boolean qIsFull() {
    	return (qtde == e.length); 	
    }
    
    // insere um elemento no final da fila
	public void enqueue(T e) throws Exception {
		if (! qIsFull( )){
			    this.e[this.fim++] = e;
			    this.fim = this.fim % this.e.length;
			    this.qtde++;
		}
		else 
			throw new Exception("Oveflow - Estouro de Fila");	
	}
	// remove um elemento do final da fila
    public T dequeue() throws Exception {
    	  T aux;
    	  if (! qIsEmpty( )){
    	   aux =  this.e[ this.inicio];
    	   this.inicio = ++this.inicio % this.e.length;
    	   this.qtde--;
    	   return aux;
    	  }else{
    		  throw new Exception("underflow - Esvaziamento de Fila");
    	  }
    }
    // retorna quem está no início da fila
    // caso a fila não esteja vazia
	public T front() throws Exception {
		if (! qIsEmpty())
			return e[inicio];
		else{
			throw new Exception("underflow - Esvaziamento de Fila");
		}			
	}
	// retorna quem está no final da fila caso ela não esteja vazia
	public T rear() throws Exception {
		if (! qIsEmpty()){
			  int pfinal;
			  if (this.fim != 0) pfinal = this.fim - 1;
			  else pfinal = this.e.length - 1;
			  return this.e[pfinal];
		}else{
			  throw new Exception("underflow - Esvaziamento de Fila");
		}			
	}
	// Retorna o total de elementos da fila
	public	int totalElementos(){
		return qtde;
	}
	
	// Sobrescrita/sobreposição (override) do método toString(), que veio da superclasse Object.
	// O retorno do método toString() é a representação de um objeto em formato string, e toString()
	// geralmente é executado (de forma implícita) quando passamos um objeto ao System.out.print*().
	//
	// Experimente incluir o seguinte código na main() e veja a saída:
	// FilaCircular<TIPO> f = new FilaCircular<TIPO>();
	// System.out.println(f);
	//
	// Depois, remova/comente o método toString() abaixo e rode o código acima novamente.
	@Override
	public String toString()  {
		try {
			int indiceNovo = (inicio + qtde) % e.length;
		
			StringBuilder sb = new StringBuilder();
			sb.append("[Fila] quantidade: ")
				.append(qtde)
				.append(", capacidade: ")
				.append(e.length);
			if (qtde != 0) {
				sb.append(", primeiro: ")
					.append(front())
					.append(", último: ")
					.append(rear());
			} 
		
			sb.append("\nConteudo da Fila': [ ");
			if (qtde != 0) {
				if (indiceNovo <= inicio) {
					for (int i = inicio; i < e.length; ++i)
						sb.append("[" + e[i] + "]");
					for (int i = 0; i < indiceNovo; ++i)
						sb.append("[" + e[i] + "]");
				} else {
					for (int i = inicio; i < indiceNovo; ++i)
						sb.append("[" + e[i] + "]");
				}
			}
			sb.append(" ]");
			return sb.toString();
		}catch(Exception e) {
			return ("Erro: " + e.getMessage());
		} 
	}
}
