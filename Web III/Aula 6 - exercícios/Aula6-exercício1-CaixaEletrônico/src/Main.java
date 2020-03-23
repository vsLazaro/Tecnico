public class Main {

    public static void main(String[] args) {
        BankAccount contaDoZe = new BankAccount();

        contaDoZe.deposit(1000f);
        contaDoZe.withdraw(200f);
        contaDoZe.deposit(50f);
        System.out.println(contaDoZe.getBalance());
    }
}
