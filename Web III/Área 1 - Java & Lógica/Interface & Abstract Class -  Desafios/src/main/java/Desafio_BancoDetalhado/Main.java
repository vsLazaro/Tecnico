package Desafio_BancoDetalhado;

public class Main {
    public static void main(String[] args) {
        String bolha = "Zé";
        Conta contaManeiraDoZe = new ContaCorrente(bolha,654987, "av do forte");
        Conta contaMaria = new ContaPoupanca("Maria", 654321, "Iguatemi");
        contaMaria.setTitular("Maria da Graça");
        contaManeiraDoZe.setTitular("Zé da Feira");

        contaManeiraDoZe.depositar(5000);
        contaManeiraDoZe.sacar(15);
        System.out.println(contaManeiraDoZe);

        contaMaria.depositar(5000);
        contaMaria.sacar(15);
        System.out.println(contaMaria);
    }
}
