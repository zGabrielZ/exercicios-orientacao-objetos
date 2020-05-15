package br.com.exercicios.modulo19.teste;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.exercicios.modulo19.entidade.Aluno;
import br.com.exercicios.modulo19.service.AlunoService;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> alunos = new HashSet<>();
		
		System.out.println("Quantos alunos tem no curso A ? : ");
		Integer qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			Integer idAluno = sc.nextInt();
			
			alunos.add(new Aluno(idAluno));
			
		}
		
		System.out.println("Quantos alunos tem no curso B ? : ");
		qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			Integer idAluno = sc.nextInt();
			
			alunos.add(new Aluno(idAluno));
			
		}
		
		System.out.println("Quantos alunos tem no curso C ? : ");
		qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			Integer idAluno = sc.nextInt();
		
			alunos.add(new Aluno(idAluno));
			
		}
		
		AlunoService alunoService = new AlunoService();
		System.out.println("Total de estudantes : "+alunoService.quantidadeAluno(alunos));
		
		sc.close();
	}
}
