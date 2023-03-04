package testes;

import java.sql.SQLException;
import java.util.List;

import dao.CargoDAO;
import modelo.Cargo;

public class Select {

	public static void main(String[] args) throws SQLException {
		
		List<Cargo> cargo = new CargoDAO().listagem();
		cargo.forEach(cargos -> System.out.println(cargos));

	}

}
