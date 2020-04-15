package Desafio_Fruta;

public class Orange extends Fruit {
    public Orange() {
        setColor("Laranja");
    }

    @Override
    void eat() {
        System.out.println("\nComendo uma laranja...");
        peal();
        slice();
        System.out.println("Comendo laranja");
    }

    public void peal() {
        System.out.println("Usando uma faca para descascar a laranja.");
    }
}
