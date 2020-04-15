package Exercicio3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {

    Aluno aluno1 = new Aluno("Alberto", "Silva", 6.6, 7);
    Aluno aluno2 = new Aluno("Ana", "Costa", 9.7, 8);

    @Test
    public void testCalculaMedia() {
        assertEquals(6.8, aluno1.calculaMedia(), 0.1);
        assertEquals(8.8, aluno2.calculaMedia(),0.1);
    }

    @Test
    public void testEstaAprovado() {
        assertEquals(("C"), (aluno1.estaAprovado()));
        assertEquals(("B"), (aluno2.estaAprovado()));
    }
}