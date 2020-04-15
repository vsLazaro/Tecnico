package Escola;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um aluno e suas notas, médias e conceitos.
 *
 * @author CamisNew
 * @version 1.0
 * @since 8/04/2020
 */
public class Aluno {
    private String name;
    public List<Double> notas;

    public Aluno(String name) {
        this.name = name;
        this.notas = new ArrayList<Double>();
    }

    public void setNotas(double[] notas) {
        for (double nota : notas) {
            this.notas.add(nota);
        }
    }

    /**
     * @return retorna a média aritimética do array de notas do aluno em questão, independente do tamanho do array
     */
    public double calcularMedia() {
        double result = 0;
        for (double nota: this.notas) {
            result += nota;
        }
        return (result/notas.size());
    }

    /**
     * @return Retorna o conceito do aluno conforme a regra de negócio.
     */
    public String mostraConceito() {
        double media = calcularMedia();
        if (media >=9 && media <=10) {
            return "A";
        } else if (media >= 7 && media < 9) {
            return "B";
        } else if (media >= 6 && media < 7) {
            return "C";
        } else if (media <= 0 && media < 6) {
            return "D";
        }
        return "Média inválida, cheque valores de entrada.";
    }

    @Override
    public String toString() {
        return "Relatório do aluno:" +
                "\nNome: " + name +
                "\nNotas: " + notas +
                "\nMédia: " + calcularMedia() +
                "\nConceito: " + mostraConceito();
    }
}
