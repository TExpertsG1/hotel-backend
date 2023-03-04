package modelo;

import java.util.Date;

public class Hospede {
	private String cpf;
	private String nome;
	private Date data_nascimento;
	private String telefone;
	private String email;
	
	public Hospede(String cpf, String nome, Date data_nascimento, String telefone, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.telefone = telefone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "CPF: " + cpf + "\n Nome: " + nome + "\n Data de Nascimento: " + data_nascimento + "\n Telefone: "
				+ telefone + "\n E-mail: " + email+ "\n------";
	}
	
	
	
	
}
