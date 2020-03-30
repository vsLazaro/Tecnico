package Desafio_Banco;

import java.util.ArrayList;

public class CurrentAccount implements Account {
    private static final double OPERATION_TAX = 0.45;

    private double balance;
    private ArrayList<String> history;

    public CurrentAccount() {
        this.history = new ArrayList<String>();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public ArrayList<String> getHistory() {
        return history;
    }

    @Override
    public void deposit(double value) {
        this.history.add("\nDepósito de " + value);
        this.balance = this.balance + value - OPERATION_TAX;
    }

    @Override
    public void withdraw(double value) {
        this.history.add("\nSaque de " + value);
        this.balance = this.balance - value - OPERATION_TAX;
    }

}
