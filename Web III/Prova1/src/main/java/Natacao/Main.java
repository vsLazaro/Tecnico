package Natacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nadador nadador = new Nadador("Joao" , 25);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome");
        nadador.setNome(scanner.next());
        System.out.println("Insira sua idade");
        nadador.setIdade(scanner.nextInt());

        if (nadador.getIdade() >= 8 ) {
            System.out.println("Pela sua idade você se classifica para o  grupo: " + nadador.mostrarNivel());
        } else {
            System.out.println("Idade Inválida. É necessário ser maior de 8");
        }
    }
}