import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculadora_hugoavalos01 {
	
	private final Calculadora c = new Calculadora();

	@Test
	void suma() {
		assertEquals(-2, c.suma(-1, -1));
		double s;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				s = c.suma(a, b);
				assert s == a + b:"Error suma: a = "+a+", b = "+b+", s = "+s;			
			}
		}
	}
	
	@Test
	void resta() {
		assertEquals(4, c.resta(2, -2));
		double r;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				r = c.resta(a, b);
				assert r == a - b:"Error resta: a = "+a+", b = "+b+", r = "+r;			
			}
		}
	}
	
	@Test
	void mult() {
		assertEquals(30, c.mult(15, 2));
		double m;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				m = c.mult(a, b);
				assert m == a * b:"Error multiplicación: a = "+a+", b = "+b+", m ="+m;			
			}
		}
	}
	
	@Test
	void div() {
		assertEquals(-15, c.divide(30, -2));
		assertThrows(RuntimeException.class, () -> c.divide(10, 0));
	}
	
	@Test
	void fact() {
		assertEquals(1, c.fact(0));
		assertEquals(39916800, c.fact(11));
		assertThrows(RuntimeException.class, () -> c.fact(-5));
		
	}
	
	@Test
	void primo() {
		assertEquals(true, c.esPrimo(97));
		assertEquals(false, c.esPrimo(-97));

	}

}
