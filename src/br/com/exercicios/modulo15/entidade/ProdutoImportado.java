package br.com.exercicios.modulo15.entidade;

public class ProdutoImportado extends Produto {

	private Double taxa;
	
	public ProdutoImportado() {}

	public ProdutoImportado(String nome, Double preco,Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getTotal() {
		return getPreco() + taxa;
	}
	
	@Override
	public String toString() {
		return getNome()+" $ "+getTotal() + "(Taxa : $ "+ taxa + ")";
	}
	
	
}
