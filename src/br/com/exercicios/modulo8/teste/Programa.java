package br.com.exercicios.modulo8.teste;

import java.util.Scanner;

import br.com.exercicios.modulo8.entidade.Estudante;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos voce quer alugar ? : ");
		Integer qtdQuarto = sc.nextInt();
		
		Estudante [] estudantes = new Estudante[10];
		
		for(int i=1;i<=qtdQuarto;i++) {
			System.out.println("Aluno "+i);
			
			sc.nextLine();
			System.out.println("Nome :  ");
			String nome = sc.nextLine();
			
			System.out.println("Email :  ");
			String email = sc.nextLine();
			
			System.out.println("Numero do quarto :  ");
			Integer num = sc.nextInt();
			
			estudantes[num] = new Estudante(nome, email);
		}
		
		System.out.println("Quartos alugados");
		for(int i=0;i<estudantes.length;i++) {
			if(estudantes[i] !=null) {
				System.out.println(i+" : "+estudantes[i]);
			}
		}
		
		sc.close();
	}
}
