package cl.Calculadora2.test;



public class Main {
	
	public static void main(String[] args) {
		
   Calculadora calculadora = new Calculadora();
       
       
       //suma
       int resultadoSuma = calculadora.sumar(2, 2);
       System.out.println("Suma: " + resultadoSuma);
       
       //resta
       int resultadoResta = calculadora.restar(2, 2);
       System.out.println("Resta: " + resultadoResta);
       
       //multiplicar
       int resultadoMultiplicacion = calculadora.multiplicar(2, 2);
       System.out.println("Multiplicación: " + resultadoMultiplicacion);
       
       //dividir
       double resultadoDivision = calculadora.dividir(10, 2);
       System.out.println("División: " + resultadoDivision);
   }
}
	


