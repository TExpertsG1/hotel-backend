package hotel;

public class Funcionario {
	private String nome;
	private String cargo;

	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNomeFuncionario() {
		return this.nome;
	}

	public String getCartoFuncionario(String cargo) {
		return this.cargo;
	}

	public void setCargoFuncionario(String newCargo) {
		cargo = newCargo;
	}
}
