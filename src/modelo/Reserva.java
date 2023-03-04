package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

	private int idreserva;
	private int idquarto;
	private String hospede_cpf;
	private int quantidade_adultos;
	private int quantidade_crianca;
	private LocalDate data_check_in;
	private LocalDate data_check_out;

	public Reserva(int idreserva, int idquarto, String hospede_cpf, int quantidade_adultos, int quantidade_crianca,
			LocalDate data_check_in, LocalDate data_check_out) {
		this.idreserva = idreserva;
		this.idquarto = idquarto;
		this.hospede_cpf = hospede_cpf;
		this.quantidade_adultos = quantidade_adultos;
		this.quantidade_crianca = quantidade_crianca;
		this.data_check_in = data_check_in;
		this.data_check_out = data_check_out;
	}

	@Override
	public String toString() {
		return "ID Reserva: " + idreserva + "\nID Quarto: " + idquarto + "\nCPF do Hospede: " + hospede_cpf
				+ "\nQuantidade de Adultos: " + quantidade_adultos + "\nQuantidade de Crianca: " + quantidade_crianca
				+ "\nData Check-IN: "+ data_check_in.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ "\nData Check-OUT: "+ data_check_out.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n------";
	}

}
