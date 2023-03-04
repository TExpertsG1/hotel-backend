package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;

public class FormaDePagamento {


	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from forma_de_pagamento";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<FormaDePagamento> pgtos = new ArrayList<>();
		
		while(rs.next()) {
			FormaDePagamento pgto = new FormaDePagamento(
					rs.getInt("idpagamento"),
					rs.getString("forma_pagamento"),
					rs.getInt("idreserva")
					);
			
			pgtos.add(pgto);
		}
		
		pgtos.forEach(pgto -> System.out.println(pgto));
		
		rs.close();
		st.close();
		conn.close();

	}

}
