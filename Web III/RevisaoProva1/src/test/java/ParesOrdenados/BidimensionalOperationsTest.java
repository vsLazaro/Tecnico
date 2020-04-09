package ParesOrdenados;

import org.junit.Before;
import org.junit.Test;

import static ParesOrdenados.BidimensionalOperations.twoPointsDistance;
import static org.junit.Assert.*;

public class BidimensionalOperationsTest {

    private ParOrdenado pontoA;
    private ParOrdenado pontoB;
    private ParOrdenado pontoC;
    private ParOrdenado pontoD;

    @Before
    public void setUp() throws Exception {
        pontoA = new ParOrdenado(0,2);
        pontoB = new ParOrdenado(2,0);

        pontoC = new ParOrdenado(1,2);
        pontoD = new ParOrdenado(2,1);
    }

    @Test
    public void testTwoPoitsDistance() {
        assertEquals(2.82, twoPointsDistance(this.pontoA, this.pontoB),0.3);
        assertEquals(1.41, twoPointsDistance(this.pontoC, this.pontoD),0.3);
    }
}