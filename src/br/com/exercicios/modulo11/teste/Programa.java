package br.com.exercicios.modulo11.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.modulo11.entidade.Departamento;
import br.com.exercicios.modulo11.entidade.HorasContrato;
import br.com.exercicios.modulo11.entidade.Trabalhador;
import br.com.exercicios.modulo11.enums.TrabalhadorLevel;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do departamento : ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Digite os dados do trabalhador : ");
		
		System.out.println("Nome : ");
		String nome = sc.nextLine();
		
		System.out.println("Level : ");
		String level = sc.nextLine();
		
		System.out.println("Salario : ");
		Double salario = sc.nextDouble();
		
		Departamento departamento = new Departamento(nomeDepartamento);
		
		Trabalhador trabalhador = new Trabalhador(nome, salario,TrabalhadorLevel.valueOf(level), departamento);
		
		System.out.println("Quantos contratos tem esse trabalhador ? ");
		Integer qtd = sc.nextInt();
		
		for(int i=1;i<=qtd;i++) {
			System.out.println("Dados #"+i);
			
			System.out.println("DATA (DD/MM/YYYY)");
			Date data = sdf.parse(sc.next());
			
			System.out.println("Valor por hora ");
			Double valor = sc.nextDouble();
			
			System.out.println("Duracao por hora ");
			Integer hora = sc.nextInt();
			
			HorasContrato horasContrato = new HorasContrato(data, valor, hora);
			
			trabalhador.addContrato(horasContrato);
		}
		
		System.out.println("Digite o mes e ano pra calcular a renda (MM/YYYY) : ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println(trabalhador.toString());
		System.out.println("Renda "+mesAno+" : "+String.format("%.2f",trabalhador.renda(mes, ano)));
		
		sc.close();
		
	}

}
