package Desafio_Computador.classes;

import Desafio_Computador.interfaces.IComputer;

public class Computer implements IComputer {

    private boolean powerStatus;
    private String brand;
    private String model;
    private String type;
    private Memory memory;
    private MotherBoard motherBoard;
    private Processor processor;

    public Computer(String brand, String model, String type, Memory memory, MotherBoard motherBoard, Processor processor) {
        this.powerStatus = false;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.processor = processor;
    }

    @Override
    public void on() {
        this.powerStatus = true;
    }

    @Override
    public void off() {
        this.powerStatus= false;
    }

    @Override
    public void restart() {
        if (!powerStatus) {
            throw new Error("Não dá pra reiniciar algo que não está ligado!");
        }
        this.on();
        this.off();
        this.on();
    }

    @Override
    public void hibernate() {
        System.out.println("Entrando em modo hibernação. Gasto de energia reduzido.");
    }
}
