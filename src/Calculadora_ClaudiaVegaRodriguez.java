
/*
 *  @author  Claudia Vega Rodríguez
 */
public class Calculadora_ClaudiaVegaRodriguez implements ICalculadora {
	
	public Calculadora() {
		
	}
	
	public double suma(double a, double b) {
		double suma = a+b;
		return suma;
	}
	
	public double resta(double a, double b) {
		double resta = a-b;
		return resta;
	}
	
	public double multiplacion(double a, double b) {
		double multiplicacion = a * b;
		return multiplicacion;
	}
	
	public double divide(double a, double b) {
		double divide = a / b;
		return divide;
	}
	
	public int fact(int n) {
		int producto = 1;
		int numero = 2;
		while (numero <=n) {
			productos *= numero;
			numero++;
		}
		return producto;
	}
	
	public boolean esPrimo(int n) {
		if (n==0 || n==1 || n==4) {
			return false;
		}
		for (int i=2; i < n/2; i++) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
}
	