package br.com.exercicios.modulo3.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo3.entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome : ");
		String nome = sc.nextLine();
		

		System.out.println("Salario bruto : ");
		Double salarioBruto = sc.nextDouble();
		
		System.out.println("Imposto : ");
		Double imposto = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
		
		System.out.println(funcionario.toString());
		
		System.out.println("Quantas porcentagem para aumentar o salario ? : ");
		Double porcentagem = sc.nextDouble();
		
		funcionario.addSalario(porcentagem);
		
		System.out.println("Update "+funcionario.toString());
		
		sc.close();
	}
}
