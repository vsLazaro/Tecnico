package Desafio_Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor("Pedro", 3000);
        Funcionario designer = new Designer("Jonas", 3000);
        Funcionario diretora = new Diretor("Cláudia", 3000);
        Funcionario vendedor = new Vendedor("Janaína", 3000);

        System.out.println("\nDesenvolvedor: " + dev);
        System.out.println("\nDesigner: " + designer);
        System.out.println("\nDiretor: " + diretora);
        System.out.println("\nVendedor: " + vendedor);
    }
}
