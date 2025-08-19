/*

*/

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] consumos = new int[5];
        int anomalos = 0;

        for(int i = 0; i < consumos.length; i++){
            System.out.printf("Digite o consumo do setor %d: ", (i+1));
            consumos[i] = entrada.nextInt();
        }
        for(int consumo : consumos){ //nao utilizar se quiser alterar a variavel, isso faz uma copia, nao acessa o original
            if(consumo > 5000){
                System.out.printf("Consumo anomalo: %.1d\n: ", consumo);
                anomalos++;
            }
        }
        System.out.printf("Quantidade de consumo anomalo: %.1d\n: ", anomalos);
    }
}
