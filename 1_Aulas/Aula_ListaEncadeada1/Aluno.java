public class Aluno {
    private double nota1, nota2;
    private String nome;
    public Aluno(String nome, double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nome = nome;
    }

    public double calculaMedia(){
        return (nota1+nota2)/2;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " Nota1: " + nota1 + " Nota2: " + nota2;
    }
}
