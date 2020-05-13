package br.com.exercicios.modulo14.entidade;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double adicional;

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora,Double adicional) {
		super(nome, horas, valorPorHora);
		this.adicional = adicional;
	}
	
	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	@Override
	public Double getPagamento() {
		return super.getPagamento() + adicional * 1.1;
	}
}
