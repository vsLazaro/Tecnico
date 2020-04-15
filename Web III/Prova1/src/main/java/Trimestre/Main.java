package Trimestre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Trimestre trimestre = new Trimestre();
        int mesAniversario;

        System.out.println("Digite o mês de nascimento");
        mesAniversario = ler.nextInt();

        System.out.println(trimestre.verificarTrimestre(mesAniversario));
    }
}