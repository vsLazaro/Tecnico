package ParesOrdenados;

/**
 * Classe para calcular operações matemáticas com pontos cartesianos bidimencionais.
 *
 * @author CamisNew
 * @since 08/04/2020
 * @version 1.0
 */
public class BidimensionalOperations {

    public static double twoPointsDistance(ParOrdenado a, ParOrdenado b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY() - b.getY()),2));
    }
}
