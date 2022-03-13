

public class Calculadora_pablomolinasanchez implements ICalculadora{
	
	public Calculadora_pablomolinasanchez() {
		
	}

	public double suma(double a, double b) {
		return a+b;
	}
	
	public double resta(double a, double b) {
		return a-b;
	}
	
	public double mult(double a, double b) {
		return a*b;
	}
	
	public double divide(double a, double b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		double div = a/b;
		assert div*b==a;
		return div;
	}
	
	public int fact(int n) {
		 int fact = 1;
		 if (n <= 0) {
			throw new RuntimeException();
			}
		 
		 if (n >= 13) {
			throw new RuntimeException();
			
		 }else {
		      for( int i = 1; i <= n; i++ ) {
		         fact *= i;
		      }
		 }
	 
	      return fact;
	}
	
	
	public boolean esPrimo(int n) {
		 int i = 2;
		  boolean primo=true;
		  while ((primo) && (i!=n)){
		    if (n % i == 0)
		      primo = false;
		    i++;
		  }
		  return primo;
	}

}
