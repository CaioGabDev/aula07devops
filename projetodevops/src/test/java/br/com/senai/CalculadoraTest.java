package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
 
    @Test
    void testarSoma() {
 
        Calculadora calculadora = new Calculadora();
 
        int resultado = calculadora.somar(2, 2);
 
        assertEquals(4, resultado);
 
       
    }
        @Test
        void testarMultiplicar() {
 

        Calculadora calculadora = new Calculadora();
 
        int resultado = calculadora.multiplicar(2, 2);
 
        assertEquals(4, resultado);
       
    }
   @Test
        void testarDividir() {
 
            
        Calculadora calculadora = new Calculadora();
 
        int resultado = calculadora.dividir(2, 2);
 
        assertEquals(4, resultado);
       
    }
}