public class Main {
    public static void main(String[] args) {
        Produto caneta = new Produto("caneta bic", 0.9f, 60);

        float valorEstoque = caneta.calcularValorEstoque();

        System.out.println(valorEstoque);
    }
}
