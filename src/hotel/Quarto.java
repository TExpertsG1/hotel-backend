package hotel;

public class Quarto {
	private String nomeQuarto;
	private int numero;
	private int capacidade;
	private double diaria;

	public Quarto(String nomeQuarto, int numero, int capacidade, double diaria) {
		this.nomeQuarto = nomeQuarto;
		this.numero = numero;
		this.capacidade = capacidade;
		this.diaria = diaria;
	}

	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}

	public String getNomeQuarto() {
		return nomeQuarto;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public double getDiaria() {
		return diaria;
	}

	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public static void imprimirQuarto(Quarto quarto) {
		System.out.println("Nome: " + quarto.getNomeQuarto());
		System.out.println("Número: " + quarto.getNumero());
		System.out.println("Capacidade: " + quarto.getCapacidade());
		System.out.println("Diária: " + quarto.getDiaria());
		System.out.println("-------------");
	}
}
