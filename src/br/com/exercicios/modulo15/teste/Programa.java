package br.com.exercicios.modulo15.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo15.entidade.Produto;
import br.com.exercicios.modulo15.entidade.ProdutoImportado;
import br.com.exercicios.modulo15.entidade.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		System.out.println("Quantos produtos ? ");
		Integer qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			System.out.println("Produto #"+i);
			sc.nextLine();
			
			System.out.println("Comum, importado ou usado ? (c,i,u)");
			char resp = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.println("Nome : ");
			String nome = sc.nextLine();
			
			System.out.println("Preço : ");
			Double preco = sc.nextDouble();
			
			if(resp == 'i') {
				System.out.println("Taxa : ");
				Double taxa = sc.nextDouble();
				
				produtos.add(new ProdutoImportado(nome, preco, taxa));
			}
			else if(resp == 'c') {
				produtos.add(new Produto(nome, preco));
			}
			else {
				System.out.println("Data (DD/MM/YYYY) : ");
				Date data = sdf.parse(sc.next());
				
				produtos.add(new ProdutoUsado(nome, preco,data));
			}
			
			
		}
		
		System.out.println("Preços : ");
		for(Produto p : produtos) {
			System.out.println(p);
		}
		
		sc.close();
	}
}
