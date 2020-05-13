package br.com.exercicios.modulo15.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

	private Date data;
	
	public ProdutoUsado() {}

	public ProdutoUsado(String nome, Double preco,Date data) {
		super(nome, preco);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return super.toString() + " (usado)"+" (Data :"+sdf.format(data) + ")";
	}
	
	
}
