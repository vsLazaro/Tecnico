package Desafio_Computador.classes;


import Desafio_Computador.interfaces.IMemory;

public class Memory implements IMemory {

    private String size;
    private String brand;

    public Memory(String size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String showMemorySize() {
        return this.size;
    }

    @Override
    public String showBrand() {
        return this.brand;
    }
}
