public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void levantar() {
        System.out.println(this.nome + " levantou.");
    }

    public void andar(Objetivo alvo) {
        System.out.println(this.nome + " andou até "+ alvo.getNome() + ".");
    }

    public void andar(int passos) {
        System.out.println(this.nome + " andou " + passos + " passos.");
    }

    public void virar(String direction) {
        System.out.println(this.nome + " virou para " + direction);
    }

    Objetivo localizar(String objetivo) {
        Objetivo localizado;
        try {
            localizado = new Objetivo(objetivo);
        } catch (NullPointerException e) {
            throw e;
        }
        return localizado;
    }

    void sentar(Objetivo objetivo) {
        if (objetivo.getNome().equals("cadeira")) {
            System.out.println(this.nome + " sentou-se");
        } else {
            System.out.println("Acho que não dá pra sentar aí");
        }
    }

    void beber(Objetivo bebida) {
        System.out.println(this.nome + " bebeu " + bebida.getNome());
    }

}
