package Desafio_Computador.interfaces;

public interface IMotherBoard {
    String showMotherBoardType();
    String showFactory();
    int showSataControllerQuantity();
    void activateRaid();
    void deactivateRaid();
    int showNumberOfUsbPorts();
}
