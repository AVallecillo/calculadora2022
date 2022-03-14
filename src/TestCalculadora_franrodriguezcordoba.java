import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculadora_pablomolinasanchez {
	

	private Calculadora_franrodriguezcordoba t;

	@BeforeEach
	void start() {
	t = new Calculadora_franrodriguezcordoba();
	}
	
	@Test
	void testSuma() {
		assertEquals(2, t.suma(1, 1));
		
			}
		
	
		
	@Test
	void testResta() {
		assertEquals(10, t.resta(15, 5));
		
	}
		
		@Test
		void testMult() {
			assertEquals(10, t.mult(2, 5));
			
		}
		@Test
		void testDiv() {
			assertEquals(10, t.divide(20, 2));
			
		}
		@Test
		void testFact() {
			assertEquals(120, t.fact(5));
			assertThrows(RuntimeException.class,()->t.fact(-1));
			
		}
		
		@Test
		void testPrimo() {
			assertEquals(true, t.esPrimo(2));
			assertEquals(false,t.esPrimo(-2));
			}	
		}
