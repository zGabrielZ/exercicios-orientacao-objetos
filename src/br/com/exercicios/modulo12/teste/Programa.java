package br.com.exercicios.modulo12.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.exercicios.modulo12.entidade.Comentarios;
import br.com.exercicios.modulo12.entidade.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Viajando em Nova Zeladia","Que cidade maravilhosa",20);
		Comentarios comentarios1 = new Comentarios("Que legal");
		Comentarios comentarios2 = new Comentarios("Que fantastico");
		Comentarios comentarios3 = new Comentarios("Lindoooooooo");
		post1.addComentarios(comentarios1);
		post1.addComentarios(comentarios2);
		post1.addComentarios(comentarios3);
		System.out.println(post1);
		
	}
}
