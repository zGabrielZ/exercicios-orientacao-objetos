package br.com.exercicios.modulo10.entidade;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {}

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void getAumentaSalario(double salario) {
		double porcentagem = salario/100;
		this.salario+=(porcentagem * this.salario);
	}
	
	@Override
	public String toString() {
		return id+", "+nome+", "+salario;
	}
	
	
	
	
	
	
}
