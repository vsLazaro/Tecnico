package Desafio_Fruta;

public class Apple extends Fruit {
    public Apple() {
        setColor("Vermelha");
    }

    public void green() {
        setColor("verde");
    }

    @Override
    void eat() {
        String maca = "maçã"+ (this.getColor().equals("verde") ? " verde" : "");
        System.out.println("\nComendo "+maca+"...");
        wash();
        slice();
        System.out.println("Comendo fatias de " + maca + ".");
    }
}
