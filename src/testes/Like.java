package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Cargo;

public class Like {

	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from cargo WHERE cargo like ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, "F%"); //%a Termina
		ResultSet rs = st.executeQuery();
		
		
		List<Cargo> cargo = new ArrayList<>();
		
		while(rs.next()) {
			Cargo cargo = new Cargo(
					rs.getInt(1),
					rs.getString(2),
					rs.getDouble(3)
					);
			
			cargo.add(cargo);
		}
		
		cargo.forEach(cargo -> System.out.println(cargo));
		
		rs.close();
		st.close();
		conn.close();

	}

}
