public class Turma {
    private LinkedList<Aluno> alunos;

    public Turma(){
        alunos = new LinkedList<Aluno>();
    }

    public void adicionaAluno(Aluno umAluno){
        alunos.addLast(umAluno);
    }

    public void imprimeLista(){
        int tamanho = alunos.getSize();
        Aluno umAluno;
        Double Media;
        for(int i=0; i<tamanho; i++){
            umAluno = alunos.get(i + 1).getDado();
            Media = umAluno.calculaMedia();
            System.out.println(umAluno);
            System.out.printf("Media = %5.2f", Media);
        }
    }

    public Double calculaMediaturma(){
        Node<Aluno> pAnda = alunos.getHead();
        Double soma = 0.0;
        Aluno umAluno;
        int contador = 0;

        while(pAnda != null){
            umAluno = pAnda.getDado();
            soma += umAluno.calculaMedia();
            contador++;
            pAnda = pAnda.getProx();
        }
        return soma/contador;
    }
}
