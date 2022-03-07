import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Puebas {
	Calculadora c;

	@BeforeEach
	void Before() {
		c = new Calculadora();
	}

	@Test
	public void pruebaSuma() {
		Assertions.assertEquals(4, c.suma(2, 2));
		Assertions.assertEquals(0, c.suma(2, -2));
		Assertions.assertEquals(0, c.suma(-2, 2));
		Assertions.assertEquals(-4, c.suma(-2, -2));
		double a = Math.random();
		double b = Math.random();
		Assertions.assertEquals(a+b, c.suma(a, b));
	}
	
	@Test
	public void pruebaResta() {
		Assertions.assertEquals(0, c.resta(2, 2));
		Assertions.assertEquals(4, c.resta(2, -2));
		Assertions.assertEquals(-4, c.resta(-2, 2));
		Assertions.assertEquals(0, c.resta(-2, -2));
		double a = Math.random();
		double b = Math.random();
		Assertions.assertEquals(a-b, c.resta(a, b));
	}
	
	@Test
	public void pruebaMultiplicacion() {
		Assertions.assertEquals(4, c.mult(2,2));
		Assertions.assertEquals(-6, c.mult(2, -3));
		Assertions.assertEquals(100, c.mult(1000, 0.1));
		Assertions.assertEquals(4, c.mult(-2, -2));
		double a = Math.random();
		double b = Math.random();
		Assertions.assertEquals(a*b, c.mult(a, b));
	}
	
	@Test
	public void pruebaDivision() {
		Assertions.assertEquals(1, c.divide(2,2));
		Assertions.assertEquals(-51, c.divide(255,-5));
		Assertions.assertEquals(10000, c.divide(1000, 0.1));
		Assertions.assertEquals(1, c.divide(-2, -2));
		double a = Math.random();
		double b = Math.random();
		Assertions.assertEquals(a/b, c.divide(a, b));
	}
	
	@Test
	public void pruebaFactorial() {
		Assertions.assertEquals(6, c.fact(3));
		Assertions.assertEquals(1, c.fact(0));
		Assertions.assertEquals(-24, c.fact(-4));
	}
	
	@Test
	public void pruebaEsPrimo() {
		Assertions.assertTrue(c.esPrimo(3));
		Assertions.assertTrue(c.esPrimo(2));
		Assertions.assertTrue(c.esPrimo(1));
		Assertions.assertFalse(c.esPrimo(10));
		Assertions.assertTrue(c.esPrimo(0));
		Assertions.assertTrue(c.esPrimo(2^82589933-1));
		
	}
}