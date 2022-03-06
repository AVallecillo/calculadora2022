import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

/**
 * 
 * @author Carlos
 * @version 1.1
 *
 */

class TestCalculadora_carlosbelop {
	
	private Calculadora c;
	/**
	 * 
	 *Cuenta el número de decimales de un número 
	 *@param a :double -- el número a contar sus decimales
	 */
	public int decimales(double a) {
		boolean cero=!(a%1==0);
		int cont=0;
		while (cero) {
			cont++;
			cero=!((a*10)%1==0);
			a=a*10;
		}
		return cont;
	}
	/**
	 * 
	 * Crea un objeto calculadora antes de realizar cada Test
	 * 
	 */
	@BeforeEach
	void start() {
	c = new Calculadora();
	}
	
	/**
	 * 
	 * Testea la suma
	 */
	@Test
	void testSuma() {
		double i = 1.8*Math.pow(10,308);
		assertEquals(i+1, c.suma(1,i));
		assertEquals(2, c.suma(1,1));
		assertEquals(0, c.suma(0,0));
		assertEquals(0, c.suma(-1,1));
		assertEquals(0, c.suma(1,-1));
		assertEquals(-2, c.suma(-1,-1));
		assertTrue(c.suma(2,3)==5);
		assertNotEquals(1, c.suma(1, 1));
		assertEquals(2.3, c.suma(1.2,1.1));
		assertEquals(0.0, c.suma(0,0));
	}
	
	/**
	 * 
	 * Testea la resta
	 * 
	 */
	@Test
	void testResta() {
		assertEquals(0, c.resta(1,1));
		assertEquals(0, c.resta(0,0));
		assertEquals(-2, c.resta(-1,1));
		assertEquals(2, c.resta(1,-1));
		assertEquals(0, c.resta(-1,-1));
		assertTrue(c.resta(2,3)==-1);
		assertNotEquals(1, c.resta(1, 1));
		assertEquals(0.11, c.resta(1.224,1.114));
		assertEquals(0.0, c.resta(0,0));
	}
	
	/**
	 * 
	 * Testea la Multiplicacion
	 * 
	 */
	@Test
	void testMult() {
		assertEquals(1, c.mult(1,1));
		assertEquals(0, c.mult(0,0));
		assertEquals(-1, c.mult(-1,1));
		assertEquals(-1, c.mult(1,-1));
		assertEquals(1, c.mult(-1,-1));
		assertTrue(c.mult(2,3)==6);
		assertNotEquals(2, c.mult(1, 1));
		assertEquals(1.32, c.mult(1.2,1.1));
		assertEquals(33.9624, c.mult(1.59,21.36));
		assertEquals(0.0, c.mult(0,0));
	}
	/**
	 * 
	 * Testea el factorial
	 * 
	 */
	@Test
	void testFactorial() {
		assertEquals(1,c.fact(0));
		assertEquals(1,c.fact(1));
		assertEquals(2,c.fact(2));
		assertEquals(720,c.fact(6));
		assertEquals(-2,c.fact(-2));
	}
	/**
	 * 
	 * Testea la division
	 * 
	 */
	@Test
	void testDivision() {
		assertEquals(1, c.divide(1,1));
		assertThrows(ArithmeticException.class, ()->c.divide(1, 0));
		assertEquals(-1, c.divide(-1,1));
		assertEquals(-1, c.divide(1,-1));
		assertEquals(1, c.divide(-1,-1));
		assertTrue(c.divide(2,3)==2d/3d);
		assertTrue(c.divide(18,6)==3);
		assertNotEquals(2, c.divide(1, 1));
		assertEquals(1.2/1.1, c.divide(1.2,1.1));
	}
	/**
	 * 
	 * Testea si un número es primo
	 * 
	 */
	@Test
	void testPrimo() {
		assertFalse(c.esPrimo(0));
		assertFalse(c.esPrimo(1));
		assertTrue(c.esPrimo(2));
		assertTrue(c.esPrimo(5));
		assertFalse(c.esPrimo(46));
		assertThrows(ArithmeticException.class, ()->c.esPrimo(-1));
	}
}
