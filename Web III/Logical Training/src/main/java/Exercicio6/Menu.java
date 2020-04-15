package Exercicio6;

import Exercicio2.Caixa;

import java.util.Scanner;

public class Menu {

    public static String novoPedido(boolean option) {
        Scanner read = new Scanner(System.in);
        if (option) {
            Caixa caixa = new Caixa();
            StringBuilder notaFiscal = new StringBuilder();
            boolean pedidoAberto = true;
            do {
                System.out.println("Qual código do produto desejado?");
                byte codigo = read.nextByte();
                System.out.println("Quantos desse produto você quer?");
                int quantidade = read.nextInt();
                notaFiscal.append(caixa.gerarItemNotaFiscal(codigo, quantidade));
                System.out.println("Mais algum produto?  \"sim\" para continuar pedido ou qualquer outra coisa para sair");
                pedidoAberto = read.next().equalsIgnoreCase("sim");
            } while (pedidoAberto);
            return String.valueOf(notaFiscal);
        }
        return "Certo!";
    }
}
