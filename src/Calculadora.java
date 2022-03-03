
public class Calculadora implements ICalculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
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
		return a/b;
	}

	public int fact(int n) {
		return n>0?n*fact(n-1):1;
	}


	public boolean esPrimo(int n) {
		return false;
	}

}
