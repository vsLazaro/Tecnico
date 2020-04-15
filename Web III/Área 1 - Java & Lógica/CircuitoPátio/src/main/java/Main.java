public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcos");

        pessoa1.levantar();
        pessoa1.andar(2);
        pessoa1.virar("esquerda");
        pessoa1.andar(pessoa1.localizar("corredor"));
        pessoa1.virar("direita");
        pessoa1.andar(pessoa1.localizar("final da rampa"));
        pessoa1.virar("direita");
        pessoa1.andar(pessoa1.localizar("porta"));
        pessoa1.andar(pessoa1.localizar("mesa sob ar condicionado"));
        pessoa1.sentar(pessoa1.localizar("cadeira"));
        pessoa1.beber(pessoa1.localizar("café"));
    }
}
