package br.com.exercicios.modulo13.entidade;

public class ListaPedido {

	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ListaPedido() {}

	public ListaPedido(Integer quantidade,Produto produto) {
		this.quantidade = quantidade;
		this.preco = produto.getPreco();
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double getSubTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return produto.toString()+", Quantidade : "+quantidade+", Subtotal : $"+getSubTotal();
	}
	
	
	
	
}
