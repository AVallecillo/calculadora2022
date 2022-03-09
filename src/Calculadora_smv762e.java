
public class Calculadora_smv762e implements ICalculadora {

	public Calculadora_smv762e() {	
	}
	
	public double suma(double a, double b) {
		double suma = a + b;
		return suma;
	}
	
	public double resta(double a, double b) {
		double resta = a - b;
		return resta;
	}
	
	public double mult(double a, double b) {
		double mult = a * b;
		return mult;
	}
	
	public double divide(double a, double b) {
		double result = 0;
		if (b == 0) {
			throw new ArithmeticException("Infinite number");
		}
		if (b != 0) {
			double divide = a / b;
			return divide;
		}
		return result;
	}
	
	public int fact(int n) {
		int result = 0;
		if (n < 0) {
			throw new RuntimeException("Error, negative number");
		}
		if (n >= 13) {
			throw new RuntimeException("Error, too big result");
		}
		if (n == 0 || n == 1) {
			result = 1;
		} else if (n == 2) {
			result = 2;
		} else if (n == 3) {
			result = 6;
		} else {
			return n * fact(n - 1);
		}
		return result;
	}
	
	public boolean esPrimo(int n) {
		 if (n <= 0 || n == 1 || n == 4) {
			    return false;
			  }
			  for (int x = 2; x < n / 2; x++) {
			    if (n % x == 0)
			      return false;
			  }
			  return true;
			}
}
