package br.com.exercicios.modulo18.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.exercicios.modulo18.entidade.Pessoa;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Set<Pessoa> pessoas = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=7;i++) {
			String nome = sc.nextLine();
			
			Date data = sdf.parse(sc.nextLine());
			
			pessoas.add(new Pessoa(nome, data));
		}
		
		System.out.println("Quantidade de usuarios : "+pessoas.size());
		
		sc.close();
	}
}
