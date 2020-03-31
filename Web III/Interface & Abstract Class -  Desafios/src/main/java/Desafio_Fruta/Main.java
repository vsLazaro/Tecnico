package Desafio_Fruta;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Apple greenApple = new Apple();
        Fruit banana = new Banana();
        Fruit orange = new Orange();
        Fruit watermelon = new Watermelon();

        apple.eat();
        greenApple.green();
        greenApple.eat();
        banana.eat();
        orange.eat();
        watermelon.eat();

    }
}
