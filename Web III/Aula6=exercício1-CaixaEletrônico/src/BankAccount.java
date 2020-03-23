public class BankAccount {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void withdraw(float value) {
        this.balance -= value;
    }

    public void deposit(float value) {
        this.balance += value;
    }
}
