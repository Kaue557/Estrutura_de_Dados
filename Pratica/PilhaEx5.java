/*
Considere o trecho de código abaixo para a pilha P (tam. 100) com valores
numéricos inteiros positivos. Faça um programa que remova todos os múltiplos
de 3 de P1 e mantenha a mesma ordem dos elementos não múltiplos.
 */

import java.util.Scanner;

public class PilhaEx5 {
    public static void main(String[] args) {
        
        Pilha p = new Pilha(100);
        Pilha aux = new Pilha(100); // Pilha auxiliar para manter a ordem

        int n, cont = 0;
        
        char resp;
        
        Scanner entrada = new Scanner(System.in);

        do { // leitura dos números
            System.out.print("Deseja fornecer um nro (S/N): ");
            resp = entrada.next().toUpperCase().charAt(0);

            if (resp == 'S') {
                System.out.print("Forneça o " + ++cont + "o nro: ");
                n = entrada.nextInt();
                try{
                    p.push(n);
                } catch (Exception e){
                    System.out.println("Erro ao inserir na pilha: " + e.getMessage());
                }

            }
        } while (resp == 'S');

        entrada.close();

        // INSERIR O SEU CÓDIGO AQUI

        // Remover múltiplos de 3 mantendo a ordem
        try {
            // Passo 1: retirar de p e colocar em aux só os não múltiplos de 3
            while (!p.isEmpty()) {
                int valor = p.pop();
                if (valor % 3 != 0) {
                    aux.push(valor);
                }
            }

            // Passo 2: devolver de aux para p, restaurando a ordem original
            while (!aux.isEmpty()) {
                p.push(aux.pop());
            }
        } catch (Exception e) {
                System.out.println("Erro ao manipular a pilha: " + e.getMessage());
            }

        // Exibir pilha final
        System.out.println("Pilha final (sem múltiplos de 3):");
        try {
            while (!p.isEmpty()) {
                System.out.print(p.pop() + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Erro ao imprimir a pilha: " + e.getMessage());
        }
    }
}
