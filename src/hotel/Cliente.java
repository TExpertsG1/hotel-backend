package hotel;


public class Cliente {
	private String nome;
	private String email;

	public Cliente (String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNomeCliente () {
		return nome;
	}

	public void setNomeCliente (String newNome) {
		nome = newNome;
	}

	public String getEmailCliente () {
		return email;
	}

	public void setEmailCliente (String newEmail) {
		email = newEmail;
	}
  
}
