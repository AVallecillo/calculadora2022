import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.*;

/**
 * 
 * @author Claudia Vega Rodriguez
 *
 */
class TestCalculadora_ClaudiaVegaRodriguez {
	
	private Calculadora c = new Calculadora();

	@Test
	public void testSuma() {
		assertEquals(5, c.sum(2, 3));
		assertNotEquals(6, c.sum(7, 291));
	}

	@Test
	public void testMultiplicacion() {
		assertEquals(42, c.multiplicacion(6, 7));
		assertNotEquals(26, c.multiplicacion(1, 4));
	}

	@Test
	public void testResta() {
		assertEquals(5, c.rest(8, 3));
		assertNotEquals(1, c.rest(6, 2));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(2, c.fact(2));
		assertEquals(1, c.fact(0));
		assertNotEquals(1, c.fact(3));
	}
	
	@Test
	public void testEsPrimo() {
		assertEquals(true, c.esPrimo(3));
		assertNotEquals(false, c.esPrimo(14));
	}
}
