package Desafio_Fruta;

public class Watermelon extends Fruit {

    public Watermelon() {
        setColor("Verde por fora, vermelho por dentro");
    }

    @Override
    void eat() {
        System.out.println("\nComendo uma melancia...");
        slice();
        System.out.println("Comendo a parte vermelha da fatia de melancia."
                         + "\nCuspindo as sementes.");

    }
}
