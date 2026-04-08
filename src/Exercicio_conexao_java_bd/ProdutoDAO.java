package Exercicio_conexao_java_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

	//Criar produtos
	public void inserir (Produto p) throws SQLException{
		String sql =  ("INSERT INTO cadastros_produtos(nome, preco, quantidade) VALUES (?, ?, ?)");
		
		try(Connection conn = Conexao2.conectar()){
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, p.getNome());
			stmt.setDouble(2, p.getPreco());
			stmt.setInt(3, p.getQuantidade());
			
			stmt.executeUpdate();
			System.out.println("Produto inserido com sucesso!!");
		}
	}
	
	//Listando todos os produtos
	public List<Produto> listar() throws SQLException{
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM cadastros_produtos";
		
		try(Connection conn = Conexao2.conectar();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			
			while(rs.next()) {
				lista.add(new Produto(
						rs.getInt("id"),
						rs.getString("nome"),
						rs.getDouble("preco"),
						rs.getInt("quantidade")
						));
			}
			return lista;
			}
		}
	}