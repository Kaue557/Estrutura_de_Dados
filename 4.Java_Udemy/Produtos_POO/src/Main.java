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

        System.out.println();
        System.out.println("Digite o numero de produtos a ser adicionado ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionaProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.println("Digite o numero de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);


        sc.close();
    }
}
