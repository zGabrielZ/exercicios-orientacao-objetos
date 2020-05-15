package br.com.exercicios.modulo19.service;
import java.util.Set;

import br.com.exercicios.modulo19.entidade.Aluno;

public class AlunoService {
	
	public int quantidadeAluno(Set<Aluno> alunos) {
		return alunos.size();
	}

}
