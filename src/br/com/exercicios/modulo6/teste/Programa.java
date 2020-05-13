package br.com.exercicios.modulo6.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo6.entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Digite o numero da sua conta : ");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome da sua conta : ");
		String nome = sc.nextLine();
		
		System.out.println("Quer um deposita um valor inicial ? (s/n)");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {			
			System.out.println("Digite o valor do deposito inicial : ");
			Double balanco = sc.nextDouble();
			
			conta = new Conta(numero, nome, balanco);
			
			System.out.println("Status da conta: ");
			System.out.println(conta.toString());

			
		}else {
 			
			conta = new Conta(numero, nome);
			
			System.out.println("Status da conta: ");
			System.out.println(conta.toString());
		
		}
		
		System.out.println("Digite o valor do deposito : ");
		Double deposito = sc.nextDouble();
		
		conta.getDeposito(deposito);
		System.out.println("Status da conta atualizada : ");
		System.out.println(conta.toString());
		
		System.out.println("Digite o saque do deposito : ");
		Double saque = sc.nextDouble();
		
		conta.getSaque(saque);
		System.out.println("Status da conta atualizada : ");
		System.out.println(conta.toString());
			
		
		
		sc.close();
	}
}
