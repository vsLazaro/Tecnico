package Desafio_Funcionario;

public class Diretor extends Funcionario {
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonificacao() {
        return getSalario()*0.5;
    }
}
