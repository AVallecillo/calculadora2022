
public class Calculadora_franrodriguezcordoba implements ICalculadora {
	public double suma(double a,double b) {
		double res;
		res=a+b;
		return res;
	}
	
	public double resta(double a,double b) {
		double res;
		res=a-b;
		return res;
	}
	
	public double mult(double a,double b) {
		double res;
		res=a*b;
		return res;
		
	}
	public double divide(double a,double b) {
		double res;
		res=a/b;
		return res;
	}
	
	public int fact(int n) {
		int f=1;
		for (int i=1; i<n;i++) {
			f*=i;
		}
		return f;
	}
	
	public boolean esPrimo(int n) {
		if (n%2==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
	


