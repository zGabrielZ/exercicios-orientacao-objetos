package br.com.exercicios.modulo2.entidade;

import java.text.DecimalFormat;

public class Produto {

	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {}

	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getTotal() {
		DecimalFormat formato = new DecimalFormat("#.##");    
		double total = preco * quantidade;
		return total = Double.valueOf(formato.format(total));
	}

	@Override
	public String toString() {
		return "Produto : "+nome+" ,$"+preco+", "+quantidade+", Total : $ "+getTotal();
	}
	
	public void addProduto(int quantidade) {
		this.quantidade+=quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade-=quantidade;
	}
	
	
	
	
}
