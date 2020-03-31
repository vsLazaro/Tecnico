package Desafio_Funcionario;

public class Designer extends Funcionario {
    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonificacao() {
        return (getSalario()*0.5)+1000;
    }
}
