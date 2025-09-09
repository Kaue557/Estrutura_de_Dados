/*
Considere o trecho de código abaixo para a pilha P (tam. 100) com valores
numéricos inteiros positivos. Faça um programa que remova todos os múltiplos
de 3 de P1 e mantenha a mesma ordem dos elementos não múltiplos.
 */

import java.util.Scanner;

public class PilhaEx5 {
    public static void main(String[] args) {
        
        Pilha p = new Pilha(100);

        int n, cont = 0;
        char resp;
        
        Scanner s = new Scanner(System.in);

        do { // leitura dos números
            System.out.print("Deseja fornecer um nro (S/N): ");
            resp = s.next().toUpperCase().charAt(0);

            if (resp == 'S') {
                System.out.print("Forneça o " + ++cont + "o nro: ");
                n = s.nextInt();
                try{
                    p.push(n);
                } catch (Exception e){
                    System.out.println("Erro ao inserir na pilha: " + e.getMessage());
                }

            }
        } while (resp == 'S');

        // INSERIR O SEU CÓDIGO AQUI
    }
}

