package modelo;

public class Cargo {
	private int idcargos;
	private String cargo;
	private double salario;

	public Cargo(int idcargos, String cargo, double salario) {
		this.idcargos = idcargos;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Cargo(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	

	public String getCargo() {
		return cargo;
	}
	
	public double getSalario() {
		return salario;
	}


	@Override
	public String toString() {
		return "ID Cargo: " + idcargos + "\n " + cargo + "\n Salário: " + salario+ "\n------";
	}

	public void setCargos() {
		// TODO Auto-generated method stub
		
	}

	public void setSalario(double i) {
		// TODO Auto-generated method stub
		
	}

	public void setCargos(String string) {
		// TODO Auto-generated method stub
		
	}


}
