package hotel;

public class Funcionario extends Pessoa {
	private String cargo;
	private double salario;

	public Funcionario(String nome, int idade, String email, String cargo, double salario) {
		super(nome, idade, email);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static void imprimirFuncionario(Funcionario funcionario) {
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade());
		System.out.println("Email: " + funcionario.getEmail());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("-------------");
	}
}
