package hotel;

import java.time.LocalDate;

public class Reserva {
	private LocalDate checkIn;
	private LocalDate checkOut;
	private int numeroAdultos;
	private int numeroCriancas;
	
	public Reserva(LocalDate checkIn, LocalDate checkOut, int numeroAdultos, int numeroCriancas) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numeroAdultos = numeroAdultos;
		this.numeroCriancas = numeroCriancas;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}
	
	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}
	
	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}
	
	public int getNumeroAdultos() {
		return numeroAdultos;
	}
	
	public void setNumeroAdultos(int newNumeroAdultos) {
		numeroAdultos = newNumeroAdultos;
	}
	
	public int getNumeroCriancas() {
		return numeroCriancas;
	}
	
	public void setNumeroCriancas(int newNumeroCriancas) {
		numeroCriancas = newNumeroCriancas;
	}
}
