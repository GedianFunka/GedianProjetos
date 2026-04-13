package Exercicio_conexao_java_bd;

import java.util.List;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		try {
			System.out.println("Digite o título do game: ");
			String tituloDig = s.nextLine();
			
			System.out.println("Digite a plataforma: ");
			String plataformaDig = s.nextLine();
			
			System.out.println("Digite o genêro: ");
			String generoDig = s.nextLine();
			
			System.out.println("Digite o ano do game: ");
			int anolancamentoDig = s.nextInt();
			s.nextLine();
			
			System.out.println("Digite o preço do aluguel: ");
			double precoAluguelDig = s.nextDouble();
			
			Game g1 = new Game(tituloDig, plataformaDig, generoDig, anolancamentoDig, precoAluguelDig );
			
			GameDAO g1DAO = new GameDAO();
			g1DAO.inserir(g1);
			
			List <Game> lista = g1DAO.listar();
			
			for(Game g: lista) {
				System.out.println(g);
			}
			
		}catch(Exception e ) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			System.out.println("Sistema finalizado");
		}
		s.close();
	}

}
