import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Florin
 *
 */
class TestCalculadora_FlorinUMA {
	Calculadora miCalculadora;

	@BeforeEach
	void init() {
		miCalculadora = new Calculadora();
	}

	@Test
	public void testSuma() {
		Assertions.assertEquals(4.0, miCalculadora.suma(2, 2));
		Assertions.assertNotEquals(0, miCalculadora.suma(1, 0));
	}

	@Test
	public void testMult() {
		Assertions.assertEquals(4.0, miCalculadora.mult(2, 2));
		Assertions.assertNotEquals(80.0, miCalculadora.mult(5, 5));
	}

	@Test
	public void testResta() {
		Assertions.assertEquals(2.0, miCalculadora.resta(4, 2));
		Assertions.assertNotEquals(0, miCalculadora.resta(1, 0));
	}
	
	@Test
	public void testFactorial() {
		Assertions.assertEquals(120, miCalculadora.fact(5));
		Assertions.assertEquals(1, miCalculadora.fact(0));
		Assertions.assertEquals(1, miCalculadora.fact(1));
		Assertions.assertEquals(2, miCalculadora.fact(2));
	}
	
	@Test
	public void testEsPrimo() {
		Assertions.assertTrue(miCalculadora.esPrimo(1));
		Assertions.assertTrue(miCalculadora.esPrimo(2));
		Assertions.assertTrue(miCalculadora.esPrimo(3));
		Assertions.assertFalse(miCalculadora.esPrimo(4));
		Assertions.assertTrue(miCalculadora.esPrimo(199));
		Assertions.assertFalse(miCalculadora.esPrimo(200));
	}
}
