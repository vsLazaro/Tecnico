package Exercicio6;

import Exercicio2.Caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println(Caixa.mostrarMenu());

        boolean option = false;
        do {
            System.out.println("Deseja fazer um novo pedido? \"sim\" para fazer pedido ou qualquer outra coisa para sair");
            option = (read.next().equalsIgnoreCase("sim"));
            System.out.println(Menu.novoPedido(option));
        } while (option);

    }
}
