package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Caixa caixa1 = new Caixa();
        System.out.println(Caixa.mostrarMenu());

        System.out.println("Digite o número de acordo com a opção escolhida e depois a quantidade.");
        System.out.println(caixa1.gerarItemNotaFiscal(read.nextByte(), read.nextInt()));
    }
}
