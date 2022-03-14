import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalculadora_AVallecillo {
	
	private final int NUM_ITERACIONES = 1000;
	private final double MIN_VALUE=-12345678; //Double.MAX_VALUE/1.0E308;
	private final double MAX_VALUE= 12345678; //Double.MAX_VALUE/1.0E308;
	private final double PRECISION=1.0E-8;
	

    private final ICalculadora c= new Calculadora(); 
	
   
    @Test
    void pruebaBasicaSuma() {
 		double s;
		for (double a=MIN_VALUE;a<MAX_VALUE;a+=(MAX_VALUE-MIN_VALUE)/NUM_ITERACIONES) {
			for (double b=MIN_VALUE;b<MAX_VALUE;b+=(MAX_VALUE-MIN_VALUE)/NUM_ITERACIONES) { 
				s = c.suma(a,b);
				assertEquals(s,a+b,"Error suma: a="+a+" b="+b+" s="+s);			
			}
		}
    }
    


    
    


}
