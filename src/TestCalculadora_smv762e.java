import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestCalculadora_smv762e {

	private final Calculadora c = new Calculadora();
	
	@Test
	public void sumaSimple() {
		assertEquals(2 , c.suma(1, 1));
	}
	
	@Test
	public void sumaCompleja() {
		assertEquals(10, c.suma(5, 5));
		double s;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				s = c.suma(a, b);
				assert s == a + b:"Error suma: a = "+a+", b = "+b+", s = "+s;			
			}
		}
	}
	
	@Test
	public void restaSimple() {
		assertEquals(-2 , c.resta(1, 3));
	}
	
	@Test
	public void restaCompleja()	{
		assertEquals(10, c.resta(15, 5));
		double r;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				r = c.resta(a, b);
				assert r == a - b:"Error resta: a = "+a+", b = "+b+", r = "+r;			
			}
		}
	}
	
	@Test
	public void multSimple() {
		assertEquals(4, c.mult(2, 2));
	}
	
	@Test
	public void multCompleja() {
		assertEquals(10, c.mult(2, 5));
		double m;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				m = c.mult(a, b);
				assert m == a * b:"Error multiplicación: a = "+a+", b = "+b+", m ="+m;			
			}
		}
	}
	
	@Test
	public void divideSimple() {
		assertEquals(2, c.divide(4, 2));
	}
	
	@Test
	public void divideCompleja() {
		assertEquals(10, c.divide(20, 2));
		assertThrows(RuntimeException.class,()->c.divide(0, 0));
		double d;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				if (b == 0) {
					assertThrows(RuntimeException.class,()->c.divide(0, 0));
				}
				if (b != 0) {
					d = c.divide(a, b);
					assert d == a / b:"Error divisón: a = "+a+", b = "+b+", d = "+d;
				}
			}
		}
	}
	
	@Test
	public void factSimple() {
		assertEquals(6, c.fact(3));
	}
	
	@Test
	public void factComplejo() {
		assertEquals(120, c.fact(5));
		assertNotEquals(2, c.fact(4));
	}
	
	@Test
	public void factGrande() {
		assertThrows(RuntimeException.class,()->c.fact(14));
	}
		
	@Test
	public void factNegativo() {
		assertThrows(RuntimeException.class,()->c.fact(-1));
	}

	@Test
	public void primoSimple() {
		assertEquals(true, c.esPrimo(23));
	}
	
	@Test 
	public void primoComplejo() {
		assertEquals(true, c.esPrimo(2));
		boolean p; 
		int random = (int) Math.floor(Math.random()*100);
			p = c.esPrimo(random);
			if (p == true) {
				System.out.println(random + " es primo");
			} else {
				System.out.println(random + " no es primo");
			}
	}
}