package br.com.exercicios.modulo1.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo1.entidade.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os lados do triangulo x : ");
		
		Double ladoXa = sc.nextDouble();
		Double ladoXb = sc.nextDouble();
		Double ladoXc = sc.nextDouble();
		
		Triangulo trianguloX = new Triangulo(ladoXa,ladoXb,ladoXc);
		
		System.out.println("Digite os lados do triangulo y : ");
		
		Double ladoYa = sc.nextDouble();
		Double ladoYb = sc.nextDouble();
		Double ladoYc = sc.nextDouble();
		
		Triangulo trianguloY = new Triangulo(ladoYa,ladoYb,ladoYc);
		
		System.out.println("Triangulo x : "+trianguloX.calcularArea());
		System.out.println("Triangulo y : "+trianguloY.calcularArea());
		
		if(trianguloX.calcularArea()>trianguloY.calcularArea()) {
			System.out.println("Maior area é triangulo x ");
		}
		else {
			System.out.println("Maior area é triangulo y");
		}
		
		sc.close();
	}
}
