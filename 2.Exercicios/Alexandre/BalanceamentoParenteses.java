import java.util.Scanner;

public class BalanceamentoParenteses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Expressao: ");

        String exp = entrada.nextLine();
        entrada.close();
        try {
        boolean balanceada = isBalanceada(exp);
        if(balanceada){
            System.out.println("Expressao balanceada");
        } else {
            System.out.println("NAO balanceada");
        }
        } catch(Exception e){
            System.out.println("erro");
        }
    }
    public static boolean isBalanceada(String exp){
        Pilha<Character> pilha = new Pilha<>();
        char c;
        for(int i = 0; i < exp.length(); i++){
            c = exp.charAt(i);
            try{
            if(c == '('){
                pilha.push(c);
            } else if(c == ')'){
                if(pilha.isEmpty()){
                    return false;
                } else {
            } pilha.pop();
        }
        }catch (Exception e){
            System.out.println("ERRO!!!!");
        }
        }
        return pilha.isEmpty();
    }
}
