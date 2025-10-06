import java.util.*;

class DataTypes{
    public static void main(String []argh){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Choose the number of tests: ");
        int t = entrada.nextInt();

        for(int i=0;i<t;i++){
            try{
                System.out.print("Type a number: ");
                long x = entrada.nextLong();
                System.out.println(x + " can be fitted in:");
                
                if(x >= -128 && x <= 127){
                    System.out.println("* byte");
                }if(x >= -32768 && x <= 32767){
                    System.out.println("* short");
                }if(x >= -2147483648L && x <= 2147483647L){
                    System.out.println("* int"); 
                }if(x >= -9223372036854775808L && x <= 9223372036854775807L){
                    System.out.println("* long");
                }
            }catch(Exception e){
                System.out.println(entrada.next()+" can't be fitted anywhere.");
                }
        }entrada.close();
    }
}
