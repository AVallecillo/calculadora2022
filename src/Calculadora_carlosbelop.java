
public class Calculadora_carlosbelop implements ICalculadora {
/**
 * El método suma dos valores
 * @param a :double -- un sumando
 * @param b :double -- otro sumando
 * @return :double -- el resultado de la suma
 * 
 */
	public double suma(double a, double b) {
		if (a > Double.MAX_VALUE || b > Double.MAX_VALUE || 
				a < Double.MIN_VALUE || b < Double.MIN_VALUE ||
				a + b >Double.MAX_VALUE || a + b < Double.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		return a + b;
	}
	
	/**
	 * El método resta dos valores
	 * @param a :double -- un valor
	 * @param b :double -- el valor que se le resta
	 * @return :double -- el resultado de la suma
	 * 
	 */

	public double resta(double a, double b) {
		if (a > Double.MAX_VALUE || b > Double.MAX_VALUE || 
				a < Double.MIN_VALUE || b < Double.MIN_VALUE ||
				a - b >Double.MAX_VALUE || a - b < Double.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		return Math.round((a-b)*1000d)/1000d;
	}
	
	/**
	 * El método multiplica dos valores
	 * @param a :double -- un factor
	 * @param b :double -- otro factor
	 * @return :double -- el resultado de la suma
	 * 
	 */

	public double mult(double a, double b) {
		if (a > Double.MAX_VALUE || b > Double.MAX_VALUE || 
				a < Double.MIN_VALUE || b < Double.MIN_VALUE ||
				a * b >Double.MAX_VALUE || a * b < Double.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		return a * b;
	}

	/**
	 * El metodo divide calcula la division de dos numeros reales
	 * 
	 * @param a :double -- el dividendo
	 * @param b :double -- el divisor
	 * @return :double -- el resultado de la division
	 * @throws ArithmeticException if b==0) //precondition
	 * @post result*b == a
	 */
	public double divide(double a, double b) {
		if (a > Double.MAX_VALUE || b > Double.MAX_VALUE || 
				a < Double.MIN_VALUE || b < Double.MIN_VALUE ||
				a / b >Double.MAX_VALUE || a / b < Double.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		double result;
		if (b == 0)
			throw new ArithmeticException();
		result = a / b;
		assert result * b == a;
		return result;
	}

	/**
	 * Calcula el factorial
	 * @param a :int -- el valor al cual calcular el factorial
	 * @return  :int -- el resultado del factorial
	 * 
	 */
	public int fact(int n) {
		if (n<0) {
			throw new IllegalArgumentException();
		}
		int result = 1;
		for (int x = 1; x < n; x++) {
			result = result * x;
		}
		if (n != 0) {
			result = result * n;
		}
		return result;
	}
	
	/**
	 * Ddevuelve si es primo o no
	 * @param a :int -- el valor a comprobar
	 * @return  :boolean -- el resultado
	 * 
	 */
	
	public boolean esPrimo(int n) {
		if (n < 0) {
			throw new ArithmeticException();
		}
		int cont = 0;
		boolean prim = false;
		for (int x = 1; x <= n; x++) {
			if (n % x == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			prim = true;
		}
		return prim;
	}

}
