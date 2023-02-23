package hotel;

public class Hospede extends Pessoa{
	private int telefone;

	public Hospede(String nome, int idade, String email, int telefone) {
		super(nome, idade, email);
		this.telefone = telefone;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public static void imprimirHospede(Hospede hospede) {
		System.out.println("Nome: " + hospede.getNome());
		System.out.println("Idade: " + hospede.getIdade());
		System.out.println("Email: " + hospede.getEmail());
		System.out.println("Telefone: " + hospede.getTelefone());
		System.out.println("-------------");
	}
}
