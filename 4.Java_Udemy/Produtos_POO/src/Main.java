import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("DADOS DO PRODUTO:");

        System.out.print("Nome: ");
        produto.nome = sc.nextLine();

        System.out.print("Preco: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.nome + ", "
                + produto.preco + ", "
                + produto.quantidade);

        System.out.println(produto);

        sc.close();
    }
}
