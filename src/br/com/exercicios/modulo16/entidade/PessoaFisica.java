package br.com.exercicios.modulo16.entidade;

public class PessoaFisica extends Usuario{

	private Double gastoSaude;
	
	public PessoaFisica() {}

	public PessoaFisica(String nome, Double rendaAnual,Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double calculoImposto() {
		if(getRendaAnual()<20000.00) {
			return getRendaAnual() * 0.15 - gastoSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - gastoSaude * 0.5;
		}
	}
	
	
}
