import java.util.Date;

public class Aluno extends Pessoa {

    private float nota1;
    private float nota2;

    public Aluno(String nome, String sobrenome, String email, Date dataDeNascimento) {
        super(nome, sobrenome, email, dataDeNascimento);
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMediaAritimetica() {
        return (this.nota1 + this.nota2)/2;
    }
}
