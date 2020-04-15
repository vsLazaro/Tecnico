package Desafio_Banco;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount implements Account {

    private double balance;
    private ArrayList<String> history;

    public SavingsAccount() {
        this.history = new ArrayList<String>();
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public ArrayList<String> getHistory() {
        return history;
    }

    @Override
    public void deposit(double value) {
        history.add("\nDepósito de " + value);
        this.balance = this.balance + value;
    }

    @Override
    public void withdraw(double value) {
        this.history.add("\nSaque de " + value);
        this.balance = this.balance - value;
    }

}
