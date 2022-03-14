import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;

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
		double i = Double.MAX_VALUE;
		assertThrows(ArithmeticException.class, ()->c.suma(i,1));
		assertThrows(ArithmeticException.class, ()->c.suma(-i,-1));
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
		assertThrows(ArithmeticException.class, ()->c.resta(Double.MAX_VALUE,1));
		assertThrows(ArithmeticException.class, ()->c.resta(-Double.MAX_VALUE,-1));
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
		assertThrows(ArithmeticException.class, ()->c.mult(Double.MAX_VALUE,2));
		assertThrows(ArithmeticException.class, ()->c.mult(-Double.MAX_VALUE,-2));
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
		double mult=1;
		for (int i=1;i<20;i++) {
			mult=mult*i;
			assertEquals(mult,c.fact(i));
		}
		assertEquals(1,c.fact(0));
		assertEquals(1,c.fact(1));
		assertEquals(2,c.fact(2));
		assertEquals(1307674368000d,c.fact(15));
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
