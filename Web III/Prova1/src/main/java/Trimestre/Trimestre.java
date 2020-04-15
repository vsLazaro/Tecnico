package Trimestre;

/**
 * Classe que define intervalos de 3 meses.
 */
public class Trimestre {

    /**
     * @param mesAniversario recebe um número inteiro que deve corresponder a um mês do ano
     * @return retorna uma String com o trimestre do mês informado.
     */
    public String verificarTrimestre(int mesAniversario) {
        if (mesAniversario<=3){
            return "Você nasceu no primeiro trimestre";
        } else if(mesAniversario<=6) {
            return "Você nasceu no segundo trimestre";
        } else if(mesAniversario<=9) {
            return "Você nasceu no terceiro trimestre";
        } else if(mesAniversario<=12) {
            return "Você nasceu no quarto trimestre";
        }
        return "Mês de nascimento inválido!";
    }
}