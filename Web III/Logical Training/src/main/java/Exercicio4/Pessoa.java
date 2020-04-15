package Exercicio4;

/**
 * Classe que define uma pessoa e suas características físicas.
 *
 * @author CamisNew
 * @version 1.0
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, String sexo, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
