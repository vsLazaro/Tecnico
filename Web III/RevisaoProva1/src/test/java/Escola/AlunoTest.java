package Escola;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {

    Aluno aluno1 = new Aluno("Jonas");

    @Before
    public void setUp() throws Exception {
        double[] notas = new double[3];
        notas[0] = 7;
        notas[1] = 6;
        notas[2] = 6.5;
        aluno1.setNotas(notas);
    }

    @Test
    public void testCalcularMedia() {
        assertEquals(6.5, aluno1.calcularMedia(),0.1);
    }

    @Test
    public void mostraConceito() {
        assertEquals("C", aluno1.mostraConceito());
    }
}