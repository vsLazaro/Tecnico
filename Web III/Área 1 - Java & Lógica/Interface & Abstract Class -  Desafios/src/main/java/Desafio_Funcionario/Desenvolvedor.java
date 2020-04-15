package Desafio_Funcionario;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() + 3000;
    }

}
