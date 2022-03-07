package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculadora_pablomolinasanchez {

	
	private Calculadora c;

	
	
	@BeforeEach
	void start() {
	c = new Calculadora();
	}
	
	
	@Test
	void testSuma() {
		assertEquals(2, c.suma(1,1));
		assertTrue(c.suma(1,1)==2);
		assertNotEquals(0, c.suma(2, 2));
		
	}
	
	
	@Test
	void testResta() {
		assertEquals(0, c.resta(1,1));
		assertTrue(c.resta(1,1)==0);
		assertNotEquals(0, c.resta(2, 2));
	}
	

	@Test
	void testMult() {
		assertEquals(1, c.mult(1,1));
		assertTrue(c.mult(1,1)==1);
		assertNotEquals(4, c.mult(2, 2));
	
	}
	
	@Test
	void testFactorial() {
		assertEquals(1,c.fact(0));
		assertEquals(1,c.fact(1));
		assertEquals(2,c.fact(2));
	
	}
	
	@Test
	void testDivision() {
		assertThrows(ArithmeticException.class, ()->c.divide(1, 0));
		assertEquals(-1, c.divide(-1,1));
		assertTrue(c.divide(2,3)==2d/3d);
		assertNotEquals(2, c.divide(1, 1));
		
	}
	
	@Test
	void testPrimo() {
		assertFalse(c.esPrimo(0));
		assertFalse(c.esPrimo(1));
		assertTrue(c.esPrimo(2));
		assertTrue(c.esPrimo(3));
		assertThrows(ArithmeticException.class, ()->c.esPrimo(-1));
	}

}
