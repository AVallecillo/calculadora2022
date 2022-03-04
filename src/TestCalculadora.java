import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalculadora {

    private final Calculadora c= new Calculadora();
    
    @Test
    void suma() {
        assertEquals(2, c.suma(1, 1));
		double s;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				s = c.suma(a,b);
				assert s==a+b:"Error suma: a="+a+" b="+b+" s="+s;			
			}
		}
    }

}
