package br.com.exercicios.modulo9.entidade;

public class Pessoa {

	private String nome;
	
	public Pessoa() {}

	public Pessoa(String nome) {
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
		return nome;
	}
	
	
	
	
}
