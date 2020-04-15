package Exercicio1;

/**
 * Classe dedicada a verificar e transformar unidades de tempo conforme o calendário.
 *
 * @author CamisNew
 * @version 1.0
 */

public class Calendario {

    /**
     * searchMonth é um método que identifica meses do ano em numerais(int) e transcreve(String).
     * @param value é um número inteiro (int) para ser interpretado.
     * @return é String do nome do mês equivalente escrito em português.
     */
    public static String  searchMonth(int value){
        switch(value) {
        case 1:
            return "Janeiro";
        case 2:
            return "Fevereiro";
        case 3:
            return "Março";
        case 4:
            return "Abril";
        case 5:
            return "Maio";
        case 6:
            return "Junho";
        case 7:
            return "Julho";
        case 8:
            return "Agosto";
        case 9:
            return "Setembro";
        case 10:
            return "Outubro";
        case 11:
            return "Novembro";
        case 12:
            return "Dezembro";
        default:
            return "Mês inválido";
        }
    }
}
