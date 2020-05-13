package br.com.exercicios.modulo11.entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.exercicios.modulo11.enums.TrabalhadorLevel;

public class Trabalhador {

	private String nome;
	private Double salario;
	private TrabalhadorLevel trabalhadorLevel;
	private Departamento departamento;
	private List<HorasContrato> horasContratos = new ArrayList<HorasContrato>();
	
	public Trabalhador() {}

	public Trabalhador(String nome, Double salario, TrabalhadorLevel trabalhadorLevel, Departamento departamento) {
		this.nome = nome;
		this.salario = salario;
		this.trabalhadorLevel = trabalhadorLevel;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public TrabalhadorLevel getTrabalhadorLevel() {
		return trabalhadorLevel;
	}

	public void setTrabalhadorLevel(TrabalhadorLevel trabalhadorLevel) {
		this.trabalhadorLevel = trabalhadorLevel;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getHorasContratos() {
		return horasContratos;
	}

	public void setHorasContratos(List<HorasContrato> horasContratos) {
		this.horasContratos = horasContratos;
	}
	
	public void addContrato(HorasContrato horasContrato) {
		horasContratos.add(horasContrato);
	}
	
	public void removeContrato(HorasContrato horasContrato) {
		horasContratos.remove(horasContrato);
	}
	
	public Double renda(Integer mes,Integer ano) {
		double soma = salario;
		
		Calendar calendar = Calendar.getInstance();
		
		for(HorasContrato h : horasContratos) {
			calendar.setTime(h.getData());
			int c_ano = calendar.get(Calendar.YEAR);
			int c_mes = 1 + calendar.get(Calendar.MONTH);	
			
			if(mes == c_mes && ano == c_ano) {
				soma+=h.getValorTotal();
			}
		}
		return soma;
	}

	@Override
	public String toString() {
		return "Nome : "+nome+"\n"+
				"Departamento : "+departamento.getNome()+"\n";
	}
	
	
	
}
