
public class Calculadora implements ICalculadora{

	@Override
	public double suma(double a, double b)  {
		 double mark = Double.MAX_VALUE;
		if (Math.abs (a/2)+Math.abs(b/2) >=(mark/2)) {
			throw new RuntimeException ("La suma de los numeros supera la capacidad de un double"); 
		}
		return a+b;
	}
	
	
	@Override
	public double resta(double a, double b) {
		 double mark = Double.MAX_VALUE;
		 //System.out.println(mark +" resultado de a="+ a+"   b="+b );
			if (Math.abs(a/2)+Math.abs(b/2) >=(mark/2)) {
				throw new RuntimeException ("La suma de los numeros supera la capacidad de un double"); 
			}
			return a-b;
		
	}

	@Override
	public double mult(double a, double b) {
		// raiz por raiz llegaria al maximo resultadao
		if (Math.sqrt(Double.MAX_VALUE)<= Math.sqrt(a)*Math.sqrt(b)) {
			throw new RuntimeException ("los valores no puden multiplicarse "); 

		}
		double res= a*b;	
		return res;
	}
	

	@Override
	public double divide(double a, double b) {
		if (b==0 || Math.sqrt(Double.MAX_VALUE)<= Math.sqrt(a)/Math.sqrt(b)) {			
			throw new RuntimeException ("no se puede dividir"); 
			
		}
		if (b< (1/Double.MAX_VALUE) && a>1) {
			throw new RuntimeException ("no se puede dividir"); 
	
		}
		// si b es muy pequeño pude generar problemas
		
		return  a/b;
	}

	@Override
	public int fact(int n) {
		int i=1, j=1;
		if ( n ==0) {
			throw new RuntimeException ("el factorial no se puede calcular"); 

		}
		if (n>16) {
			throw new RuntimeException ("el factorial no se puede calcular con un int: overflow"); 

		}
		while (i<=n) {
			j*= i;
			 i+=1;
			
		}

		return j;
	}
	

	@Override
	public boolean esPrimo(int n) {// no acpta decimales
		// no acepta numeros mauores que 
		
		int i =2; 
		boolean var = true;
		
		while (i< Math.abs(n)) {
			if (n%i==0) {
				var = false;
			}
			i+=1;
		} 
	
			return var;
		
	
	
	}

}
