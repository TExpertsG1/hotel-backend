package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;

public class Funcionario {

	public static void main(String[] args) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from funcionario";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		while(rs.next()) {
			Funcionario func = new Funcionario(
					rs.getString("cpf"),
					rs.getInt("idcargos"),
					rs.getString("hotel_cnpj"),
					rs.getString("nome"),
					rs.getDate("data_nascimento"),
					rs.getDate("data_admissao"),
					rs.getDate("data_demissao"),
					rs.getString("logradouro"),
					rs.getInt("numero"),
					rs.getString("complemento"),
					rs.getString("bairro"),
					rs.getString("cidade"),
					rs.getString("uf"),
					rs.getString("cep")
					);
			
			funcionario.add(func);
		}
		
		funcionario.forEach(quarto -> System.out.println(quarto));
		
		rs.close();
		st.close();
		conn.close();
		
	}

}
