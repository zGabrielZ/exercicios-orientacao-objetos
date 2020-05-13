package br.com.exercicios.modulo12.entidade;

public class Comentarios {

	private String texto;
	
	public Comentarios() {}

	public Comentarios(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return texto;
	}
	
	
	
	
}
