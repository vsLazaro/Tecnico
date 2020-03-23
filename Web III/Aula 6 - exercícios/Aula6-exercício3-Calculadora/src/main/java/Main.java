import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Bem-vindo a calculadora! Digite 2 números para calcular.");
        double input1 = read.nextDouble();
        double input2 = read.nextDouble();

        Calculator calculator = new Calculator(input1, input2);

        double somado = calculator.sumValues();
        double subtraido = calculator.subtractValues();
        double multiplicado = calculator.multiplyValues();
        double dividido = calculator.divideValues();

    }
}
