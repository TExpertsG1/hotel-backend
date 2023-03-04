package testes;

import java.sql.SQLException;

import modelo.Cargo;

public class Update {

		public static void main(String[] args) throws SQLException {
			
			CargoDAO dao = new CargoDAO();
			Cargo cargo = dao.buscaPor(1);
			
			System.out.println(cargo);
			
			cargo.setCargos("Mordomo");
			dao.update(cargo);
			
			Cargo cargoAlterado = dao.buscaPor(1);
			System.out.println(cargoAlterado);
	}

}
