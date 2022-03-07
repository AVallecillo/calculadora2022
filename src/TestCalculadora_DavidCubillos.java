import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class PruebaCalculadora {


	


 @Test
 public void pruebaSuma() {
	 Calculadora objCal= new Calculadora ();
	 boolean truth = false; 
	 assertEquals(300, objCal.suma(256.5,43.5),0);
	 try {
	 
		 objCal.suma( Double.MAX_VALUE, 1);
		 fail();
	 }catch (Exception e) {
			truth= true;
		}finally {
			 assertTrue(truth);
	 }// se ha lanzado una excecpcion
	 
 }
 
 
@Test
 public void pruebaResta(){
	 Calculadora objCal= new Calculadora ();
	 boolean truth = false; 

	 try {
	 double mark = -Double.MAX_VALUE;
		 double  b = 30 ; 
		  objCal.resta(mark, b);
		 fail();
	 }catch (Exception e) { 
		 truth= true;
		 } finally {
		 for ( double a =  0 ; a < 100 ; a++ ) { 
			 assertEquals(2-a, objCal.resta(2,a),0.6);
		 }
	}
 }
 
@Test
public void pruebaDiv() {
	double mark= Double.MAX_VALUE;
	
	 Calculadora objCal= new Calculadora ();
	 assertTrue(20== objCal.divide(60,3));
	 boolean truth = false; 
	 try {
		 assertTrue(20== objCal.divide(60,3));
		 objCal.divide(mark,0.5);
		 fail();
	 }catch (Exception e) {
		truth= true;
	 }finally {
		 assertTrue(truth);
	 }
	
}
 @Test
 public void pruebamultipDiv() {
	 // prueba de que no rebase el double 
	 double mark = Double.MAX_VALUE;
	 boolean truth = false; 
	 Calculadora objCal= new Calculadora ();
	 assertTrue(20 == objCal.mult(5, 4));
	 try {
		 objCal.mult(mark, 2);
		 fail();
	 }catch (Exception e) {
			truth= true;
		 }finally {
			 assertTrue(truth);
		 }
	 
	
 }
 @Test
 public void pruebaFactorial() {
	 boolean truth = false; 
	 Calculadora objCal= new Calculadora ();
	 assertEquals( 2004310016,objCal.fact(15));
	 try {
	 objCal.fact(17);//en int no se puede hacer mas.
	 fail();
	}catch (Exception e) {
		truth= true;
	 }finally {
		 assertTrue(truth);
	 }
 }
 
 


@Test
public void pruebaPrim(){
	Calculadora objCal= new Calculadora ();

	assertTrue( objCal.esPrimo(3) );
	assertFalse(objCal.esPrimo(10));
	
	}
 
}
 
 
 
 // public void pruebaMultiplicacion () {
 
 

