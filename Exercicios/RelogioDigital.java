
public class RelogioDigital {
        // atributos
        private int hora;
        private int minuto;
        private int segundo;

        // construtor
        public RelogioDigital(){
            hora = 0;
            minuto = 0;
            segundo = 0;
        }
        // construtor
        public RelogioDigital(int hora, int minuto, int segundo){
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        }

        //Metodos
        public String getHorario(){
            return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        }

        public void tick(){
            segundo++;
            if(segundo>59){
                segundo = 0;
                minuto++;
                if(minuto>59){
                    minuto = 0;
                    hora++;
                    if(hora>23){
                        hora = 0;
                    }
                }
            }
        }

        //getters e setters
        public int getHora(){
            return hora;
        }
        public void setHora(int hora){
            if(hora >= 0 && hora <= 23){
                this.hora = hora;
            }
        }

        public int getMinuto(){
            return minuto;
        }
        public void setMinuto(int minuto){
            if(minuto >= 0 && minuto <= 59){
                this.minuto = minuto;
            }
        }

        public int getSegundo(){
            return segundo;
        }
        public void setSegundo(int segundo){
            if(segundo >= 0 && minuto <= 59){
                this.segundo = segundo;
            }
        }

    public static void main(String[] args){

    }
}
