import java.util.Scanner;

public class TrianguloSemPOO {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double xA = 0, xB = 0, xC = 0, yA = 0, yB = 0, yC = 0;

        System.out.println("Entre com as medidas do tringulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do tringulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double px = (xA + xB + xC)/2.0;
        double areax = Math.sqrt(px*(px-xA)*(px-xB)*(px-xC));

        double py = (yA + yB + yC)/2.0;
        double areay = Math.sqrt(py*(py-yA)*(py-yB)*(py-yC));

        System.out.printf("Area do triangulo X = %.2f%n", areax);
        System.out.printf("Area do triangulo Y = %.2f%n", areay);


        sc.close();
    }
}
