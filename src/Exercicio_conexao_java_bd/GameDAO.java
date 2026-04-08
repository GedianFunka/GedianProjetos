package Exercicio_conexao_java_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {

	public void inserir(Game g) throws SQLException{
		String sql = "INSERT INTO games(titulo, plataforma, genero, anoLancamento, precoAluguel) VALUES (?, ?, ?, ?, ?)";
		
		try(Connection conn = Conexao3.conectar()){
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, g.getTitulo());
			stmt.setString(2, g.getPlataforma());
			stmt.setString(3, g.getGenero());
			stmt.setInt(4, g.getAnoLancamento());
			stmt.setDouble(5, g.getPrecoAluguel());
			
			stmt.executeUpdate();
			System.out.println("Game cadastrado com sucesso!!!");
		}
	}
	
	public List<Game> listar() throws SQLException{
		List<Game> lista = new ArrayList <>();
		String sql = "SELECT * FROM games";
		
		try(Connection conn = Conexao3.conectar()){
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				lista.add(new Game(
						rs.getString("titulo"),
						rs.getString("plataforma"),
						rs.getString("genero"),
						rs.getInt("anoLancanmento"),
						rs.getInt("precoAluguel")
						));
			}
			
			return lista;
			
		}
		
	}
	
}
