package hotel;

public class Suite {
	private String nome;
	private String descricao;
	private double valorDiaria;

	public Suite(String nome, String descricao, double valorDiaria) {
		this.nome = nome;
		this.descricao = descricao;
		this.valorDiaria = valorDiaria;
	}

	public String getNomeSuite() {
		return nome;
	}

	public void setNomeSuite(String nome) {
		this.nome = nome;
	}

	public String getDescricaoSuite() {
		return descricao;
	}

	public void setDescricaoSuite(String descricao) {
		this.descricao = descricao;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
}
