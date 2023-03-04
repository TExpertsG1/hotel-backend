package modelo;

public class FormaDePagamento {
	
	private int idpagamento;
	private String forma_pagamento;
	private int idreserva;
	

	public FormaDePagamento(int idpagamento, String forma_pagamento, int idreserva) {
		this.idpagamento = idpagamento;
		this.forma_pagamento = forma_pagamento;
		this.idreserva = idreserva;
	}


	@Override
	public String toString() {
		return "ID Pagamento: " + idpagamento + "\n Forma de Pagamento: " + forma_pagamento
				+ "\n ID Reserva: " + idreserva + "\n------";
	}
	
	
	
	
}
