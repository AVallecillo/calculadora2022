
public class Calculadora implements ICalculadora {
	/**
	 * @author Florin
	 */
	@Override
	public double suma(double a, double b) {
		return (a + b);
	}

	@Override
	public double resta(double a, double b) {
		return (a - b);
	}

	@Override
	public double mult(double a, double b) {
		double valor = a * b;
		return valor;
		
	}

	@Override
	public double divide(double a, double b) {
		double valor;
		if (b == 0) {
			throw new ArithmeticException("Divison por 0");
		}
		valor = a / b;
		if (valor * b != a) {
			throw new ArithmeticException("Mala precision del calculo");
		}
		return valor;
	}

	@Override
	public int fact(int n) {
		int valor = 1;
		int i = 2;
		while (i <= n) {
			valor *= i;
			i++;
		}
		return valor;
	}

	@Override
	public boolean esPrimo(int n) {
		boolean primo = true;
		if (n > 1) {
			int contador = 2;
			while ((primo) && (contador < n)) {
				if (n % contador == 0) {
					primo = false;
				}
				contador++;
			}
		} else {
			primo = false;
		}
		return primo;
	}

}
