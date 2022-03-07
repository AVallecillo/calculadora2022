import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculadora_AlejandroDR {
	
	/**
	 * Clase la cual implementa las diferentes pruebas a realizar a los métodos de la clase CalculadoraClass
	 * 
	 * @author Alejandro Domínguez Recio
	 * 
	 */
	private Calculadora c;

	
	@BeforeEach
	public void Calculadora() {
		c = new Calculadora();

	}
	
	@Test 
	public void sumaTest() {
		
		assertNotEquals(2,c.suma(1, 2));
		assertEquals(11,c.suma(11, 0));
		assertEquals(1.5,c.suma(0.5+0.0, 1));

	}
	
	@Test
	public void restaTest() {
		
		assertNotEquals(2,c.resta(1, 2));
		assertEquals(3,c.resta(3, 0));
		assertEquals(1.5,c.resta(2.5+0.0, 1));
		
	}
	
	@Test
	public void multTest() {
		
		assertEquals(4,c.mult(2, 2));
		assertEquals(0,c.mult(4, 0));
		assertEquals(1.5,c.mult(3, 0.5));
		
	}
	
	@Test
	public void divideTest() {
		
		assertThrows(ArithmeticException.class, ()-> c.divide(1,0));
		for(int n =1;n<100;n++) {
			assertEquals(n,c.divide(n, 1));
			for(int m = 1;m<100;m++) {
				if(n%m == 0) {
					assertEquals(n, m*c.divide(n,m));
				}
				
			}
		}
	}
	
	@Test
	public void factTest() {
		
		assertEquals(120,c.fact(5));
		assertEquals((c.fact(5)/5), c.fact(4));
		assertEquals(1,c.fact(0));
		assertEquals(1,c.fact(1));
		int contador = 1;
		for(int n=4;n>0;n--) {
			contador = n*contador;
		}
		assertEquals(c.fact(4),contador*c.fact(0));
		

	}
	
	@Test
	public void primoTest() {
		
		assertFalse(c.esPrimo(0));
		assertTrue(c.esPrimo(5));
		
	}

}
