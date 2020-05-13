package br.com.exercicios.modulo5.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo5.utils.CurrencyConverter;

public class Programa5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto ta o dolar ? : ");
		Double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolar quer comprar ? : ");
		Double comprarDolar = sc.nextDouble();
		
		double valorTotal = CurrencyConverter.calcular(dolar, comprarDolar);
		
		System.out.println("Valor em reais é : "+valorTotal);
		
		sc.close();
	}
}
