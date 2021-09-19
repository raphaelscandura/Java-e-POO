package br.com.scandura;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
   
    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora teste = new Calculadora();
        double soma = teste.somar(3, 7);
    }

}