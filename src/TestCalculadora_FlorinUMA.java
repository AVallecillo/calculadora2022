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
	Calculadora_FlorinUMA miCalculadora;

	@BeforeEach
	void init() {
		miCalculadora = new Calculadora_FlorinUMA();
	}

	@Test
	public void testSuma() {
		Assertions.assertEquals(4.0, miCalculadora.suma(2, 2));
		Assertions.assertNotEquals(0, miCalculadora.suma(1, 0));
		Assertions.assertEquals(-200, miCalculadora.suma(-100, -100));
	}

	@Test
	public void testMult() {
		Assertions.assertEquals(4.0, miCalculadora.mult(2, 2));
		Assertions.assertNotEquals(80.0, miCalculadora.mult(5, 5));
		Assertions.assertEquals(0, miCalculadora.mult(0, 80));
		Assertions.assertEquals(1.0, miCalculadora.mult(80, 0.0125));
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
		Assertions.assertEquals(479001600, miCalculadora.fact(12)); //ultimo resultado del factorial dentro dentro del rango de int
	}
	
	@Test
	public void testEsPrimo() {
		Assertions.assertFalse(miCalculadora.esPrimo(-5));
		Assertions.assertFalse(miCalculadora.esPrimo(0));
		Assertions.assertFalse(miCalculadora.esPrimo(1));
		Assertions.assertTrue(miCalculadora.esPrimo(2));
		Assertions.assertTrue(miCalculadora.esPrimo(3));
		Assertions.assertFalse(miCalculadora.esPrimo(4));
		Assertions.assertTrue(miCalculadora.esPrimo(199));
		Assertions.assertFalse(miCalculadora.esPrimo(200));
	}
}
