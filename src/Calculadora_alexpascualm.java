/**
 * 
 * @author alepa
 *
 */
public class Calculadora_alexpascualm implements ICalculadora {
	/** 
	 * Calcula la suma de dos numeros que son pasados como parametros. 
	 * @param a :double -- sumando 1
	 * @param b :double -- el sumando 2
	 * @return  :double -- resultado 
	 * @throws ArithmeticException (if (result-a!=b)||(result-b!=a)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double suma(double a, double b) {
		double resultado=a+b;
		if ((resultado-a!=b)||(resultado-b!=a)){
			throw new ArithmeticException();
		}
		return a+b;
	}
	/** 
	 * Calcula la resta de dos numeros que son pasados como parametros. 
	 * @param a :double -- Número al que se le resta
	 * @param b :double -- Número restado
	 * @return  :double -- resultado
	 * @throws ArithmeticException (if (result+b!=a)||(result-a!=-b)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double resta(double a, double b) {
		double resultado=a-b;
		if ((resultado+b!=a)||(resultado-a!=-b)){
			throw new ArithmeticException();
		}
		return a-b;
	}
	/** 
	 * Calcula el producto de dos numeros que son pasados como parametros. 
	 * @param a :double -- 
	 * @param b :double -- 
	 * @return  :double -- Producto
	 * @throws ArithmeticException (if (result/b!=a)||(result/a!=b)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double mult(double a, double b) {
		double resultado=a*b;
		if(b!=0 & a!=0) {
		if ((resultado/b!=a)||(resultado/a!=b)){
			throw new ArithmeticException();
		}}
		return a*b;
	}
	/**
	 * Calcula el cociente de dos números reales
	 * @param a:double -- Dividendo
	 * @param b: double -- Divisor
	 * @return: double --Cociente
	 * @throws ArithmeticException if b==0) //Precondition
	 * @post a/b*b==a
	 */
	public double divide(double a, double b) {
		if (b==0) throw new ArithmeticException();
		assert a/b*b==a;
		return a/b;
	}
	/** 
	 * Calcula el factorial de un numero entero. 
	 * @param n :int -- Número
	 * @return  :int -- Factorial
	 * @throws IllegalArgumentException (if n<0) //precondition
	 * @throws IllegalArgumentException (if n>=14) //precondition
	 */
	public int fact(int numero) {
		if (numero<0 || numero>=14) throw new IllegalArgumentException();
		if (numero==0) {
			return 1;}
			else {
			return numero * fact(numero-1);}
	}
	/** 
	 * Determina si un numero es primo. 
	 * @param n :int -- Número
	 * @return  :boolean -- Resultado 
	 */
	public boolean esPrimo(int n) {
		if(n<=1) return false;
		  for(int i=2;i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
	}
	
}
