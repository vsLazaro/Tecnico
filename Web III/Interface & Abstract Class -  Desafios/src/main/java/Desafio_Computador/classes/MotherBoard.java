package Desafio_Computador.classes;

import Desafio_Computador.interfaces.IMotherBoard;

public class MotherBoard implements IMotherBoard {
    private String motherBoardType;
    private String showFactory;
    private int sataControllerQuantity;
    private boolean raid;
    private int numberOfUsbPorts;

    public MotherBoard(String motherBoardType, String showFactory, int sataControllerQuantity, int numberOfUsbPorts) {
        this.motherBoardType = motherBoardType;
        this.showFactory = showFactory;
        this.sataControllerQuantity = sataControllerQuantity;
        this.raid = false;
        this.numberOfUsbPorts = numberOfUsbPorts;
    }

    @Override
    public String showMotherBoardType() {
        return this.motherBoardType;
    }

    @Override
    public String showFactory() {
        return this.showFactory;
    }

    @Override
    public int showSataControllerQuantity() {
        return this.sataControllerQuantity;
    }

    @Override
    public void activateRaid() {
        this.raid = true;
    }

    @Override
    public void deactivateRaid() {
        this.raid = false;
    }

    @Override
    public int showNumberOfUsbPorts() {
        return this.numberOfUsbPorts;
    }
}
