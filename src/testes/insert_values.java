package testes;

import java.sql.SQLException;

import dao.CargoDAO;
import modelo.Cargo;

public class insert_values {

	public static void main(String[] args) throws SQLException {
		
		Cargo cargo = new Cargo("Mordomo",2700);
		
		CargoDAO cargoDAO = new CargoDAO();
		cargoDAO.insere(cargo);
		
	}

}
