package Escola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Aluno aluno = new Aluno("Beto");
        double[] notas = new double[4];

        notas[0] = 8;
        notas[1] = 6.4;
        notas[2] = 9.2;
        notas[3] = 10;
        aluno.setNotas(notas);

        System.out.println(aluno);
    }
}
