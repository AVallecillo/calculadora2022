import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class TestCalculadora_jesusaldanamartin {

	
	@Test
	public void testSuma() {
		
		Calculadora calculadora = new Calculadora();
		
		assertEquals(4, calculadora.suma(2, 2));
		assertEquals(1000000, calculadora.suma(999999.9, 0.1));
		assertThrows(ArithmeticException.class,	()->calculadora.suma(Double.MAX_VALUE, 1));

	}
	
	@Test
	public void testResta() {
		
		Calculadora calculadora = new Calculadora();

		assertEquals(0, calculadora.resta(2, 2));
		assertEquals(999999.8, calculadora.resta(999999.9, 0.1));
	}
	
	@Test
	public void testProducto() {
		
		Calculadora calculadora = new Calculadora();

		assertEquals(6.48, calculadora.mult(2.7, 2.4));
		assertThrows(ArithmeticException.class,	()->calculadora.mult(Double.MAX_VALUE, 2));
	}
	
	@Test
	public void testDivision() {
		
		Calculadora calculadora = new Calculadora();

		assertEquals(1.1250000000000002, calculadora.divide(2.7, 2.4));
		assertEquals(0, calculadora.divide(0, 2.4));
		assertThrows(ArithmeticException.class,	()->calculadora.divide(-7, 0));
		assertThrows(ArithmeticException.class,	()->calculadora.divide(0, 0));
	}
	
	@Test
	public void testFactorial() {
		
		Calculadora calculadora = new Calculadora();

		assertEquals(1, calculadora.fact(0));
		assertEquals(1, calculadora.fact(1));
		assertEquals(2, calculadora.fact(2));
		assertEquals(6, calculadora.fact(3));
		assertEquals(362880, calculadora.fact(9));
	}
	
	@Test
	public void testPrimo() {
		
		Calculadora calculadora = new Calculadora();

		assertEquals(true, calculadora.esPrimo(7));
		assertEquals(false, calculadora.esPrimo(6));
	}

}
