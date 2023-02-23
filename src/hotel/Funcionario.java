package hotel;

public class Funcionario extends Pessoa {
	private Cargos cargo;

	public Funcionario(String nome, int idade, String email, Cargos cargo) {
		super(nome, idade, email);
		this.cargo = cargo;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", getCargo()=" + getCargo() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getEmail()=" + getEmail() + "]";
	}

	public static void imprimirFuncionario(Funcionario funcionario) {
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade());
		System.out.println("Email: " + funcionario.getEmail());
		System.out.println("Cargo: " + funcionario.getCargo().getCargo());
		System.out.println("Salario: " + funcionario.getCargo().getSalario());
		System.out.println("-------------");
	}
}