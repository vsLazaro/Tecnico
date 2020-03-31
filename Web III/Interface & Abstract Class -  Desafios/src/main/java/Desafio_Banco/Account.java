package Desafio_Banco;

import java.util.ArrayList;

public interface Account {

    void deposit(double value);
    void withdraw(double value);
    double getBalance();
    ArrayList<String> getHistory();
}
