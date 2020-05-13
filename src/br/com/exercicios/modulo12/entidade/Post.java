package br.com.exercicios.modulo12.entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date data;
	private String titulo;
	private String contexto;
	private Integer likes;
	private List<Comentarios> comentarios = new ArrayList<Comentarios>();
	
	public Post() {}
	
	public Post(Date data, String titulo, String contexto, Integer likes) {
		this.data = data;
		this.titulo = titulo;
		this.contexto = contexto;
		this.likes = likes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}
	
	public void addComentarios(Comentarios comentario) {
		comentarios.add(comentario);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		builder.append("Momento : "+sdf.format(data));
		builder.append("\n");
		builder.append("Titulo : "+titulo);
		builder.append("\n");
		builder.append("Contexto : "+contexto);
		builder.append("\n");
		builder.append("Likes : "+likes);
		builder.append("\n");
		builder.append("Comentarios : ");
		builder.append("\n");
		for(Comentarios com : comentarios) {
			builder.append(com.getTexto()+"\n");
		}
		return builder.toString();
	}	
	
}
