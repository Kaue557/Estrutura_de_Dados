package Ex7_Ex10_Lista_Duplamente_Encadeada;


//Classe _ADLLGenericsVersao2: encarregada de executar alguns 
//testes/funcionalidades com a estrutura de dados lista circular duplamente encadeada
//e ordenada (Versão 2). A chave de comparação é realizada com um parâmetro tipo int 
//que também consta no objeto. No caso da Classe Trabalhador, corresponde ao seu atributo
// "id".
//
//Autor 1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class DLLGenericsVersao2 {
	
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

    public static void bancoDeDados2(DLL<Trabalhador> func) {
        func.insertAscending(1, new Trabalhador(11, 33, "1165829", 'M', 5000.0f, "Analista Jr."));
        func.insertAscending(2, new Trabalhador(12, 21, "1263815", 'M', 3000.0f, "Aux. Admin."));

    }

    public static void main(String[] args) {

        // Lista principal
        DLL<Trabalhador> func = new DLL<Trabalhador>();
        bancoDeDados(func);

        // Segunda lista a ser concatenada
        DLL<Trabalhador> func2 = new DLL<Trabalhador>();
        bancoDeDados2(func2);

        System.out.println("=== LISTA 1 (ORIGINAL) ===");
        func.showAscending();

        System.out.println("\n=== LISTA 2 (A SER CONCATENADA) ===");
        func2.showAscending();

        // Teste da função concatena
        func.concatena(func2);

        System.out.println("\n=== LISTA FINAL CONCATENADA ===");
        func.showAscending();
    }
}
