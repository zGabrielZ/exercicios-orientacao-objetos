package br.com.exercicios.modulo5.utils;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double calcular(double dolar,double comprarDolar) {
		double impostoAplicar = IOF * comprarDolar * dolar;
		return impostoAplicar+=dolar*comprarDolar;
	}
}
