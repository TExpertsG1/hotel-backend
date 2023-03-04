package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Hotel;

public class Hotel {

	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from hotel";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<Hotel> hotel = new ArrayList<>();
		
		while(rs.next()) {
			Hotel hotell = new Hotel(
					rs.getString("cnpj"),
					rs.getString("nome_hotel"),
					rs.getString("logradouro"),
					rs.getInt("numero"),
					rs.getString("cep"),
					rs.getString("uf"),
					rs.getString("estado")
					);
			
			hotel.add(hotell);
		}
		
		hotel.forEach(hotell -> System.out.println(hotell));
		
		rs.close();
		st.close();
		conn.close();
		
	}
}
