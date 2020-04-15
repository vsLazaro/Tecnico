package Desafio_Fruta;

public abstract class Fruit {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract void eat();

    public void slice() {
        System.out.println("Cortar fruta com uma faca");
    }

    public void wash() {
        System.out.println("Lavando fruta em água corrente.");
    }

}
