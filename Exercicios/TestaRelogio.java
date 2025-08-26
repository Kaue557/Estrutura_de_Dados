
public class TestaRelogio {
    public static void main(String[] args) {
        RelogioDigital relogio = new RelogioDigital(23, 59, 50);
        while(true){
            System.out.println(relogio.getHorario());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.exit(0);
            }
            relogio.tick();
        }
    }
}
