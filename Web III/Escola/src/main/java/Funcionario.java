import java.util.Date;
import java.util.UUID;

public class Funcionario extends Pessoa {

    private UUID numeroRegistro;
    private double salarioFixo;

    public Funcionario(String nome, String sobrenome, String email, Date dataDeNascimento, double salarioFixo) {
        super(nome, sobrenome, email, dataDeNascimento);
        this.numeroRegistro = UUID.randomUUID();
        this.salarioFixo = salarioFixo;
    }

    public UUID getNumeroRegistro() {
        return numeroRegistro;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularFGTS() {
        return salarioFixo * 2;
    }
}
