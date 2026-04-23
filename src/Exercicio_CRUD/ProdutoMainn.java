package Exercicio_CRUD;

import java.util.*;

public class ProdutoMainn {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		ProdutoDAOO pDAO = new ProdutoDAOO();
		
		int opcao;
		
		do {
			System.out.println("=== Menu ===");
			System.out.println("1 - Inserir produtos");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Atualizar produtos");
			System.out.println("4 - Deletar produtos");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha a opção: ");
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao ) {
			
			case 1:
				try {
					System.out.println("Digite o nome do pruduto: ");
					String nomeProduto = s.nextLine();
					
					System.out.println("Digite o preço do produto: ");
					double precoProduto = s.nextDouble();
					
					System.out.println("Digite a quanidade desse produto: ");
					int quantProduto = s.nextInt();
					
					Produtoo po = new Produtoo(nomeProduto, precoProduto, quantProduto);
					
					pDAO.Inserir(po);
					
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					List <Produtoo> lista = pDAO.listar();
					
					if(lista.isEmpty()) {
						System.out.println("Nenhum produto registrado!");
					}
					for(Produtoo plist : lista) {
						System.out.println(plist);
					}
					
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 3:
				try {
					System.out.println("ID do produto: ");
					int idAtualizar = s.nextInt();
					s.nextLine();
					
					System.out.println("Novo nome: ");
					String nomeAtualizar = s.nextLine();
					
					System.out.println("Novo preço: ");
					double precoAtualizar = s.nextDouble();
					
					System.out.println("Nova quantidade: ");
					int quantAtualizar = s.nextInt();
					s.nextLine();
					
					Produtoo Produtoatt = new Produtoo (idAtualizar, nomeAtualizar, precoAtualizar, quantAtualizar);
					
					pDAO.atualizar(Produtoatt);
					
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 4:
				try {
				System.out.println("ID para excluir: ");
				int IDexcluir = s.nextInt();
				s.nextLine();
				
				pDAO.deletar(IDexcluir);
				
				}catch(Exception e) {
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 0:
				System.out.println("Saindooo........");
				
				break;
			}
			
			
		}while(opcao != 0);
		
		s.close();
		
	}

}