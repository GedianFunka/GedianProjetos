package Exercicio_polimorfismo;

import java.util.*;

public class AnimalMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList <Animal> a1 = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.println("\n---Menu de animais---");
			System.out.println("1. Adicionar Leão");
			System.out.println("2. Adicionar Elefante");
			System.out.println("3. Adicionar Papagaio");
			System.out.println("4. Listar todos os animais");
			System.out.println("5. Fazerem todos os animais emitirem o som");
			System.out.println("6. Mostrar dieta de todos");
			System.out.println("0. Sair........");
			System.out.println("\nEscolha a opção: ");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			
			case 1:
				System.out.println("---Leão---");
				System.out.println("Digite o nome do leão: ");
				String nome = s.nextLine();
				
				System.out.println("Digite a idade dele: ");
				int idade = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite o peso do leão: ");
				double peso = s.nextDouble();
				
				Animal al = new Leao(nome, idade, peso);
				
				al.exibirInfo();
				a1.add(al);
				
				break;
				
			case 2: 
				System.out.println("---Elefante---");
				System.out.println("Digite o nome do elefante: ");
				nome = s.nextLine();
				
				System.out.println("Digite a idade dele: ");
				idade = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite o peso do elefante");
				peso = s.nextDouble();
				
				System.out.println("Digite o comprimento em metros do elefante: ");
				double comprimento = s.nextDouble();
				
				Animal ae = new Elefante (nome, idade, peso, comprimento);
				
				ae.exibirInfo();
				a1.add(ae);
				
				break;
				
			case 3: 
				System.out.println("---Papagaio---");
				System.out.println("Digite o nome do papagaio: ");
				nome = s.nextLine();
				
				System.out.println("Digite a idade dele: ");
				idade = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite o peso do papagaio: ");
				peso = s.nextDouble();
				s.nextLine();
				
				System.out.println("Digite a cor das penas do papagaio: ");
				String corPenas = s.nextLine();
				
				Animal ap = new Papagaio (nome, idade, peso, corPenas);
				
				ap.exibirInfo();
				a1.add(ap);
				
				break;
				
			case 4:
				if(a1.isEmpty()) {
					System.out.println("Nenhum animal registrado!!!");
				}else {
					int i = 0;
					System.out.println("---Todos os animais cadastrados---");
					for(Animal az: a1) {
						System.out.println("Animal : " + (i+1) + "---");
						az.exibirInfo();
						i++;
					}
				}
				
				break;
				
			case 5:
				if(a1.isEmpty()) {
					System.out.println("Nenhum animal cadastrado!!!");
				}else {
					int i = 0;
					for(Animal ax: a1) {
						System.out.println("O som do animal: " + (i+1) + "---");
						ax.emitirSom();
						i++;
					}
				}
				
				break;
				
			case 6:
				if(a1.isEmpty()) {
					System.out.println("Nenhum animal cadastrado!!!!");
				}else {
					int i = 0;
					System.out.println("---Dieta dos animais---");
					for(Animal av : a1) {
						System.out.println("A dieta do animal: " + (i+1) + "- " + av.getNome() + " é:" + av.gettipoALimento());
					}
				}
				
				break;
				
			case 0:
				System.out.println("\nSaindooo.............");
				
				break;
				
			default:
				System.out.println("\nOpção inválida!!!");	
			}
			
		}while(opcao != 0);
		
		s.close();
			
		}
	}