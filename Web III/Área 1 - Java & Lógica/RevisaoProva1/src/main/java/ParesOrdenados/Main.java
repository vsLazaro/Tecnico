package ParesOrdenados;

import java.util.Scanner;

import static ParesOrdenados.BidimensionalOperations.twoPointsDistance;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Bem-vind@ ao sistema de operações com pontos cartesianos.");

        int option;

        do {
            System.out.println(" Vamos definir dois pares ordenados para começar? \n1-sim\n0-sair");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite o X do primeiro par:");
                    double x1 = read.nextDouble();
                    System.out.println("Digite o Y do primeiro par:");
                    double y1 = read.nextDouble();
                    System.out.println("Digite o X do segundo par:");
                    double x2 = read.nextDouble();
                    System.out.println("Digite o Y do segundo par:");
                    double y2 = read.nextDouble();
                    ParOrdenado pontoA = new ParOrdenado(x1, y1);
                    ParOrdenado pontoB = new ParOrdenado(x2, y2);
                    System.out.println("A distância entre esses dois pontos é "+ twoPointsDistance(pontoA, pontoB));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.exit(100);
                    break;
            }
        } while (option!=0);
    }
}
