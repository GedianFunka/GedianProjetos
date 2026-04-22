package Banco_Dados;

import java.util.*;

public class PessoaMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		int opcao;
		
		do {
			
			System.out.println("== Menu CRUD ==");
			System.out.println("1 - Inserir Pessoas");
			System.out.println("2 - Listar Pessoas");
			System.out.println("3 - Atualizar dados das Pessoas");
			System.out.println("4- Excluir Pessoa");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha a opcao: ");
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			
			case 1:
				
				try {
					System.out.println("Informe seu nome: ");
					String nomeDig = s.nextLine();
					
					System.out.println("Informe sua idade: ");
					int idadeDig = s.nextInt();
					s.nextLine();
					
					System.out.println("Digite seu CPF: ");
					String cpfDig = s.nextLine();
					
					Pessoas natalino = new Pessoas (nomeDig, idadeDig, cpfDig);
					
					PessoaDAO NovaPessoa = new PessoaDAO();
					NovaPessoa.inserir(natalino);
					
				}catch(Exception e){
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 2:
				try {
					
					//Leitura de banco de dados
					List<Pessoas> lista = pessoaDAO.listar();
					
					if(lista.isEmpty()) {
						System.out.println("Nenhuma pessoa cadastrada!!");
					}else {
					
					for(Pessoas p : lista) {
						System.out.println(p);
					}
					}
				}catch(Exception e){
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 3:
				
				try {
				
				System.out.println("ID da pessoa: ");
				int idAtualizar = s.nextInt();
				s.nextLine();
				
				System.out.println("Novo nome: ");
				String novoNome = s.nextLine();
				
				System.out.println("Nova idade: ");
				int novaIdade = s.nextInt();
				s.nextLine();
			
				System.out.println("Novo CPF: ");
				String novoCPF = s.nextLine();
				
				Pessoas pessoaAtualizada = new Pessoas(idAtualizar, novoNome, novaIdade, novoCPF);
				pessoaDAO.atualizar(pessoaAtualizada);
				
				}catch(Exception e){
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 4:
				
				try {
					
					System.out.println("ID para excluir: ");
					int idExcluir = s.nextInt();
					s.nextLine();
					
					pessoaDAO.excluir(idExcluir);
					
				}catch(Exception e){
					System.out.println("Erro no banco: " + e.getMessage());
				}
				
				break;
				
			case 0:
				System.out.println("Saindo..........");
				
				break;
			}
		
			
		}while(opcao != 0);
		
		
		s.close();
		
	}

}