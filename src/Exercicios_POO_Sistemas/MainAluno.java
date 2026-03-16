package Exercicios_POO_Sistemas;

import java.util.*;

public class MainAluno {

	public static void main(String[] args) {

	Scanner s = new Scanner (System.in);
	
	ArrayList <Aluno> a1 =  new ArrayList <>();
	
	int opcao;
	
	do {
		
		System.out.println("==Cadastro de alunos===");
		System.out.println("1. Adicionar aluno");
		System.out.println("2. Listar alunos");
		System.out.println("3. Buscar aluno por nome");
		System.out.println("4. Mostrar aprovados");
		System.out.println("5. Mostrar reprovados");
		System.out.println("6. Calcular media da turma");
		System.out.println("0. Sair........");
		
		opcao = s.nextInt();
		s.nextLine();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Digite o nome do aluno");
			String nome = s.nextLine();
			
			System.out.println("Digite sua primeira nota");
			Double nota = s.nextDouble();
			
			System.out.println("Digite sua segunda nota");
			Double nota2 = s.nextDouble();
		
			Aluno Aluno_Novo = new Aluno(nome,nota,nota2);
			a1.add(Aluno_Novo);
			
			System.out.println("\nCadastro de aluno realizado com sucesso!!!!\n");
			
			break;
			
		case 2 :
			if(a1.isEmpty()) {
				System.out.println("Nenhum aluno cadastrado");
			}else {
				for(int i = 0; i < a1.size(); i++) {
					System.out.println((i+1) + " .");
					a1.get(i).ExibirDados();
				}
				
				System.out.println("A quantidade de alunos cadastrados é: " + a1.size() );
				
			}
			break;
			
		case 3 :
			if(a1.isEmpty()) {
				System.out.println("Nenhum aluno cadastrado");
			}else {
			
			System.out.println("Digite seu nome para ser buscado nos alunos cadastrados");
			String busca = s.nextLine();
			
			boolean encontrado = false;
			
			for(Aluno buscar : a1) {
				if(buscar.getNome().contains(busca)) {
				buscar.ExibirDados();
				encontrado = true;
				
			}else {
				if(!encontrado) {
					System.out.println("Aluno não encontrado");
				}
			}	
			}
		}
		
		break;
			
		case 4 :
			int aprovados = 0;
			if(a1.isEmpty()) {
				System.out.println("Nenhum contato cadastrado");
			}else {
				for(Aluno percorre : a1) {
					if(percorre.ObterResultados().equals("Aprovado")) {
						percorre.ExibirDados();
						aprovados ++ ;
						
					}
				}
				
				System.out.println("\nA quantidade de aprovados é: " + aprovados + "\n") ;
				
			}
			break;
			
		case 5 : 
			int reprovados = 0;
			if(a1.isEmpty()) {
				System.out.println("Nenhum aluno registrado");
			}else {
				for(Aluno percorrer: a1) {
					if(percorrer.ObterResultados().equals("Reprovado")) {
						percorrer.ExibirDados();
						reprovados ++ ;
					}
				}
				System.out.println("\nA quantdidade de reprovados é: " + reprovados + "\n");
			}
			break;
			
		case 6 :
			if(a1.isEmpty()) {
				System.out.println("Nenhum aluno encontrado");
			}else {
			
			for(Aluno Per_Alunos : a1) {
				Per_Alunos.ObterResultados();
			}
			
			double Soma = 0;
			for(Aluno soma_media : a1 ) {
				Soma += soma_media.CalcularMedia();
				
			}
			
			System.out.println("\nA média de todos os alunos é: " + Soma + "\n");
			
			double MediaTurma = Soma / a1.size();
			System.out.println("A média da turma é: " + MediaTurma + "\n"); 
			
		}
			
			break;
			
		case 0 :
			
			System.out.println("Saindo.................");
			break;
			
			default:
				System.out.println("Opcão inválida");
				break;
				
	}
		
	} while(opcao != 0);
	
	s.close();


}
}
