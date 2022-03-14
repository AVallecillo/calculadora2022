/*
 * @Author: Juan Carlos Ruiz Ruiz
 * Calculadora 2022
 * */

public class Calculadora implements ICalculadora{
	
	//SUMA DOS VALORES DADOS
	public double suma(double a, double b) {
		double s = a+b;
		if(s > Double.MAX_VALUE) throw new ArithmeticException();
		return s;
	}
	
	//RESTA DOS VALORES DADOS
	public double resta(double a, double b) {
		double s = a-b;
		if(s < Double.MIN_VALUE) throw new ArithmeticException();
		return s;
	}
	
	//MULTIPLICA DOS VALORES DADOS
	public double mult(double a, double b) {
		double s = a*b;
		if(s > Double.MAX_VALUE) throw new ArithmeticException();
		return s;
	}
	
	//DIVIDE DOS VALORES DADOS
	public double divide(double a, double b) {
		if(b==0) throw new ArithmeticException();
		return a/b;
	}
	
	//CALCULA EL FACTORIAL DE UN INTEGRAL
	public int factorial (int n) {
		int f = 1;
		if(n <0) {	//Si el numero es negativo, todo es exactamente igual pero con resultado negativo.
			f = -1;
			n = n*(-1);
		}
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		
		if(f > Integer.MAX_VALUE) throw new ArithmeticException();
		return f;
	}
	
	//COMPRUEBA SI ES PRIMO
	public boolean esPrimo (int n) {
		int c = 2;
		while (c < n) {
			if(n % c == 0) 
				return false;
			
			c++;
		}
		return true;
	}
	
}
