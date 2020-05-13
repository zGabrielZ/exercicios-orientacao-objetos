package br.com.exercicios.modulo4.utils;

import java.text.DecimalFormat;

public class Calculadora {

	public static final double PI = 3.14;
	
	public static double circunferencia(double raio) {
		DecimalFormat formato = new DecimalFormat("#.##"); 
		double area = 2 * PI * raio;
		return area = Double.valueOf(formato.format(area));
	}
	
	public static double volume(double raio) {
		DecimalFormat formato = new DecimalFormat("#.##"); 
		double volume = (4.0 * PI * Math.pow(raio,3)) / 3;
		return volume = Double.valueOf(formato.format(volume));
	}
}
