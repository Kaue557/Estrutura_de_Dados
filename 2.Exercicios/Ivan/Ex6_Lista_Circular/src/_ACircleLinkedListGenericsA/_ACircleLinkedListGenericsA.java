package _ACircleLinkedListGenericsA;

import java.util.Scanner;

//Classe _ACircleLinkedListGenericsA: encarregada de executar alguns 
//testes/funcionalidades com a estrutura de dados CicleLinkedList.
//Autor 1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class _ACircleLinkedListGenericsA {
	private static Scanner ler = new Scanner(System.in);
	
	// bancoDeDados(LinkedList<Trabalhador> func): realiza o cadastro de 10
	//  trabalhadores na lista ligada (LinkedList) func.
	public static void bancoDeDados(CircleLinkedList<Trabalhador> func) {
		func.addLast(new Trabalhador(1, 25, 'M', 5000.0f, "Analista Jr."));
		func.addLast(new Trabalhador(2, 22, 'M', 3000.0f, "Auxiliar Administrativo."));
		func.addLast(new Trabalhador(3, 27, 'F', 5000.0f, "Analista Jr."));
		func.addLast(new Trabalhador(4, 35, 'M', 7000.0f, "Programador Sr."));
		func.addLast(new Trabalhador(5, 45, 'F', 7000.0f, "Gerente Jr."));
		func.addLast(new Trabalhador(6, 51, 'M', 7500.0f, "Gerente Pleno"));
		func.addLast(new Trabalhador(7, 60, 'M', 8000.0f, "Vice-Presidente"));
		func.addLast(new Trabalhador(8, 34, 'F', 7000.0f, "Analista Pleno"));
		func.addLast(new Trabalhador(9, 43, 'F', 8000.0f, "Programador Sr."));
		func.addLast(new Trabalhador(10, 63, 'F', 10000.0f, "Presidente"));
	}
	// demiteFuncionarios(LinkedList<Trabalhador> func): remove funcionários demitidos da lista
	//   de funcionários da empresa enquanto o usuário desejar.
	public static void demiteFuncionarios(CircleLinkedList<Trabalhador> func) {
		System.out.println("Deseja demitir um funcionário (S/N)?");
		char opcao = ler.next().charAt(0);
		while (opcao == 'S' || opcao == 's') {
			int size = func.getSize(), cont = 0;
			System.out.println("Forneça o número do funcionário: ");
			int idFunc = Integer.parseInt(ler.next());
			boolean removeu = false;
			// Percorre a lista de funcionários
			while ((cont < size) && !removeu) {
				cont++;
				Node<Trabalhador> funcionario = func.get(cont);
				// se encontrou o funcionário remove
				if (funcionario.getData().getId() == idFunc) {
					func.remove(funcionario.getData());
					System.out.println(String.format("Funcionário %3d encontrado e removido com sucesso!", idFunc));
					removeu = true;
				}
			}
			if (!removeu) {
				System.out.println(String.format("Funcionário %3d NÃO foi encontrado!", idFunc));
			}
			System.out.println("Deseja continuar a demitir um funcionário (S/N)?");
			opcao = ler.next().charAt(0);
		}
	}
	public static void main(String[] args) {	
		CircleLinkedList<Trabalhador> func = new CircleLinkedList<Trabalhador>();
		
		bancoDeDados(func);
		System.out.println(func);
		
		CircleLinkedList<Trabalhador> contratados = new CircleLinkedList<Trabalhador>();
				
		contratados.addLast(new Trabalhador(11, 23, 'M', 3900.0f, "Programador Jr."));
		contratados.addLast(new Trabalhador(12, 29, 'F', 4500.0f, "Secretária Bilíngue"));		
		contratados.addLast(new Trabalhador(13, 35, 'M', 6000.0f, "Programador Pleno"));		
		contratados.addLast(new Trabalhador(14, 53, 'M', 5000.0f, "Programador Jr."));
		contratados.addLast(new Trabalhador(15, 63, 'F', 8000.0f, "Analista Sr."));
		contratados.addLast(new Trabalhador(16, 56, 'M', 9000.0f, "Analista Sr."));
		
		demiteFuncionarios(func);
		System.out.println(func);
		
	}}
