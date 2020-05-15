package br.com.exercicios.modulo20.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import br.com.exercicios.modulo20.entidade.Candidato;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String,Integer> map = new TreeMap<>();
		
		List<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato("Bolsomito",20));
		candidatos.add(new Candidato("Haddad",10));
		candidatos.add(new Candidato("Ciro",06));
		candidatos.add(new Candidato("Ciro",06));
		candidatos.add(new Candidato("Bolsomito",10));
			
		for(Candidato c : candidatos) {
			int votos;
			String nome = c.getNome();
			if(map.containsKey(nome)) {
				votos=map.get(nome);
			}
			else {
				votos=0;
			}
			votos+=c.getVotos();
			map.put(c.getNome(),votos);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		
		sc.close();
	}
}
