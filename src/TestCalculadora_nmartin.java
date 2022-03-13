/**
 * @author Nerea
 */

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCalculadora_nmartin {

	private Calculadora c;

	// Antes de cada test inicializamos la variable
	@BeforeEach
	public void init() {
		c = new Calculadora();
	}

	// Tests para la suma
	@Test
	public void test_suma() {
		for (double a = -10.0; a < 10.0; a += 1.0) {
			for (double b = -10.0; b < 10.0; b += 1.0)
				assertEquals(a + b, c.suma(a, b));
		}
	}

	@Test
	public void test_conmutativa_suma() {
		double a = 12.9, b = -3.4;
		double result = c.suma(a, b);
		assert (b + a == result);
	}

	// Tests para la resta
	@Test
	public void test_resta() {
		for (double a = -10.0; a < 10.0; a += 1.0) {
			for (double b = -10.0; b < 10.0; b += 1.0)
				assertEquals(a - b, c.resta(a, b));
		}
	}

	@Test
	public void test_propiedad_resta() {
		double a = 3.5, b = 12.8;
		double result = c.resta(a, b);
		assert (result + b == a);
	}

	// Test para la multiplicacion
	@Test
	public void test_mult() {
		for (double a = -10.0; a < 10.0; a += 1.0) {
			for (double b = -10.0; b < 10.0; b += 1.0)
				assertEquals(a * b, c.mult(a, b));
		}
	}

	@Test
	public void test_conmutativa_mult() {
		double a = 12.3, b = 3.4;
		double result = c.mult(a, b);
		assert (b * a == result);
	}

	// Tests para la division
	@Test
	public void test_excepcion_divide() {
		assertThrows(ArithmeticException.class, () -> {
			c.divide(1, 0);
		});
	}

	@Test
	public void test_divide() {
		for (double a = -10.0; a < 10.0; a += 1.0) {
			for (double b = -10.0; b < 0.0; b += 1.0)
				assertEquals(a / b, c.divide(a, b));
			for (double b = 0.1; b < 10.0; b += 1.0)
				assertEquals(a / b, c.divide(a, b));
		}
	}

	@Test
	public void test_reglaDivide() {
		double a = 12.6, b = 3.7;
		double result = c.divide(a, b);
		assert (result * b == a);
	}

	// Test para el factorial
	@Test
	public void test_fact() {
		assertEquals(120, c.fact(5));
		assertEquals(1, c.fact(0));
	}

	@Test
	public void test_excepcion_fact() {
		assertThrows(Exception.class, () -> {
			c.fact(-3);
		});
	}

	// Test para esPrimo
	@Test
	public void test_esPrimo() {
		assertTrue(c.esPrimo(23));
		assertTrue(c.esPrimo(11));
		assertFalse(c.esPrimo(63));
		// los numeros primos son numeros enteros, por lo tanto, si es negativo no es
		// primo
		assertFalse(c.esPrimo(-23));
		assertFalse(c.esPrimo(-12));
	}

}