import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestCalculadora_alexpascualm {
	 private final Calculadora c= new Calculadora();
	    
	    @Test
	    public void esPrimotest() {
	    	assertEquals(true,c.esPrimo(13));
	    	assertEquals(false,c.esPrimo(0));
	    	assertEquals(false,c.esPrimo(-13));
	    	assertEquals(false,c.esPrimo(26));
	    	
	    }
	    @Test
	    public void dividetest() {
	    	 assertThrows(ArithmeticException.class, () -> {c.divide(12, 0);});
	    	
	    	
	    }
	    @Test
	    public void factTest(){
	    	assertEquals(1,c.fact(0));
	    	assertEquals(6,c.fact(3));
	    	assertThrows(IllegalArgumentException.class, () -> {c.fact(-3);});
	    	assertThrows(IllegalArgumentException.class, () -> {c.fact(14);});
	    	assertThrows(IllegalArgumentException.class, () -> {c.fact(15);});
	   		
	    }
	   
	    
}
