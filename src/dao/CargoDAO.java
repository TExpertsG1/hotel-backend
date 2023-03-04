package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infra.FabricaConnexao;
import modelo.Cargo;

public class CargoDAO {
	
	public void insere(Cargo cargo) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		
		String sql = "insert into cargo(cargo,salario) values(?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, cargo.getCargo());
		st.setDouble(2, cargo.getSalario());
		
		st.execute();
		
		System.out.println("Cargo " + cargo + " adicionado");
		st.close();
		conn.close();
	}
	
	public void update(Cargo cargo) throws SQLException  {
		Connection conn = FabricaConnexao.criaConexao();
				
		String sql = "update cargo set cargo = ?, salario = ?  where idcargos = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, cargo.getCargo());
		st.setDouble(2, cargo.getSalario());
		//st.execute();
		System.out.println("Cargo Alterado com Sucesso");
		
		st.close();
		conn.close();
	}
	
	
	
	public List<Cargo> listagem() throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		System.out.println("Banco de Dados Conectado");
		
		String sql = "select * from cargo";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		List<Cargo> cargo = new ArrayList<>();
		
		while(rs.next()) {
			Cargo cargo1 = new Cargo(
					rs.getInt("idcargos"),
					rs.getString("cargo"),
					rs.getDouble("salario")
					);
			
			cargo1.add(cargo1);
		}
		rs.close();
		st.close();
		conn.close();
		return cargo;

		

	}
	
	public void delete(int idcargos) throws SQLException {
		Connection conn = FabricaConnexao.criaConexao();
		
		String sql = "delete from cargo where idcargos = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, idcargos); //Posição e o atributo
		st.execute();
		
		System.out.println("Cargo de id: " + idcargos + " foi removido");
		
		st.close();
		conn.close();
	}

	public Cargo buscaPor(int idcargos) throws SQLException {
		Cargo cargo = null;
		
		Connection conn = FabricaConnexao.criaConexao();
		String sql = "select * from cargo where idcargos = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, idcargos);
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			cargo = new Cargo(
					rs.getInt("idcargos"),
					rs.getString("cargo"),
					rs.getDouble("salario")
				
					);
		}
		rs.close();
		st.close();
		conn.close();
		return cargo;
		
	}
	
	}

