package _ADLLGenericsVersao2;


//Classe _ADLLGenericsVersao2: encarregada de executar alguns 
//testes/funcionalidades com a estrutura de dados lista circular duplamente encadeada
//e ordenada (Versão 2). A chave de comparação é realizada com um parâmetro tipo int 
//que também consta no objeto. No caso da Classe Trabalhador, corresponde ao seu atributo
// "id".
//
//Autor 1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class _ADLLGenericsVersao2 {
	
	// bancoDeDados(DLL<Trabalhador> func): realiza o cadastro de 10
	//  trabalhadores na lista duplamente ligada (DLL) func.
	public static void bancoDeDados(DLL<Trabalhador> func) {
		func.insertAscending(1, new Trabalhador(1, 25, "1165822", 'M', 5000.0f, "Analista Jr."));
		func.insertAscending(2, new Trabalhador(2, 22, "1263814", 'M', 3000.0f, "Aux. Admin."));
		func.insertAscending(3, new Trabalhador(3, 27, "1066325", 'F', 5000.0f, "Analista Jr."));
		func.insertAscending(4, new Trabalhador(4, 35, "1005116", 'M', 7000.0f, "Programador Sr."));
		func.insertAscending(5, new Trabalhador(5, 45, "1465881", 'F', 7000.0f, "Gerente Jr."));
		func.insertAscending(6, new Trabalhador(6, 51, "1665227", 'M', 7500.0f, "Gerente Pleno"));
		func.insertAscending(7, new Trabalhador(7, 60, "1775441", 'M', 8000.0f, "Vice-Presidente"));
		func.insertAscending(8, new Trabalhador(8, 34, "2166629", 'F', 7000.0f, "Analista Pleno"));
		func.insertAscending(9, new Trabalhador(9, 43, "1000823", 'F', 8000.0f, "Programador Sr."));
		func.insertAscending(10, new Trabalhador(10, 63, "0665340", 'F', 10000.0f, "Presidente"));
	}
	public static void main(String[] args) {	
		DLL<Trabalhador> func = new DLL<Trabalhador>();
		bancoDeDados(func);

        /*
		System.out.println("*** Funcionários ordenados por id ***");
		System.out.println(func);
		int key = 5;
		Node<Trabalhador> funcionario = func.search(key);
		System.out.print("Funcionário de chave " + key + ": ");
		System.out.print(funcionario.getData()+ "\n");
		key = 6;
		funcionario = func.search(key);
		if (func.remove(key)) {
			System.out.println("\nFuncionário " + key + " removido com sucesso!");
			System.out.println("Dados do Funcionário: " + funcionario.getData());
		} else
			System.out.println("Funcionário" + key + " não foi encontrado!");			
		System.out.println("Funcionários em ordem crescente: ");
		func.showAscending();
		System.out.println("\nFuncionários em ordem decrescente: ");
		func.showDescending();
		*/

		
		Trabalhador t1 = new Trabalhador(11, 30, "Joao123", 'M', 20.0f, "Analista");
		func.insertMiddle(t1);

		func.showDescending();


	}
}
