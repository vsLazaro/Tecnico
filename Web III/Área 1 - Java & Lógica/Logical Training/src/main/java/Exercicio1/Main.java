package Exercicio1;

import java.util.Scanner;

import static Exercicio1.Calendario.searchMonth;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número e te responderei qual é o mês equivalente...");
        System.out.println(searchMonth(read.nextInt()));

    }
}