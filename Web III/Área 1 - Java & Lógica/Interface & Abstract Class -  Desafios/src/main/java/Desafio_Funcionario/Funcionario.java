package Desafio_Funcionario;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     *
     * @return
     */
    public abstract double calcularBonificacao();

    public double calcularSalarioLiquido() {
        return getSalario() + calcularBonificacao();
    }

    @Override
    public String toString() {
        return  "\nNome: " + this.nome +
        "\nSalário: " + this.calcularSalarioLiquido();
    }
}
