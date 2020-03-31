package Desafio_Banco;

public class Main {
    public static void main(String[] args) {
        StatementGenerator geradorExtrato = new StatementGenerator();


        SavingsAccount contaZe = new SavingsAccount();

        contaZe.deposit(500);
        contaZe.withdraw(10);
        System.out.println("\nConta do Zé" + geradorExtrato.accountStatement(contaZe));

        CurrentAccount contaJohnDo = new CurrentAccount();

        contaJohnDo.deposit(500);
        contaJohnDo.withdraw(10);
        System.out.println("\nConta do John" + geradorExtrato.accountStatement(contaJohnDo));


    }
}
