/**
 * Esta clase implementa las operaciones del interfaz ICalculadora
 * del primer ejercicio del curso. 
 * 
 * @author  Antonio Vallecillo
 * @version 0.1
 *
 */

public class Calculadora_AVallecillo implements ICalculadora {
	
	private final double PRECISION=1.0E-8;
	
	/**
	 * CONSTRUCTOR. Inicialmente no hace nada porque la calculadora no tiene estado 
	 * ni necesita guardar nada en memoria.
	 */
	public Calculadora_AVallecillo() {
	}

	/** 
	 * El metodo suma calcula la suma de dos numeros reales, que son pasados como parametros. 
	 * @param a :double -- el sumando 1
	 * @param b :double -- el sumando 2
	 * @return  :double -- el resultado de la suma
	 * @throws ArithmeticException (if (result-a!=b)||(result-b!=a)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double suma(double a, double b) {
		double result=a+b;
		//assert checkEquals(res-a,b)&&checkEquals(res-b,a):"Suma invalida; a="+a+", b="+b+", res="+res;
		if (!(Math.abs(b-(result-a))<=PRECISION)||!(Math.abs(a-(result-b))<=PRECISION)) {
			throw new ArithmeticException("Suma invalida; a="+a+", b="+b+", res="+result);
		}
		return result;
	}

	/** 
	 * El metodo resta calcula la diferencia de dos numeros reales, que son pasados como parametros. 
	 * @param a :double -- el numero del cual hay que detraer el parametro b
	 * @param b :double -- el numero a restar al parametro a
	 * @return  :double -- el resultado de la resta
	 * @throws ArithmeticException (if (result+b!=a)||(result-a!=-b)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double resta(double a, double b) {
		double result=a-b;
		if (!(Math.abs(a-(result+b))<=PRECISION)||!(Math.abs((-b)-(result-a))<=PRECISION)) {
			throw new ArithmeticException("Resta invalida; a="+a+", b="+b+", res="+result);
		}
		return result;
	}

	/** 
	 * El metodo mult calcula el producto de dos numeros reales, que son pasados como parametros. 
	 * @param a :double -- el primer numero
	 * @param b :double -- el segundo numero
	 * @return  :double -- el resultado del producto
	 * @throws ArithmeticException (if (result/b!=a)||(result/a!=b)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double mult(double a, double b) {
		double result=a*b;
		if ((a==0.0||b==0.0)) {
			if (!(Math.abs(result)<=PRECISION)) {
				throw new ArithmeticException("Mult invalida: a="+a+", b="+b+", res="+result);
			}
		} else if (!(Math.abs(a-result/b)<=PRECISION)||!(Math.abs(b-result/a)<=PRECISION)) {
					throw new ArithmeticException("Mult invalida; a="+a+", b="+b+", res="+result);
				}
		return result;
	}

	/** 
	 * El metodo divide calcula la division de dos numeros reales, que son pasados como parametros. 
	 * @param a :double -- el dividendo
	 * @param b :double -- el divisor
	 * @return  :double -- el resultado de la division
	 * @throws ArithmeticException (if b==0) 	//precondition
	 * @throws ArithmeticException (if (result*b!=a)) 	//postcondicion (large numbers or lack of precision)
	 */
	public double divide(double a, double b) {
		double result;
		if (b==0) throw new ArithmeticException("Divide by zero");
		result = a/b;
		if (!(Math.abs(a-result*b)<=PRECISION)) {
			throw new ArithmeticException("Divide invalida; a="+a+", b="+b+", res="+result);
		}
		return result;
	}

	/** 
	 * El metodo fact calcula el factorial de un numero entero. 
	 * @param n :int -- numero del cual se quiere calcular el factorial
	 * @return  :int -- el factorial de n (n!)
	 * @throws IllegalArgumentException (if n<0) //precondition
	 * @throws IllegalArgumentException (if n>=14) //precondition
	 */
	public int fact(int n) {
		if (n<0) throw new IllegalArgumentException("Numero negativo");
		if (n>13) throw new IllegalArgumentException("Numero demasiado grande (>13) para el tipo 'int'");
		return n>0?n*fact(n-1):1;
	}

	/** 
	 * El metodo esPrimo determina si un numero es primo o no. 
	 * @param n :int -- el numero que se desea saber si es primo o no
	 * @return  :boolean -- true si el numero es primo, false en otro caso.
	 */
	public boolean esPrimo(int n) {
		if (n<2) return false;
		for(int i=2;i<=n/2;i++) {
	        if(n%i==0) return false;
		}
		return true;
	}






}
