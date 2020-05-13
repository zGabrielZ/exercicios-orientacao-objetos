package br.com.exercicios.modulo11.entidade;

public class Departamento {

	private String nome;
	
	public Departamento() {}

	public Departamento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome do departamento : "+nome;
	}
	
	
	
	
}
