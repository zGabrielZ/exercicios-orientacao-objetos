package br.com.exercicios.modulo16.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo16.entidade.PessoaFisica;
import br.com.exercicios.modulo16.entidade.PessoaJuridica;
import br.com.exercicios.modulo16.entidade.Usuario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		System.out.println("Quantos numeros de funcionarios ? ");
		Integer qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			System.out.println("Funcionario #"+i);
			sc.nextLine();
			
			System.out.println("Pessoa fisica ou juridica ? (f,j)");
			char resp = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.println("Nome : ");
			String nome = sc.nextLine();
			
			System.out.println("Renda anual : ");
			Double renda = sc.nextDouble();
			
			if(resp == 'f') {
				System.out.println("Gasto com saude : ");
				Double gasto = sc.nextDouble();
				
				usuarios.add(new PessoaFisica(nome, renda, gasto));
			}
			else {
				System.out.println("Numero de funcionarios : ");
				Integer num = sc.nextInt();
				
				usuarios.add(new PessoaJuridica(nome, renda,num));
			}
		}
		
		System.out.println("Funcionarios");
		for(Usuario u : usuarios) {
			System.out.println(u);
		}
		
		sc.close();
	}
}
