package Exercicios_POO_Sistemas;

import java.util.*;

public class MainContato {

	public static void main(String[] args) {

	ArrayList <Contato>  c1 = new ArrayList<>();
	
	Scanner s = new Scanner (System.in);
	
	int opcao;
	
	do {
		System.out.println("===Agenda de contatos===");
		System.out.println("1. Adicionar contato");
		System.out.println("2. Listar contato");
		System.out.println("3. Buscar por nome");
		System.out.println("4. Remover contato");
		System.out.println("0. Sair.....");
		
		opcao = s.nextInt();
		s.nextLine();
		
		switch (opcao) {
		
		case 1 :
			System.out.println("Digite o nome do contato ");
			String nome = s.nextLine();
			System.out.println("Digite o telefone ");
			String telefone = s.nextLine();
			Contato Novo_Ctt = new Contato(nome, telefone);
			c1.add(Novo_Ctt);
			System.out.println("O contato foi cadastrado com sucesso!!!!\n" );
			
			break;
			
		case 2 :
			if(c1.isEmpty()) {
				System.out.println("Nenhum contato cadastrado");
			}else {
				for(int i = 0; i < c1.size(); i++) {
					System.out.println((i+1) + ". ");
					c1.get(i).ExibirDados();
				}
				
				System.out.println("\nA quantidade de contatos cadastrados é: " + c1.size() + "\n");
				
			}
			
			break;
			
		case 3 : 
			if(c1.isEmpty()) {
				System.out.println("Nenhum contato cadastrado");
			}
				
			System.out.println("\nDigite um nome para ser buscado no seu contato\n");
			String nomebs = s.nextLine();
			
			boolean encontrado = false;	
			
			for(Contato buscar : c1) {
				if(buscar.getNome().contains(nomebs)) {
					buscar.ExibirDados();
					encontrado = true;
					
				}	
			}
			if(!encontrado) {
				System.out.println("Nenhum contato encontrado!!!!");
			}
			
			break;
			
		case 4 :
			if(c1.isEmpty()) {
				System.out.println("Nenhum contato cadastrado");

			}
			
			int i = 0;
			
			System.out.println("===Lista de contatos===");
			
			for(Contato c2 : c1) {
				System.out.println( (i+1) + ". " + c2.getNome());
				i++;
			}
			System.out.println("\nDigite um número de indíce para ser removido da lista de contatos\n");
			int num = s.nextInt();
			
			if(num >= 1 && num < c1.size()) {
				c1.remove(num - 1);
				System.out.println("\nO contato encomtrado no indíce " + num + " foi removido com sucesso\n");
			}else {
				System.out.println("O indíce é inválido na lista de contatos");
			}
			
		case 0 :
			
			System.out.println("Saindo.................");
			break;
			
			default:
				System.out.println("Opcão inválida");
			
		}
	
	}while(opcao != 0);
	
	s.close();
	
	}

}