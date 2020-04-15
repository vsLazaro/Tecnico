package Desafio_Fruta;

public class Banana extends Fruit {

    public Banana() {
        setColor("amarela");
    }

    @Override
    void eat() {
        System.out.println("\nComendo uma banana...");
        peal();
        System.out.println("Comendo a banana");
    }

    public void peal() {
        System.out.println("Descascando banana com a mão");
    }
}
