package Aula_Contador;
public class TestaContador {
    public static void main(String[] args){
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        c1.incrementar();
        c1.incrementar();
        c2.incrementar();

        System.out.printf("C1: %d\n", c1.valor);
        System.out.printf("C1: %d\n", c2.valor);
    }
}
