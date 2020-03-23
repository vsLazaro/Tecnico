public class Main {
    public static void main(String[] args) {
        Aluno ze = new Aluno("Zé Ruela", 6.7f, 4.5f);
        Aluno beto = new Aluno("Beto Gonçalves", 7.6f, 8f);
        Aluno tom = new Aluno("Tomas Jefferson", 10f, 9.7f);

        System.out.println("Média do " + ze.getNome() + " é " + ze.calculaMedia());
        System.out.println("Média do " + beto.getNome() + " é " + beto.calculaMedia());
        System.out.println("Média do " + tom.getNome() + " é " + tom.calculaMedia());
    }
}
