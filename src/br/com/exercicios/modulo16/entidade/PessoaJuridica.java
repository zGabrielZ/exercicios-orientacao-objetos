package br.com.exercicios.modulo16.entidade;

public class PessoaJuridica extends Usuario{

	private Integer quantidadeFuncionario;
	
	public PessoaJuridica() {}

	public PessoaJuridica(String nome, Double rendaAnual,Integer quantidadeFuncionario) {
		super(nome, rendaAnual);
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	public Integer getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}

	public void setQuantidadeFuncionario(Integer quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}
	
	@Override
	public Double calculoImposto() {
		if(quantidadeFuncionario<10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}
	
	
}
