package Desafio_BancoDetalhado;

public class ContaCorrente extends Conta {

    private static final double TAXA = 0.04;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String titular, long numero, String agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public void sacar(double valor) {
        double resultado = this.getSaldo() - valor - (valor*TAXA);
        this.setSaldo(resultado);
    }

    @Override
    public void depositar(double valor) {
        double resultado = this.getSaldo() + valor - (valor*TAXA);
        this.setSaldo(resultado);
    }

}
