package br.com.exercicios.modulo1.entidade;

import java.text.DecimalFormat;

public class Triangulo {

	private Double ladoA;
	private Double ladoB;
	private Double ladoC;
	
	public Triangulo() {}

	public Triangulo(Double ladoA, Double ladoB, Double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	public Double getLadoC() {
		return ladoC;
	}

	public void setLadoC(Double ladoC) {
		this.ladoC = ladoC;
	}
	
	public Double calcularArea() {
		DecimalFormat formato = new DecimalFormat("#.####");    
		double p = (ladoA+ladoB+ladoC)/2;
		double area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
		return area = Double.valueOf(formato.format(area));
	}
	
	
}
