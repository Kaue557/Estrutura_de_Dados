public class TestaTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno("Kaue", 7.5, 6.5);
        Aluno a2 = new Aluno("Theo", 8.5, 9.5);
        Aluno a3 = new Aluno("solov", 5.5, 6.5);

        turma.adicionaAluno(a1);
        turma.adicionaAluno(a2);
        turma.adicionaAluno(a3);

        turma.imprimeLista();
        double mediaTurma = turma.calculaMediaturma();
        System.out.printf("Media da turma = %5.2f", mediaTurma);
        System.out.println();

    }
}
