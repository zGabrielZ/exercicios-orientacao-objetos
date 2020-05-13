package br.com.exercicios.modulo2.teste;

import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo2.entidade.Produto;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do produto : ");
		
		System.out.println("Nome : ");
		String nome = sc.nextLine();
		
		System.out.println("Preço : ");
		Double preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque : ");
		Integer quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println(produto.toString());
		
		System.out.println("Digite a quantidade de produto que quer adicionar : ");
		Integer quantidadeProduto = sc.nextInt();
		
		produto.addProduto(quantidadeProduto);
		
		System.out.println("Update "+produto.toString());
		
		System.out.println("Digite a quantidade de produto que quer remove : ");
		quantidadeProduto = sc.nextInt();
		
		produto.removeProduto(quantidadeProduto);
		
		System.out.println("Update "+produto.toString());
		
		
		sc.close();
	}
}
