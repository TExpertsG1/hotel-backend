package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Quarto;

public class Quarto {

		public static void main(String[] args) throws SQLException {
			Connection conn = FabricaConnexao.criaConexao();
			System.out.println("Banco de Dados Conectado");
			
			String sql = "select * from quarto";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			
			List<Quarto> quarto = new ArrayList<>();
			
			while(rs.next()) {
				Quarto quarto = new Quarto(
						rs.getInt("idquarto"),
						rs.getString("hotel_cnpj"),
						rs.getString("nomeQuarto"),
						rs.getInt("numero"),
						rs.getInt("capacidade"),
						rs.getDouble("diaria")
						);
				
				quarto.add(quarto);
			}
			
			quarto.forEach(quarto -> System.out.println(quarto));
			
			rs.close();
			st.close();
			conn.close();
			
		}

	}


