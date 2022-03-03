import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalculadora {

    private final Calculadora c = new Calculadora();

    @Test
    void addition() {
        assertEquals(2, c.suma(1, 1));
		double s;
		for (double a=-10.0;a<10.0;a+=1.0) {
			for (double b=-10.0;b<10.0;b+=1.0) { 
				s = c.suma(a,b);
				assert s==a+b:"Error suma"+a+b+s;
			}
		}
    }

}
//
//public class TestCalculadora {
//
//	ICalculadora c;
//	public TestCalculadora() {
//		c = new Calculadora();
//	}
//@Test 
//	public void testSuma() {
//	   assertTrue(2.0==c.suma(1.0,1.0));
//		double s;
//		for (double a=-10.0;a<10.0;a+=1.0) {
//			for (double b=-10.0;b<10.0;b+=1.0) { 
//				s = c.suma(a,b);
//				//assert s==a+b:"Error suma";
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		TestCalculadora t=new TestCalculadora();
//		t.testSuma();
//	}
//}
