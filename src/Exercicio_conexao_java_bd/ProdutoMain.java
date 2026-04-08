package Exercicio_conexao_java_bd;

import java.util.*;

public class ProdutoMain {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		try {
			System.out.println("Digite o nome do produto ");
			String nomeDig = s.nextLine();
			
			System.out.println("Digite o preço do produto ");
			double precoDig = s.nextDouble();
			
			System.out.println("Digite a quantidade do porduto em estoque ");
			int quantDig = s.nextInt();
			
			Produto p1 = new Produto(nomeDig, precoDig, quantDig);
			
			ProdutoDAO p1DAO = new ProdutoDAO();
			p1DAO.inserir(p1);
			
			List<Produto> lista = p1DAO.listar();
			
			for(Produto p : lista) {
				System.out.println(p);
			}
			
		}catch(Exception e) {
			System.out.println("Erro no banco: "+ e.getMessage());
		
	}
		s.close();
	}
}
