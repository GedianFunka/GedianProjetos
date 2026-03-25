package Exercicio_polimorfismo;

import java.util.*;

public class FuncionarioMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList <Funcionario> f1 = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.println("\n---Menu de funcionários---");
			System.out.println("1. Adicionar gerente");
			System.out.println("2. Adicionar vendedor");
			System.out.println("3. Adicionar programador");
			System.out.println("4. Listar todos os contra cheques");
			System.out.println("5. Calcular folha de pagamento total");
			System.out.println("6. Buscar funcionário por nome");
			System.out.println("0. Sair......");
			System.out.println("\nEscolha a opção: ");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			
			case 1:
				System.out.println("---Gerente---");
				System.out.println("Digite o nome do gerente: ");
				String nome = s.nextLine();
				
				System.out.println("Digite o salário base do gerente: ");
				double salarioBase = s.nextDouble();
				s.nextLine();
				
				System.out.println("Digite o bonus fixo do gerente: ");
				double bonusFixo = s.nextDouble();
				s.nextLine();
				
				Funcionario fg = new Gerente (nome, salarioBase, bonusFixo);
			
				fg.contraCheque();
				f1.add(fg);
				
				break;
				
			case 2:
				System.out.println("---Vendedor---");
				System.out.println("Digite o nome do vendedor: ");
				nome = s.nextLine();
				
				System.out.println("Digite o salário base do vendedor: ");
				salarioBase = s.nextDouble();
				s.nextLine();
				
				System.out.println("Digite o total de vendas: ");
				double totalVendas = s.nextDouble();
				s.nextLine();
				
				System.out.println("Digite a comissão do vendedor em porcentagem ");
				double comissao = s.nextDouble() / 100;
				s.nextLine();
				
				Funcionario fv = new Vendedor (nome, salarioBase, totalVendas, comissao);
				
				fv.contraCheque();
				f1.add(fv);
				
				break;
				
			case 3:
				System.out.println("---Programador---");
				System.out.println("Digite o nome do programador: ");
				nome = s.nextLine();
				
				System.out.println("Digite o salário base do programador: ");
				salarioBase = s.nextDouble();
				s.nextLine();
				
				System.out.println("Digite a quantidade de horas extras feitas: ");
				int horasExtras = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite o valor de cada hora extra: ");
				double valorHoraExtra = s.nextDouble();
				s.nextLine();
				
				Funcionario fp = new Programador(nome, salarioBase, horasExtras, valorHoraExtra);
				
				fp.contraCheque();
				f1.add(fp);
				
				break;
				
			case 4:
				if(f1.isEmpty()) {
					System.out.println("Nenhum funcionário cadastrado!!");
				}else {
					System.out.println("\n---Todos os contracheques---");
					for(Funcionario fz : f1) {
						fz.contraCheque();
					}
				}
				
				break;
				
			case 5:
				if(f1.isEmpty()) {
					System.out.println("Nenhum funcionário cadastrado!!");
				}else {
					double pagamentoTotal = 0;
					System.out.println("\n---Total de folhas de pagamento---");
					for(Funcionario fx : f1 ) {
						double salario = fx.calcularSalario();
						pagamentoTotal += salario;
					}
					System.out.println("O total de todas as folhas de pagamento é: R$" + String.format("%.2f",pagamentoTotal ));
				}
				System.out.println("\n");
				
				break;
				
			case 6:
				System.out.println("Digite o nome do funcionário: ");
				String busca = s.nextLine();
				boolean encontrado = false;
				for(Funcionario fx : f1) {
					if(fx.getNome().equalsIgnoreCase(busca)) {
						fx.contraCheque();
						encontrado = true;
					}
				}
				
				if(!encontrado) {
					System.out.println("funcionário não encontrado!!!");
				}
				
				break;
				
			case 0:
				System.out.println("Saindo.............");
				
				break;
				
			default:
				System.out.println("\nOpção inválida!!1");
			}
			
		}while(opcao != 0);
		
		s.close();
		
	}
}