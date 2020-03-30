package Desafio_Computador.classes;

import Desafio_Computador.interfaces.IProcessor;

public class Processor implements IProcessor {
    private String velocity;
    private String brand;
    private String model;
    private String generation;

    public Processor(String velocity, String brand, String model, String generation) {
        this.velocity = velocity;
        this.brand = brand;
        this.model = model;
        this.generation = generation;
    }

    @Override
    public String showVelocity() {
        return this.velocity;
    }

    @Override
    public String showBrand() {
        return this.brand;
    }

    @Override
    public String showModel() {
        return model;
    }

    @Override
    public String showGeneration() {
        return generation;
    }
}
