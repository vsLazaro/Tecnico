package Desafio_BancoDetalhado;

public class ContaPoupanca extends Conta {

        public ContaPoupanca() {
            super();
        }

        public ContaPoupanca(String titular, long numero, String agencia) {
            super(titular, numero, agencia);
        }

        @Override
        public void sacar(double valor) {
            double resultado = this.getSaldo() - valor;
            this.setSaldo(resultado);
        }

        @Override
        public void depositar(double valor) {
            double resultado = this.getSaldo() + valor;
            this.setSaldo(resultado);
        }
}
