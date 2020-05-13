package br.com.exercicios.modulo13.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo13.entidade.Cliente;
import br.com.exercicios.modulo13.entidade.ListaPedido;
import br.com.exercicios.modulo13.entidade.Pedido;
import br.com.exercicios.modulo13.entidade.Produto;
import br.com.exercicios.modulo13.enums.PedidoStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Pedido pedido = new Pedido();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do cliente : ");
		
		System.out.println("Nome : ");
		String nome = sc.nextLine();
		
		System.out.println("Email : ");
		String email = sc.nextLine();
		
		System.out.println("Nascimento (DD/MM/YYYY) : ");
		Date nascimento = sdf.parse(sc.next());
		
		sc.nextLine();
		System.out.println("Status do pedido : ");
		String status = sc.nextLine();
		
		Cliente cliente = new Cliente(nome, email, nascimento);
		
		System.out.println("Quantos itens nesse pedido  : ");
		Integer qtdPedido = sc.nextInt();
		
		for(int i=1;i<=qtdPedido;i++) {
			System.out.println("Pedido #"+i);
			sc.nextLine();
			
			System.out.println("Nome do produto : ");
			String nomeProduto = sc.nextLine();
			
			System.out.println("Preço do produto : ");
			Double precoProduto = sc.nextDouble();
			
			System.out.println("Quantidade: ");
			Integer quantidadeProduto = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			ListaPedido listaPedido = new ListaPedido(quantidadeProduto, produto);
			
			pedido.setMomento(new Date());
			pedido.setPedidoStatus(PedidoStatus.valueOf(status));
			pedido.setCliente(cliente);
			
			pedido.addPedido(listaPedido);
		}
		
		System.out.println("Sumario do pedido");
		System.out.println("Momento do pedido : "+sdf.format(new Date()));
		System.out.println("Status do pedido : "+status);
		System.out.println(cliente);
		System.out.println("Lista de pedido");
		for(ListaPedido l : pedido.getListaPedidos()) {
			System.out.println((l));
		}
		System.out.println(("Preço total : "+pedido.getTotal()));
		
		sc.close();
	}
}
