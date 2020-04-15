package Natacao;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NadadorTest {

    Nadador infantil;
    Nadador juvenil;
    Nadador adulto;
    Nadador invalido;

    @Before
    public void setUp() {
        infantil = new Nadador("Paulo", 9);
        juvenil = new Nadador("Leonardo", 15);
        adulto = new Nadador("Miguel", 25);
        invalido = new Nadador("João", 6);

    }

    @Test
    public void testMostrarNivel() {
        assertEquals("Nadador Infantil", infantil.mostrarNivel());
    }

    @Test
    public void testMostrarNivel1() {
        assertEquals("Nadador Juvenil", juvenil.mostrarNivel());
    }

    @Test
    public void testMostrarNive2() {
        assertEquals("Nadador Adulto", adulto.mostrarNivel());
    }

    @Test
    public void testMostrarNive3() {
        assertEquals("Idade Inválida", invalido.mostrarNivel());
    }
}