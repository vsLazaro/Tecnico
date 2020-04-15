package Exercicio4;

/**
 * Classe que derivada de Pessoa que utiliza algumas características para avaliar a saúde física.
 *
 * @author CamisNew
 * @version 1.0
 */
public class PesoIdeal extends Pessoa {

    private double imc;

    public PesoIdeal(String nome, int idade, String sexo, double peso, double altura) {
        super(nome, idade, sexo, peso, altura);
        this.imc = calcularImc();
    }

    public double getImc() {
        return imc;
    }

    /**
     * @return retorna o Indice de Massa Corporal calculado com base nos dados pessoais.
     */
    public double calcularImc() {
        return (getPeso() / (Math.pow(getAltura(),2)));
    }

    /**
     * @return retorna String definindo status referente ao peso ideal tendo como referencia o IMC calculado.
     */
    public String calcularPesoIdeal() {
        if (imc < 17) {
            return "muito abaixo do peso";
        } else if (17 <= imc && imc < 18.5) {
            return "abaixo do peso";
        } else if (18.5 <= imc && imc < 25) {
            return "peso normal";
        } else if (25 <= imc && imc < 30) {
            return "sobrepeso";
        } else if (30 <= imc && imc < 35) {
            return "obesidade 1";
        } else if (35 <= imc && imc <= 40) {
            return "obesidade 2";
        } else if(imc > 40){
            return "obesidade 3";
        }
        return "Erro! Confira os dados, por favor";
    }

    @Override
    public String toString() {
        return  "\nRelatório Pessoal" +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo() +
                "\nPeso: " + this.getPeso() +
                "\nAltura: " + this.getAltura() +
                "\nIMC: " + this.imc +
                "\nStatus pessoal: " + calcularPesoIdeal();
    }
}
