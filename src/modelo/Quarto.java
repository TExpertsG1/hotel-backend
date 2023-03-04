package modelo;

import java.util.List;


public class Quarto {
	
	private int idquarto;
	private String hotel_cnpj;
	private String nomeQuarto;
	private int numero;
	private int capacidade;
	private double diaria;
	
	
	public Quarto(int idquarto, String hotel_cnpj, String nomeQuarto, int numero, int capacidade, double diaria) {
		this.idquarto = idquarto;
		this.hotel_cnpj = hotel_cnpj;
		this.nomeQuarto = nomeQuarto;
		this.numero = numero;
		this.capacidade = capacidade;
		this.diaria = diaria;
	}

	public String getNomeSuite() {return nomeQuarto;}
	public double getNumQuarto() {return numero;}
	public double getCapacidade() {return capacidade;}
	public double getDiaria() {return diaria;}


	@Override
	public String toString() {
		return "ID Quarto: " + idquarto + "\n CNPJ: " + hotel_cnpj + "\n Nome Suíte: " + nomeQuarto
				+ "\n Número do Quarto: " + numero + "\n Capacidade: " + capacidade + " Pessoas " + "\n Valor da diária: R$ " + diaria + "\n------";
	}


	
}
