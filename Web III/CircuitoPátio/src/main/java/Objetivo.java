public class Objetivo {

    private String nome;

    public Objetivo (String alvo) {
        this.nome = alvo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Seu objetivo é" + nome;
    }
}
