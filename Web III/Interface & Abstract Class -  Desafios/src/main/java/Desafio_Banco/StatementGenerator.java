package Desafio_Banco;

public class StatementGenerator {

    public String accountStatement(Account account) {
        return "Extrato da conta: " + account.getHistory() +"\nSaldo: " + account.getBalance();
    }
}