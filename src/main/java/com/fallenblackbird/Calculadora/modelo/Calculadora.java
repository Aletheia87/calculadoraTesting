package com.fallenblackbird.Calculadora.modelo;


public class Calculadora {

private static long total;
	
	public long getTotal() {
		return total;
	}
	
	public void setTotal(long total) {
		Calculadora.total = total;
	}
	
	@Override
	public String toString() {
		return "Calculadora [total=" + total + "]";
	}
	
	public long restar(long numero) {
		try {
			total -= (Long) numero;
		} catch (Exception e) {}
		return total;
	}
	
	public long sumar(long numero) {
		try {
			total += (Long) numero;
		} catch (Exception e) {}
		return total;
	}
	
	public long multiplicar(long numero) {
		try {
			total *= (Long) numero;
		} catch (Exception e) {}
		return total;
	}

	public long dividir(long numero) {
		try {
			if(numero != 0) {
				total /= (Long) numero;	
			}
		} catch (Exception e) {}
		return total;
	}
}
