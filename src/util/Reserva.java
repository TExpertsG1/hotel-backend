package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Reserva;

public class Reserva {

	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from reserva";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<Reserva> reserva = new ArrayList<>();
		
		while(rs.next()) {
			
			LocalDate dateIn = rs.getDate("data_check_in").toLocalDate();
			LocalDate dateOut = rs.getDate("data_check_out").toLocalDate();
			Reserva reserva = new Reserva(
					rs.getInt("idreserva"),
					rs.getInt("idquarto"),
					rs.getString("hospede_cpf"),
					rs.getInt("quantidade_adulto"),
					rs.getInt("quantidade_crianca"),
					dateIn,
					dateOut
					
					);
			
			reserva.add(reserva);
		}
		
		reserva.forEach(reserva -> System.out.println(reserva));
		
		rs.close();
		st.close();
		conn.close();

	}

	public Object getQuarto() {
		// TODO Auto-generated method stub
		return null;
	}

}
