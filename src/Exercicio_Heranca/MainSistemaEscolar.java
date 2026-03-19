package Exercicio_Heranca;

import java.util.*;

public class MainSistemaEscolar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList <Pessoa> p = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("--Cadastro escolar--");
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Cadastrar professor");
			System.out.println("3. Listar todos");
			System.out.println("0. Sair......");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			
			case 1 : 
				System.out.println("--Cadastrando Aluno--\n");
				System.out.println("Nome: ");
				String nome = s.nextLine();
				
				System.out.println("CPF: ");
				String CPF = s.nextLine();
				
				System.out.println("Idade: ");
				int idade = s.nextInt();
				s.nextLine();
				
				System.out.println("Matrícula: ");
				String matricula = s.nextLine();
				
				System.out.println("Curso: ");
				String curso = s.nextLine();
				
				Aluno a1 = new Aluno(nome, CPF, idade, matricula, curso);
				p.add(a1);
				
				break;
				
			case 2:
				System.out.println("--Cadastrando professor--");
				System.out.println("Nome: ");
				nome = s.nextLine();
				
				System.out.println("CPF: ");
				CPF = s.nextLine();
				
				System.out.println("Idade: ");
				idade = s.nextInt();
				s.nextLine();
				
				System.out.println("Disciplina: ");
				String disciplina = s.nextLine();
				
				System.out.println("Salário: ");
				double salario = s.nextDouble();
				
				Professor p1 = new Professor(nome, CPF, idade, disciplina, salario);
				p.add(p1);
				
				break;
				
			case 3 :
				if(p.isEmpty()) {
					System.out.println("Não há cadastros de alunos ou professores");
				}else {
					System.out.println("\n--Listando professores e alunos---");
					for(Pessoa listando : p) {
						listando.ExibirDados();
					}
				
				
			}
				
			case 0:
				System.out.println("Saindo do cadastro............");
				
		}
			
		}while(opcao != 0);
		
	s.close();
		
	
	}
}