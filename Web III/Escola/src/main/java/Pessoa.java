import java.util.Date;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;
    private Date dataDeNascimento;

    public Pessoa(String nome, String sobrenome, String email, Date dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "\nPessoa" +
                "\nNome Completo" + nome + " " + sobrenome +
                "\nE-mail: " + email +
                "\nData de nascimento: " + dataDeNascimento;
    }
}
