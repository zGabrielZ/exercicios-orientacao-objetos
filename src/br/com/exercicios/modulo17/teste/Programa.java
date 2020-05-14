package br.com.exercicios.modulo17.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo17.entidade.Conta;
import br.com.exercicios.modulo17.exceptions.Exception;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados da conta : ");
		System.out.println("Número : ");
		Integer numero = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Nome : ");
		String nome = sc.nextLine();
		
		System.out.println("Balanço inicial : ");
		Double balanco = sc.nextDouble();
		
		System.out.println("Limite de saque : ");
		Double limite = sc.nextDouble();
		
		Conta conta = new Conta(numero, nome, balanco, limite);
		
		try {
			System.out.println("Digite quanto quer sacar : ");
			Double saque = sc.nextDouble();
			
			conta.getSaque(saque);
			System.out.println("Novo balanco : "+conta.getBalanco());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
