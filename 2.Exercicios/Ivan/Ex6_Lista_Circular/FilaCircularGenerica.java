package FilaCircularGenerica;

import java.util.Scanner;

/*
Teste a Fila circular dinâmica e sequencial com classe
Usa a fila para calcular o produto de dois números
criação: 28/02/2023.
prof. Dr. Ivan Carlos Alcântara de Oliveira
*/
public class FilaCircularGenerica {

	public static void main(String[] args) {
		try {
		   Scanner s = new Scanner(System.in);
		   int n1, n2, n1aux, n2aux,  valor;
		   
		   FilaCircular<Integer>  F = new FilaCircular<Integer>();
		 
		   System.out.print("Digite um número: "); 
		   n1 = s.nextInt();
		   
		   System.out.print("Digite outro número: "); 
		   n2 = s.nextInt();

		   n1aux = n1; 
		   n2aux = n2;
		   System.out.println(F);
		   System.out.println("\nTamanho da Fila Início: " + F.totalElementos());
		   while ( n1aux >= 1) {
		     if (n1aux % 2 == 1)
		       F.enqueue( n2aux );
		    n1aux = n1aux / 2;
		    n2aux = n2aux * 2;
		   }
		   
		   System.out.println("Tamanho da Fila: " + F.totalElementos() );
		   
		   System.out.println(F);
		   int v;
		   valor = 0;
		   while (! F.qIsEmpty() ){
		     v = F.dequeue();
		     valor = v + valor;
		   }
		   System.out.println("\nO produto de " + n1 + " por " + n2 + " = " + valor + ".\n");
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} 
	}

}
