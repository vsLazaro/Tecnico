package ParesOrdenados;

/**
 * Classe que define um ponto no plano cartesiano de 2 dimensões (x e y).
 *
 * @author CamisNew
 * @since 08/04/2020
 * @version 1.0
 */
public class ParOrdenado {

    private double x;
    private double y;

    public ParOrdenado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + "e y=" + y ;
    }
}
