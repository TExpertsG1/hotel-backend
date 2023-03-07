package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import infra.FabricaConnexao;

public class TotalRegistros {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = FabricaConnexao.criaConexao();
		
		String sql = "select count(*) as total from cargo";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		rs.next();
		
		int total = rs.getInt("total");
		System.out.println("Total de Cargo: " + total);

		rs.close();
		conn.close();
	}

}
