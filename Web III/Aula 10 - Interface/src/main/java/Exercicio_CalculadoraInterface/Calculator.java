package Exercicio_CalculadoraInterface;

public class Calculator implements ContractCalculator {

    private double value1;
    private double value2;

    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double sumValues() {
        return this.number1 + this.number2;
    }

    public double subtractValues() {
        return this.number1 - this.number2;
    }

    public double multiplyValues() {
        return this.number1 * this.number2;
    }

    public double divideValues() {
        double result;
        if (number2 != 0) {
            result = this.number1/number2;
        } else {
            throw new Error("Denominador inválido!");
        }
        return result;
    }
}