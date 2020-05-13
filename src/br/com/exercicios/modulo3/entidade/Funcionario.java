package br.com.exercicios.modulo3.entidade;

public class Funcionario {

	private String nome;
	private Double salarioBruto;
	private Double imposto;
	
	public Funcionario() {}

	public Funcionario(String nome, Double salarioBruto, Double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double getSalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void addSalario(double salario) {
		double porcentagem = salario/100;
		this.salarioBruto+=(porcentagem * this.salarioBruto);
	}

	@Override
	public String toString() {
		return "Funcionario : "+nome+", $ "+getSalarioLiquido();
	}
	
	
	
}
