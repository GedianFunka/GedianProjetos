package Avaliacao;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalagoFilmesMain {

	public static void main(String[] args) {

		ArrayList<Filme> catalogo = new ArrayList <>();
		
		Scanner s = new Scanner (System.in);
		
		int opcao;
		
		do {
			
			System.out.println("---Menu de filmes---");
			System.out.println("1. Adicionar Filme ou Documentario");
			System.out.println("2. Ver catálogo");
			System.out.println("3. Buscar obra por título");
			System.out.println("4. Remover obra");
			System.out.println("5. Sair...");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			
			case 1 : 
				System.out.println("Adicionando Filme ou Documentario!!");
				System.out.println("Digite 1 para cadastrar uma filme ou 2 para cadastrar um documentario");
				int escolha = s.nextInt();
				s.nextLine();
				
				if(escolha == 1) {
					System.out.println("---Cadastrando uma filme---");
					
					System.out.println("Digite o nome do titulo do filme: ");
					String titulof = s.nextLine();
					
					System.out.println("Digite o ano do filme: ");
					int anof = s.nextInt();
					s.nextLine();
					
					Filme f = new Filme(titulof, anof);
					catalogo.add(f);
					
				}else if(escolha == 2){
					System.out.println("---Cadastrando um documentario---");
					
					System.out.println("Digite o nome do titulo do documentatrio: ");
					String titulod = s.nextLine();
					
					System.out.println("Digite o ano do documentario: ");
					int anod = s.nextInt();
					s.nextLine();
					
					System.out.println("Digite o tema do documentario: ");
					String tema = s.nextLine();
					
					Documentario d = new Documentario(titulod, anod, tema);
					catalogo.add(d);
					
				}
				
				break;
				
			case 2: 
				System.out.println("---Listando catálogo---");
				if(catalogo.isEmpty()) {
					System.out.println("Não há nenhum registro no catálogo!!!");
				}else {
					for(int i = 0; i < catalogo.size(); i++) {
						System.out.println("\n" + (i +1) + "--");
						catalogo.get(i).exibirInfo();
						System.out.println("\n");
					}
					System.out.println("A quanidade de registros é: " + catalogo.size() + "\n");

				}
				
				break;
				
			case 3:
				System.out.println("---Buscando obra pelo título---");
				System.out.println("Digite uma parte do título que você quer buscar: ");
				String busca = s.nextLine();
				boolean encontrado = false;
				
				for(Filme listar : catalogo) {
					if(listar.getTitulo().contains(busca)) {
						listar.exibirInfo();
						encontrado = true;
						System.out.println("\n");
					}
				}
				
						if(!encontrado) {
						System.out.println("Obra não encontrada no catálogo");
				}
				
				break;
				
			case 4:
				if(catalogo.isEmpty()) {
					System.out.println("Não há nenhum registro no catálogo!!!");
				}else {
				
				System.out.println("---Removendo uma obra---");
				
				for(int i = 0; i < catalogo.size(); i++) {
					System.out.println("\n" + (i +1) + "--");
					catalogo.get(i).exibirInfo();
				}
				
				System.out.println("\nDigite o número do item a ser excluido: ");
				int excluir = s.nextInt();
				s.nextLine();
				
				if(excluir >= 0 && excluir < catalogo.size()) {
					catalogo.remove(excluir);//Não coloquei o -1 pois o programa não estava encontrando o índice!!!!
					System.out.println("---Obra removida com sucesso!!!---\n");
				}else {
					System.out.println("Esse índice não está no catálogo");
				}
				}
				
				break;
				
			case 5:
				System.out.println("Saindo........");
				
				break;
				
				default:
					System.out.println("Opção inváilida!!!!");
				
			}
			
			
		}while(opcao != 5);
			
		s.close();
		
	}

}