package Exercicio1;

import org.junit.Test;

import static org.junit.Assert.*;
import static Exercicio1.Calendario.searchMonth;

public class MonthTest {

    @Test
    public void testSearchMonth() {
        assertEquals("Janeiro", searchMonth(1));
        assertEquals("Fevereiro", searchMonth(2));
        assertEquals("Março", searchMonth(3));
        assertEquals("Abril", searchMonth(4));
        assertEquals("Maio", searchMonth(5));
        assertEquals("Junho", searchMonth(6));
        assertEquals("Julho", searchMonth(7));
        assertEquals("Agosto", searchMonth(8));
        assertEquals("Setembro", searchMonth(9));
        assertEquals("Outubro", searchMonth(10));
        assertEquals("Novembro", searchMonth(11));
        assertEquals("Dezembro", searchMonth(12));
    }
}