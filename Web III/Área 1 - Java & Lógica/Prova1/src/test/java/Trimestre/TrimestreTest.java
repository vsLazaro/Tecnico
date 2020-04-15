package Trimestre;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrimestreTest {

    Trimestre trimestre;
    @Before
    public void setUp() {
        trimestre = new Trimestre();
    }

    @Test
    public void testVerificarTrimestre() {
        assertEquals("Você nasceu no primeiro trimestre", trimestre.verificarTrimestre(2));
        assertEquals("Você nasceu no segundo trimestre", trimestre.verificarTrimestre(4));
        assertEquals("Você nasceu no terceiro trimestre", trimestre.verificarTrimestre(8));
        assertEquals("Você nasceu no quarto trimestre", trimestre.verificarTrimestre(11));
    }
}