package br.com.exercicios.modulo6.entidade;

public class Conta {

	private Integer numeroDaConta;
	private String nomeTitular;
	private double balanco;
	
	public Conta() {}

	public Conta(Integer numeroDaConta, String nomeTitular, double depositoInical) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		getDeposito(depositoInical);
	}
	
	public Conta(Integer numeroDaConta, String nomeTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getBalanco() {
		return balanco;
	}

	public void getSaque(double balanco) {
		this.balanco-=balanco+5.00;
	}
	
	public void getDeposito(double balanco) {
		this.balanco+=balanco;
	}

	@Override
	public String toString() {
		return "Conta "+numeroDaConta+", Nome : "+nomeTitular+", Balanço : $ "+balanco;
	}
	
	
	
	
	
	
}
