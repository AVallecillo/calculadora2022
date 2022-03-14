

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculadora_pablomolinasanchez {
	

	private Calculadora_pablomolinasanchez c;

	@BeforeEach
	void start() {
	c = new Calculadora_pablomolinasanchez();
	}
	
	@Test
	void testSuma() {
		assertEquals(2, c.suma(1, 1));
		double suma;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				suma = c.suma(a, b);
				assertEquals(suma,a+b);
			}
		}
	}
		
	@Test
	void testResta() {
		assertEquals(10, c.resta(15, 5));
		double resta;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				resta = c.resta(a, b);
				assertEquals(resta,a-b);
			}
		}
	}
		
		@Test
		void testMult() {
			assertEquals(10, c.mult(2, 5));
			double mult;
			for (double a=-10.0;a<10.0;a+=1.0) {
				for (double b=-10.0;b<10.0;b+=1.0) { 
					mult = c.mult(a, b);
					assertEquals(mult,a*b);
				}
			}
		}
		@Test
		void testDiv() {
			assertEquals(10, c.divide(20, 2));
			assertThrows(RuntimeException.class,()->c.divide(0, 0));
			double div;
			for (double a=-10.0;a<10.0;a+=1.0) {
				for (double b=-10.0;b<10.0;b+=1.0) { 
					if (b == 0) {
						assertThrows(RuntimeException.class,()->c.divide(0, 0));
					}
					if (b != 0) {
						div = c.divide(a, b);
						assertEquals(div,a/b);
					}
				}
			}
		}
		@Test
		void testFact() {
			assertEquals(120, c.fact(5));
			
			assertThrows(RuntimeException.class,()->c.fact(13));
			assertThrows(RuntimeException.class,()->c.fact(-1));
			assertThrows(RuntimeException.class,()->c.fact(0));
		}
		
		@Test
		void testPrimo() {
			assertEquals(true, c.esPrimo(2));
			assertEquals(false,c.esPrimo(-2));
			}	
		}
		

	
	