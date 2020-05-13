package br.com.exercicios.modulo4.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo4.utils.Calculadora;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio : ");
		Double raio = sc.nextDouble();
		
		double area = Calculadora.circunferencia(raio);
		
		double volume = Calculadora.volume(raio);
		
		System.out.println("VALOR PI : "+Calculadora.PI);
		System.out.println("Circunferencia : "+area);
		System.out.println("Volume : "+volume);
		
		sc.close();
	}
}
