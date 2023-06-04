package calculadora;
public class Main {
	
	public static void main(String[] args) {
		
		// paso 1) instancia de la clase Calculadora,Esto permite acceder a sus métodos y atributos 
        Calculadora calculadora = new Calculadora();
        
        
        //paso 2) Se llama al método sumar de la instancia calculadora y se guarda el 
        //resultado en la variable resultadoSuma
        
        //suma
        int resultadoSuma = calculadora.sumar(5, 3);
        System.out.println("++Suma++: " + resultadoSuma);
        
        
        
        
        //resta
        int resultadoResta = calculadora.restar(10, 4);
        System.out.println("--Resta--: " + resultadoResta);
        
        //multiplicar
        int resultadoMultiplicacion = calculadora.multiplicar(6, 2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        
        //dividir
        double resultadoDivision = calculadora.dividir(10, 2);
        System.out.println("División: " + resultadoDivision);
    }
}
	


