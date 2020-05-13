package br.com.exercicios.modulo7.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo7.entidade.Produto;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Integer qtd = sc.nextInt();
		
		Produto [] produto1 = new Produto[qtd];
		
		double soma = 0;
		
		double media = 0;
		
		for(int i = 0;i<qtd;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			
			
			Double preco = sc.nextDouble();
			
			produto1[i] = new Produto(nome, preco);
			
			media = soma+=preco/produto1.length;
			
		}
		
		System.out.println("Media final : "+media);
		
		
		sc.close();

	}

}
