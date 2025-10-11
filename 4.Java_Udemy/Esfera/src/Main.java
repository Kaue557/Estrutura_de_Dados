import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferencia = %.2f%n", c);
        System.out.printf("Volume = %.2f%n", v);
        System.out.printf("PI = %.2f%n", calc.PI);

;
        sc.close();
    }
    
}
