package cl.Calculadora2.test;

import static org.junit.Assert.*;

import org.junit.Test;

         public class CalculadoraTest {

	      @Test
	      public void test() {
		    Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.sumar(2, 3);      // int resultado = calculadora.sumar(1, 3);
	        assertEquals(5, resultado);
	}

}
