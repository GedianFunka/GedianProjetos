package Treinando_prova;

import java.util.*;

public class FuncionarioMain {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		ArrayList<Funcionario> f = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("---Menu de opções de funcionários---");
			System.out.println("1. Adicionar Gerente");
			System.out.println("2. Adicionar Vendedor");
			System.out.println("3. Adicionar Estagiario");
			System.out.println("4. Listar todos os funcionarios");
			System.out.println("5. Calcular todos os salarios");
			System.out.println("0. Sairrr");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			
			case 1 :
				try {
					System.out.println("Digite o nome do gerente: ");
					String nome = s.nextLine();
					
					System.out.println("Digite a idade dele: ");
					int idade = s.nextInt();
					s.nextLine();
					
					System.out.println("Digite seu salário base: ");
					double salarioBase = s.nextDouble();
					s.nextLine();
					
					System.out.println("Digite seu bonus: ");
					double bonus = s.nextDouble();
					
					Funcionario fg = new Gerente(nome, idade, salarioBase, bonus);
					fg.calcularSalario();
					fg.toString();
					f.add(fg);
					
				}catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
				
				break;
				
			case 2 :
				try {
					System.out.println("Digite o nome do vendedor: ");
					String nome = s.nextLine();
					
					System.out.println("Digite a idade dele: ");
					int idade = s.nextInt();
					s.nextLine();
					
					System.out.println("Digite seu salário base: ");
					double salarioBase = s.nextDouble();
					s.nextLine();
					
					System.out.println("Digite sua comissão: ");
					double comissao = s.nextDouble();
					
					Funcionario fv = new Vendedor(nome, idade, salarioBase, comissao);
					
					fv.calcularSalario();
					fv.toString();
					f.add(fv);
					
				}catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
				
				break;
				
			case 3 :
				try {
					System.out.println("Digite o nome do estagiario: ");
					String nome = s.nextLine();
					
					System.out.println("Digite a idade dele: ");
					int idade = s.nextInt();
					s.nextLine();
					
					System.out.println("Digite seu salário base: ");
					double salarioBase = s.nextDouble();
					s.nextLine();
					
					System.out.println("Digite suas horas trabalhadas: ");
					int horasTrabalhadas = s.nextInt();
					
					Funcionario fe = new Estagiario(nome, idade, salarioBase, horasTrabalhadas);
					
					fe.calcularSalario();
					fe.toString();
					f.add(fe);
					
				}catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
				
				break;
				
			case 4:
				try {
					
					if(f.isEmpty()) {
						System.out.println("Nenhum funcionário cadastrado!!");
					}else {
					
					System.out.println("Listando todos os funcionarios!!");
					
					for(Funcionario listar : f) {
						System.out.println("\n");
						listar.toString();
					}
				}
					
				}catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
						
					}
				
				break;
				
			case 5:
				try {
					
					if(f.isEmpty()) {
						System.out.println("Nenhum funcionário está cadastrado!!!");
					}else {
						double totalSalario = 0;
						System.out.println("O total de folha salarial dessa empresa é de: ");
						for(Funcionario pg : f) {
						double salario = pg.calcularSalario();
						totalSalario += salario;
						}
						System.out.println(String.format("%.2f", totalSalario));
					}
					
				}catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
				
				break;
				
			case 0 :
				try {
					System.out.println("Saindoo.............");
					
				}catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
				
				default:
					System.out.println("Opção inválida\n");
				}
			
			
		}while(opcao != 0);
		
		s.close();
		
	}

}
