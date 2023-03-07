package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Cargo;

public class Cargo {

	public Cargo(int int1, String string, double double1) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from cargo";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<Cargo> cargos = new ArrayList<>();
		
		while(rs.next()) {
			Cargo cargo = new Cargo(
					rs.getInt("idcargos"),
					rs.getString("cargo"),
					rs.getDouble("salario")
					);
			
			cargos.add(cargo);
		}
		
		cargos.forEach(cargo1 -> System.out.println(cargo1));
		
		rs.close();
		st.close();
		conn.close();

	}
}
