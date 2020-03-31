package Desafio_Computador;

import Desafio_Computador.classes.Computer;
import Desafio_Computador.classes.Memory;
import Desafio_Computador.classes.MotherBoard;
import Desafio_Computador.classes.Processor;

public class Main {
    public static void main(String[] args) {
        Memory memory = new Memory("16GB", "Kingston");
        MotherBoard motherboard = new MotherBoard("ATX", "Asus", 3, 5);
        Processor processor = new Processor("3.5GHz", "Intel", "core i9", "9ª");

        Computer computer = new Computer("Dell", "Vostro", "notebook", memory, motherboard, processor);

        computer.on();
        computer.restart();
        computer.hibernate();

    }
}
