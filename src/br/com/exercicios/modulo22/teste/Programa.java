package br.com.exercicios.modulo22.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.exercicios.modulo22.entidade.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Cliente> list = new ArrayList<Cliente>();
		list.add(new Cliente("Maria","maria@gmail.com",3200.00));
		list.add(new Cliente("Alex","alex@gmail.com",1900.00));
		list.add(new Cliente("Marco","marco@gmail.com",1700.00));
		list.add(new Cliente("Bob","bob@gmail.com",3500.00));
		list.add(new Cliente("Anna","anna@gmail.com",2800.00));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um salario : ");
		Double salario = sc.nextDouble();
		
		System.out.println("Mostrando email das pessoas que tem um salario maior que "+salario);
		
		Comparator<String> ordem = (x,y) -> x.compareTo(y);
		
		List<String> emails = list.stream().
				filter(x->x.getSalario()>salario).
				map(x->x.getEmail()).
				sorted(ordem).
				collect(Collectors.toList());
		
		emails.forEach(System.out::println);
		
		// somando salario com as pessoas que comeca com M
		
		List<Double> clienteComM = list.stream().
				filter(x->x.getNome().charAt(0) == 'M').
				map(x->x.getSalario()).
				collect(Collectors.toList());
		
		double soma = clienteComM.stream().reduce(0.0,(x,y) -> x+y);
		
		System.out.println("Soma dos salarios que comeca com M é : "+soma);
		
		sc.close();
		
		
	}
}

