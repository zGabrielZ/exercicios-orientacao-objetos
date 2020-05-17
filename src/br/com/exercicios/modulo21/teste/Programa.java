package br.com.exercicios.modulo21.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.exercicios.modulo21.entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<Produto>();
		list.add(new Produto("Tv",900.00));
		list.add(new Produto("Mouse",50.00));
		list.add(new Produto("Tablet",350.00));
		list.add(new Produto("HD",80.90));
		list.add(new Produto("Computador",850.00));
		list.add(new Produto("Monitor",290.00));
		
		// media total de precos 
		double media = list.stream().map(x->x.getPreco()).reduce(0.0,(x,y)->x+y)/list.size();
		System.out.println(String.format("%.2f",media));
		
		Comparator<String> comp = (x,y) -> x.compareTo(y);
		
		// filtrando o preco dos produto menor que a media e imprimindo em ordem alfabetica
		List<String> nomes = list.stream().filter(x->x.getPreco()<media).map((x)->x.getNome()).
				sorted(comp.reversed()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
	}
}
