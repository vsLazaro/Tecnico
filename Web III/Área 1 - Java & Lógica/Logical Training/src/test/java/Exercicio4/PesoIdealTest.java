package Exercicio4;

import org.junit.Test;

import static org.junit.Assert.*;

public class PesoIdealTest {

    PesoIdeal pessoa1 = new PesoIdeal("A", 20, "Feminino", 54, 1.8);
    PesoIdeal pessoa2 = new PesoIdeal("A", 35, "Feminino", 69, 1.7);
    PesoIdeal pessoa3 = new PesoIdeal("A", 25, "Feminino", 74, 1.7);
    PesoIdeal pessoa4 = new PesoIdeal("A", 43, "Feminino", 150, 1.8);

    @Test
    public void testCalcularImc() {
        assertEquals(17,pessoa1.calcularImc(),0.8);
        assertEquals(24,pessoa2.calcularImc(),0.8);
        assertEquals(26,pessoa3.calcularImc(),0.8);
        assertEquals(46,pessoa4.calcularImc(),0.8);
    }

    @Test
    public void testCalcularPesoIdeal() {
        assertEquals("muito abaixo do peso", pessoa1.calcularPesoIdeal());
        assertEquals("peso normal", pessoa2.calcularPesoIdeal());
        assertEquals("sobrepeso", pessoa3.calcularPesoIdeal());
        assertEquals("obesidade 3", pessoa4.calcularPesoIdeal());
    }
}