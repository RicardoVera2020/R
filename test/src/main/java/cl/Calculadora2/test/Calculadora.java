package cl.Calculadora2.test;



public class Calculadora implements Operaciones {
	
	
    public int sumar(int a, int b) {
        return a + b;
    }

    
    
    public int restar(int a, int b) {
        return a - b;
    }

    
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    

    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Error: División por cero.");
        }
    }
}


