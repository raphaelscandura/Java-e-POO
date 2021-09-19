package br.com.scandura;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
   
    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora teste = new Calculadora();
        int soma = teste.somar(3, 7);
        
        Assert.assertEquals(10, soma);
    }

}