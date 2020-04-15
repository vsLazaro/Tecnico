package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alberto", "Silva", 6.6, 7);
        Aluno aluno2 = new Aluno("Ana", "Costa", 9.7, 8);

        System.out.println(aluno1.calculaMedia() + aluno1.estaAprovado());
        System.out.println(aluno2.calculaMedia() + aluno2.estaAprovado());
    }
}
