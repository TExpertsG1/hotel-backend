package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConnexao {
	
	public static Connection criaConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1800","Michelle","@Senha123");
	}

}
