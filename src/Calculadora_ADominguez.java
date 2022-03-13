
public class Calculadora_ADominguez implements ICalculadora {
	
	/**
	 * 
	 */

	@Override
	public double suma(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	/**
	 * 
	 */
	
	@Override
	public double resta(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	
	/**
	 * 
	 */

	@Override
	public double mult(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	/**
	 * @throws Exception 
	 * @throws AritmeticException (if b==0) // precondition
	 * @post result*b=a
	 */
	
	@Override
	public double divide(double a, double b){
		// TODO Auto-generated method stub
		if(b==0) throw new ArithmeticException();
		double result = a/b;
		assert result*b==a;
		return result;
	}

	@Override
	public int fact(int n) {
		// TODO Auto-generated method stub
		int Factorial = 1;
		for (int x = 2; x <= n; x++)
			Factorial = Factorial * x;
		return Factorial;
	}

	@Override
	public boolean esPrimo(int n) {
		// TODO Auto-generated method stub
		if(n==0|n==1) {
			return false;
		}
		int contador = 2;
		while (contador!=n) {
			if (n % contador == 0) {
				return false;
			}
			contador++;
		}

		return true;

	}

}
