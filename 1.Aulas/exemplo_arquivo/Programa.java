package exemplo_arquivo;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
// NAO COLOCAR ARQUIVO NA PASTA SOURCE (SRC)

public class Programa {
    public static void main(String[] args){
        String[] linhas = null;
        try{
            linhas = leArquivo("1.Aulas/exemplo_arquivo/arquivo.ed1");
            for(int i = 0; i < linhas.length; i++){
                if(linhas[i] == null) break;
                System.out.println(linhas[i]);
            }
        } catch (IOException e){
            System.out.println("Erro ao abrir arquivo " + e.getMessage());
        }

        if(linhas != null){
            linhas[9] = "100 out a";
            linhas[10] = "110 out b";

            try{
                gravaArquivo("1.Aulas/exemplo_arquivo/arquivo2.ed1", linhas);
            }catch(IOException e){
                System.out.println("Erro ao gravar arquivo" + e.getMessage());
            }
        }
    }

    public static String[] leArquivo(String caminho) throws IOException{
        String[] linhas = new String[100];
        String linha;

        File arquivo = new File(caminho);
        Scanner leitor = new Scanner(arquivo);
        
        int posicao = 0;
        while(leitor.hasNext()){
            linha = leitor.nextLine();
            linhas[posicao] = linha;
            posicao++;
        }
        leitor.close();
        return linhas;
    }

    public static void gravaArquivo(String caminho, String[] linhas)throws IOException{
        PrintWriter escritor = new PrintWriter(caminho);
        int posicao = 0;

        while(linhas[posicao] != null){
            escritor.println(linhas[posicao]);
            posicao++;
        }
        escritor.close();
    }


}
