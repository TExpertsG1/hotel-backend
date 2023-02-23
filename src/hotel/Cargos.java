package hotel;

public enum Cargos {
	RECEPCIONISTA("Recepcionista",2500.00), 
	COZINHEIRO("Cozinheiro", 3000.00),
	CAMAREIRA("Camareira", 2800.00),
	AUXILIAR_RECEPCAO ("Auxiliar", 2100.00),
	GERENTE("Gerente", 3500.00);
	
	private double salario;
	private String cargo;
	
	private Cargos (String cargo,double salario) {
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public double getSalario() {return salario;}
	public String getCargo() {return cargo;}
}

