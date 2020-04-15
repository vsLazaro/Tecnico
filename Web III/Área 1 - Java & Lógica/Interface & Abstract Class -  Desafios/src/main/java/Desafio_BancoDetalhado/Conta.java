package Desafio_BancoDetalhado;

public abstract class Conta {
    private String titular;
    private long numero;
    private String agencia;
    private double saldo;

    public Conta() {
        this.saldo=0;
    }

    public Conta(String titular, long numero, String agencia) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
