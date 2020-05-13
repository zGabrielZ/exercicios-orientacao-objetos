package br.com.exercicios.modulo9.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.exercicios.modulo9.entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		List<Pessoa> list = new ArrayList<>();
		
		list.add(new Pessoa("Maria"));
		list.add(new Pessoa("Alex"));
		list.add(new Pessoa("Bob"));
		list.add(new Pessoa("Anna"));
		// posicao que quer add e o que quer colocar
		list.add(2,new Pessoa("Marco"));
		//remover
		list.remove(4);
		
		//pecorrendo a lista
		for(Pessoa x : list) {
			System.out.println(x);
		}
		
		// tamanho da lista
		System.out.println(list.size());
		
		System.out.println("---------------------------");
		
		// remover com predicato -> se comeca com m, remove
		list.removeIf(x->x.getNome().charAt(0) == 'M');
		for(Pessoa x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("---------------------------");
		// filtrar -> filter com comeco com A
		List<Pessoa> result = list.stream().filter(x->x.getNome().charAt(0) == 'A').collect(Collectors.toList());
		// percorrendo a filtragem 
		for(Pessoa x : result) {
			System.out.println(x);
		}
		// encontrar o primeiro elemento
		Pessoa nome = list.stream().filter(x->x.getNome().charAt(0)=='A').findFirst().orElse(null);
		System.out.println(nome);
		
		
		// achar a posicao da pessoa 
		List<String> nomes = new ArrayList<>();
		nomes.add("Amanda");
		nomes.add("Joao");
		
		System.out.println("Index of amanda : "+nomes.indexOf("Amanda"));
		System.out.println("Index of joao : "+nomes.indexOf("Joao"));
		
		
	}

}
