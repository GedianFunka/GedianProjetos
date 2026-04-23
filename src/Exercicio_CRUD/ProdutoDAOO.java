package Exercicio_CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProdutoDAOO {

	//Criar produtos
		public void Inserir (Produtoo p) throws SQLException{
			String sql =  ("INSERT INTO cadastros_produtos(nome, preco, quantidade) VALUES (?, ?, ?)");
			
			try(Connection conn = Conexaoo.conectar()){
				PreparedStatement stmt = conn.prepareStatement(sql);
				
				stmt.setString(1, p.getNome());
				stmt.setDouble(2, p.getPreco());
				stmt.setInt(3, p.getQuantidade());
				
				stmt.executeUpdate();
				
				System.out.println("Produto inserido com sucesso!!");
			}
		}
		
		//Listando todos os produtos
		public List<Produtoo> listar() throws SQLException{
			List<Produtoo> lista = new ArrayList<>();
			String sql = "SELECT * FROM cadastros_produtos";
			
			try(Connection conn = Conexaoo.conectar();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql)){
				
				while(rs.next()) {
					lista.add(new Produtoo(
							rs.getInt("id"),
							rs.getString("nome"),
							rs.getDouble("preco"),
							rs.getInt("quantidade")
							));
				}
				return lista;
				}
			}
		
		//Atualizando
		public void atualizar (Produtoo p) throws SQLException{
			String sql = "UPDATE cadastros_produtos SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";
			
			try(Connection conn = Conexaoo.conectar();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setString(1, p.getNome());
				stmt.setDouble(2, p.getPreco());
				stmt.setInt(3, p.getQuantidade());
				stmt.setInt(4, p.getId());
				
				stmt.executeUpdate();
				System.out.println("Dados atualizados!");
				
				}
			}
		
		//Deletando
		public void deletar (int id) throws SQLException{
			String sql = "DELETE from cadastros_produtos WHERE id = ?";
			
			try(Connection conn = Conexaoo.conectar();
					PreparedStatement stmt = conn.prepareStatement(sql)){
				
				stmt.setInt(1, id);
				
				stmt.executeUpdate();
				System.out.println("Dados deletados com sucesso!");
				
			}
		}
		
		}
