import java.util.Date;
import java.util.UUID;

public class Professor extends Pessoa {

    private UUID numeroRegistro;
    private double valorHora;
    private double horasTrabalhadas;

    public Professor(String nome, String sobrenome, String email, Date dataDeNascimento, double valorHora) {
        super(nome, sobrenome, email, dataDeNascimento);
        this.numeroRegistro = UUID.randomUUID();
        this.valorHora = valorHora;
    }

    public UUID getNumeroRegistro() {
        return numeroRegistro;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularFGTS() {
        return calularSalarioBruto() * 2;
    }

    private double calularSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }
}
