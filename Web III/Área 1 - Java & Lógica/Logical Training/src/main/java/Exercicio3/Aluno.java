package Exercicio3;

/**
 * Classe que define um objeto aluno com Nome, Sobrenome, Nota1, Nota2 e situação acadêmica.
 *
 * @author CamisNew
 * @version 1.0
 */
public class Aluno {
    private String nome;
    private String sobrenome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String sobrenome, double nota1, double nota2) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
        this.nota2 = nota2;
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return retorna média do aluno baseado nas notas salvas na memória.
     */
    public double calculaMedia() {
        return (nota1+nota2)/2;
    }

    /**
     * @return retorna o conceito em letras (A, B, C ou D) do aluno baseado na média dele.
     */
    public String estaAprovado() {
        double media = calculaMedia();

        if (media > 0 && media < 6 ) {
            return "D";
        } else if (media >= 6 && media < 8) {
            return "C";
        } else if (media >= 8 && media < 9) {
            return "B";
        } else if (media >= 9 && media <= 10) {
            return "A";
        }
        return "Média inválida. Cheque notas";
    }
}
