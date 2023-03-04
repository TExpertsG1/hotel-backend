package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Hospede;

public class Hospede {

	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from hospede";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<Hospede> hospede = new ArrayList<>();
		
		while(rs.next()) {
			Hospede hospede = new Hospede(
					rs.getString("cpf"),
					rs.getString("nome"),
					rs.getDate("data_nascimento"),
					rs.getString("telefone"),
					rs.getString("email")
					);
			
			hospede.add(hospede);
		}
		
		hospede.forEach(hospede -> System.out.println(hospede));
		
		rs.close();
		st.close();
		conn.close();
		
	}

}
