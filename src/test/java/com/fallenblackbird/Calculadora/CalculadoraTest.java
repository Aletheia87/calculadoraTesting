package com.fallenblackbird.Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.fallenblackbird.Calculadora.modelo.Calculadora;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CalculadoraTest {

	static Calculadora calculadora = new Calculadora();
	
	@Test
	public void aRestarTest() {
		long numero = 5;
		assertEquals(-5, calculadora.restar(numero));
	}
	
	@Test
	public void bSumarTest() {
		long numero = 8;
		assertEquals(3, calculadora.sumar(numero));
	}
	
	@Test
	public void cMultiplicarTest() {
		long numero = 10;
		assertEquals(30, calculadora.multiplicar(numero));
	}
	
	@Test
	public void dDividirTest() {
		long numero = 5;
		assertEquals(6, calculadora.dividir(numero));
	}
	
}
