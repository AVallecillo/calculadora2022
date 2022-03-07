import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalculadora_Archerd6
{
	private static Calculadora c;
	
	@BeforeAll
	static void setUpBeforeClass()
	{
		c = new Calculadora();
	}
	
	@Test
	void suma()
	{
		assertEquals(6.0, c.suma(2, 4));
		assertNotEquals(0, c.suma(5, 0));
		
		double s;
		for (double a=-10.0; a<10.0; a+=1.0)
		{
			for (double b=-10.0; b<10.0; b+=1.0)
			{ 
				s = c.suma(a,b);
				assert (s==a+b):("Error suma: a="+a+" b="+b+" s="+s);			
			}
		}
	}
	
	@Test
	void resta()
	{
		assertEquals(4.0, c.resta(6, 2));
		assertNotEquals(0, c.resta(5, 0));
		
		double r;
		for (double a=-10.0; a<10.0; a+=1.0)
		{
			for (double b=-10.0; b<10.0; b+=1.0)
			{ 
				r = c.resta(a,b);
				assert (r==a-b):("Error resta: a="+a+" b="+b+" r="+r);			
			}
		}
	}

	@Test
	void mult()
	{
		assertEquals(4.0, c.mult(2, 2));
		assertNotEquals(80.0, c.mult(5, 5));
		
		double m;
		for (double a=-10.0; a<10.0; a+=1.0)
		{
			for (double b=-10.0; b<10.0; b+=1.0)
			{ 
				m = c.mult(a,b);
				assert (m==a*b):("Error multiplicaci�n: a="+a+" b="+b+" m="+m);			
			}
		}
	}
	
	@Test
	void divide()
	{
		assertEquals(10.0, c.divide(20, 2));
		assertNotEquals(2.0, c.divide(5, 5));
		
		double d;
		for (double a=-10.0;a<10.0;a+=1.0)
		{
			for (double b=-10.0;b<10.0;b+=1.0)
			{ 
				d = c.divide(a, b);
				assert (0==Double.compare(d,a/b)):("Error divis�n: a="+a+" b="+b+" d="+d);			
			}
		}
	}
	
	@Test
	void fact()
	{
		assertEquals(1, c.fact(0));
		assertEquals(1, c.fact(1));
		assertEquals(2, c.fact(2));
		assertEquals(6, c.fact(3));
		assertEquals(120, c.fact(5));
		assertThrows(RuntimeException.class,()->c.fact(-1));
	}
	
	@Test
	void esPrimo()
	{
		assertFalse(c.esPrimo(1));
		assertTrue(c.esPrimo(2));
		assertTrue(c.esPrimo(3));
		assertFalse(c.esPrimo(4));
		assertTrue(c.esPrimo(199));
		assertFalse(c.esPrimo(200));
		assertThrows(RuntimeException.class,()->c.esPrimo(-1));
	}
	
}