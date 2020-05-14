package br.com.exercicios.modulo17.entidade;

import br.com.exercicios.modulo17.exceptions.Exception;

public class Conta {

	private Integer numero;
	private String nome;
	private Double balanco;
	private Double limiteDeSaque;
	
	public Conta() {}

	public Conta(Integer numero, String nome, Double balanco, Double limiteDeSaque) {
		this.numero = numero;
		this.nome = nome;
		this.balanco = balanco;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void setBalanco(Double balanco) {
		this.balanco = balanco;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void getDeposito(double dinherio) {
		this.balanco+=dinherio;
	}
	
	public void getSaque(double dinheiro) {
		if(dinheiro > limiteDeSaque) {
			throw new Exception("Quantia excedeu o limite de saque");
		}
		else if(dinheiro > balanco) {
			throw new Exception("Não tem saldo suficiente");
		}
		else {
			this.balanco-=dinheiro;
		}
	}
	
	
}
