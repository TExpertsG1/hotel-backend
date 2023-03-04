package modelo;

import java.sql.Date;

public class Hotel {
	
	private String cnpj;
	private String nome_hotel;
	private String logradouro;
	private int numero;
	private String cep;
	private String uf;
	private String estado;
	
	
	public Hotel(String cnpj, String nome_hotel, String logradouro, int numero, String cep, String uf, String estado) {
	
		this.cnpj = cnpj;
		this.nome_hotel = nome_hotel;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.uf = uf;
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "CNPJ: " + cnpj + "\n" + nome_hotel + "\nEndereço: " + logradouro + ", nº"
				+ numero + ", CEP: " + cep + ", UF: " + uf + ", Estado: " + estado;
	}
	
	
	
	

}
