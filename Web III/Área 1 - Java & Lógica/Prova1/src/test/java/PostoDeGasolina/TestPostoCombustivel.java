package PostoDeGasolina;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPostoCombustivel {
    PostoCombustivel postoCombustivel;

    @Before
    public void setUp() {
        postoCombustivel = new PostoCombustivel();
    }

    @Test
    public void validaTipoCombustivel() {
        assertEquals("gasolina", postoCombustivel.validaTipoCombustivel("GaSoLiNa"));
        assertEquals("alcool", postoCombustivel.validaTipoCombustivel("alCool"));
        assertEquals("diesel", postoCombustivel.validaTipoCombustivel("Diesel"));
        assertEquals("flex", postoCombustivel.validaTipoCombustivel("FLEX"));
    }

    @Test
    public void calcularTotalCompra() {
        assertEquals("Gasolina - R$ 4,49", postoCombustivel.calcularTotalCompra("gasolina",1));
        assertEquals("Alcool - R$ 3,68", postoCombustivel.calcularTotalCompra("alcool",1));
        assertEquals("Diesel - R$ 3,71", postoCombustivel.calcularTotalCompra("diesel",1));
        assertEquals("Alcool - R$ 3,68\nGasolina - R$ 4,49", postoCombustivel.calcularTotalCompra("flex",1));
    }
}