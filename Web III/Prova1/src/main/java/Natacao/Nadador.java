package Natacao;

public class Nadador {

    private String nome;
    private int idade;

    public Nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    /**
     *
     * @return Retorna o nível do nadador de acordo com a idade. Se menor que 8 ou 1, retorna erro.
     */
    public String mostrarNivel() {
        if (idade >= 8 && idade <= 10) {
            return "Nadador Infantil";
        } else if (idade >= 11 && idade <= 17) {
            return "Nadador Juvenil";
        } else if (idade >= 18) {
            return "Nadador Adulto";
        }
        return "Idade Inválida";

    }
}