package PostoDeGasolina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        PostoCombustivel caixa = new PostoCombustivel();

        System.out.println("Bem-vindo ao posto de gasolina ...!");
        byte option;
        do {
            System.out.println("Deseja abastecer?\n1 - abastecer\nqualquer outro número - sair");
            option = read.nextByte();
            if (option == 1) {
                System.out.println("Vamos abastecer seu carro, quantos litros você deseja?");
                double litros = read.nextDouble();
                System.out.println("Certo! Agora digite o tipo de combustivel desejado");
                String combustivel = read.next();
                System.out.println(caixa.calcularTotalCompra(caixa.validaTipoCombustivel(combustivel), litros) + "\nPrecisa abastecer novamente? 1-sim");
                option = read.nextByte();
            }
        } while (option == 1);

    }
}
