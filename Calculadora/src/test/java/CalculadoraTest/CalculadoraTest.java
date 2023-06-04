package CalculadoraTest;

import org.junit.Test;
import calculadora.Calculadora;
import static org.junit.Assert.*;

        // test
	public class CalculadoraTest {
	  
	    @Test
	 //   @Order (1)
	 //   @DisplayName ("suma")
	    public void testSumar() {
	    	
	    	//objetos nuevos con minuscula
	    	
	        Calculadora calculadora = new Calculadora();
	        
	        int resultado = calculadora.sumar(2, 3);
	        assertEquals(5, resultado);
	    }
	  
	    
	    
	    
	    @Test
	    public void testRestar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.restar(5, 2);
	        assertEquals(3, resultado);
	    }
	  
	    @Test
	    public void testMultiplicar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.multiplicar(4, 3);
	        assertEquals(12, resultado);
	    }
	  
	    @Test
	    public void testDividir() {
	        Calculadora calculadora = new Calculadora();
	        double resultado = calculadora.dividir(10, 2);
	        assertEquals(5.0, resultado, 0.0001);
	    }
	}

	
	
	
	

