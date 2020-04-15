package Exercicio2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaixaTest {

    Caixa caixa = new Caixa();

    @Test
    public void testGerarItemNotaFiscalCodigo1() {
        assertEquals("Sanduíche de Presunto: R$ 3.65", caixa.gerarItemNotaFiscal((byte) 1,1) );
        assertEquals("Sanduíche de Presunto: R$ 10.95", caixa.gerarItemNotaFiscal((byte) 1,3) );
    }

    @Test
    public void testGerarItemNotaFiscalCodigo2() {
        assertEquals("Suco de Tamarindo: R$ 2.5", caixa.gerarItemNotaFiscal((byte) 2,1) );
        assertEquals("Suco de Tamarindo: R$ 7.5", caixa.gerarItemNotaFiscal((byte) 2,3) );
    }

    @Test
    public void testGerarItemNotaFiscalCodigo3() {
        assertEquals("Pastel com ovo: R$ 3.3", caixa.gerarItemNotaFiscal((byte) 3,1) );
        assertEquals("Pastel com ovo: R$ 13.2", caixa.gerarItemNotaFiscal((byte) 3,4) );
    }

    @Test
    public void testGerarItemNotaFiscalCodigo4() {
        assertEquals("Farroupilha: R$ 4.7", caixa.gerarItemNotaFiscal((byte) 4,1) );
        assertEquals("Farroupilha: R$ 18.8", caixa.gerarItemNotaFiscal((byte) 4,4) );
    }

}