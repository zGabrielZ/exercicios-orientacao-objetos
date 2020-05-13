package br.com.exercicios.modulo10.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo10.entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionarios que quer add ? : ");
		Integer qtdFuncionario = sc.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		for(int i=1;i<=qtdFuncionario;i++) {
			System.out.println("Funcionario #"+i);
			System.out.println("Id : ");
			int id = sc.nextInt();
			
			while (hasId(funcionarios, id)) {

				System.out.print("Id repetido");

				id = sc.nextInt();

			}
			
			System.out.println("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Salario : ");
			Double salario = sc.nextDouble();
			
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("Digite o id que quer aumenta o salario : ");
		int id = sc.nextInt();
		
		Funcionario result = funcionarios.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		
		if(result == null) {
			System.out.println("Esse id não existe");
		}
		else {
			System.out.println("Digite a porcentegem : ");
			Double porcentagem = sc.nextDouble();
			result.getAumentaSalario(porcentagem);
		}
		
		System.out.println("Lista de funcionarios : ");
		for(Funcionario func:funcionarios) {
			System.out.println(func);
		}
		
		
		sc.close();
	}

	private static boolean hasId(List<Funcionario> funcionarios, int id) {
		Funcionario result = funcionarios.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		return result!=null;
	}
}
