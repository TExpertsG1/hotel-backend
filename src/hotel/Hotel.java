package hotel;

public class Hotel {
	private int qtdSuiteFamilia = 5;
	private int qtdSuiteMaster = 6;
	private int qtdSuitePremium = 7;

// suites
	Suite suiteFamilia = new Suite("Suite Familia", "Acomodação Familiar", 350.00);
	Suite suiteMaster = new Suite("Suite Master", "Acomodação Master", 250.00);
	Suite suitePremium = new Suite("Suite Premium", "Acomodação Premium", 450.00);

	public int getQtdSuiteFamilia() {
		return qtdSuiteFamilia;
	}
	
	public void setQtdSuiteFamilia(int newQtdSuiteFamilia) {
		qtdSuiteFamilia = newQtdSuiteFamilia;
	}

	public int getQtdSuiteMaster() {
		return qtdSuiteMaster;
	}
	
	public void setQtdSuiteMaster(int newQtdSuiteMaster) {
		qtdSuiteMaster = newQtdSuiteMaster;
	}

	public int getQtdSuitePremium() {
		return qtdSuitePremium;
	}
	
	public void setQtdSuitePremium(int newQtdSuitePremium) {
		qtdSuitePremium = newQtdSuitePremium;
	}

// funcionarios
	Funcionario recepcionista1 = new Funcionario("Michelle", "Recepcionista");
	Funcionario recepcionista2 = new Funcionario("Bruno", "Recepcionista");
	Funcionario gerente = new Funcionario("André Luiz", "Gerente");
	Funcionario cozinheiro1 = new Funcionario("André Barbosa", "Cozinheiro");
	Funcionario cozinheiro2 = new Funcionario("Arthur", "Cozinheiro");
	Funcionario zelador1 = new Funcionario("Angela", "Zelador");
	Funcionario zelador2 = new Funcionario("Zenilson", "Zelador");

	private Funcionario[] qtdFuncionarios = new Funcionario[]{recepcionista1, recepcionista2, gerente, cozinheiro1, cozinheiro2, zelador1, zelador2};

	public int getQtdFuncionarios() {
		return qtdFuncionarios.length;
	}
}