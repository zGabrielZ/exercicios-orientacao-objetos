package br.com.exercicios.modulo14.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo14.entidade.Funcionario;
import br.com.exercicios.modulo14.entidade.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.println("Quantos funcionarios ? ");
		Integer qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			System.out.println("Funcionario #"+i);
			sc.nextLine();
			System.out.println("É terceirizado ? (s/n)");
			char resp = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.println("Nome : ");
			String nome = sc.nextLine();
			
			System.out.println("Horas : ");
			Integer horas = sc.nextInt();
			
			System.out.println("Valor por hora : ");
			Double valorPorHoras = sc.nextDouble();
			
			if(resp == 's') {
				System.out.println("Valor adicional : ");
				Double adicional = sc.nextDouble();
				
				funcionarios.add(new FuncionarioTerceirizado(nome, horas, valorPorHoras,adicional));
			}
			else {
				funcionarios.add(new Funcionario(nome, horas, valorPorHoras));
			}
		}
		
		System.out.println("Pagamentos");
		for(Funcionario f : funcionarios) {
			System.out.println(f.getNome()+" - $ "+f.getPagamento());
		}
		
		sc.close();
	}
}
