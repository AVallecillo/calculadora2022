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
	    	ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
	             c.divide(12, 0);
	    });
	    	
	    	assertEquals("Exception in thread \"main\" java.lang.ArithmeticException"
	    			, thrown.getMessage());
	    }
	    @Test
	    public void factTest(){
	    	assertEquals(1,c.fact(0));
	    	assertEquals(6,c.fact(3));
	    	StackOverflowError thrown = assertThrows(StackOverflowError.class, () -> {
	            c.fact(-3);
	   });

	   assertEquals("Exception in thread \"main\" java.lang.StackOverflowError", thrown.getMessage());
	    }
	    
}
