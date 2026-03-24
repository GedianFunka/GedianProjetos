package Exercicio_polimorfismo;

import java.util.*;

public class MainTransporte {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Transporte> t1 = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println("=== Menu Principal ===");
			System.out.println("1. Adicionar carro");
			System.out.println("2. Adicionar ônibus");
			System.out.println("3. Adicionar bicicleta");
			System.out.println("4. Listar todos os transportes");
			System.out.println("5. Calcular custos total");
			System.out.println("0. Sair...........");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			
			case 1 :
				System.out.println("---Carro---");
				System.out.println("Digite a distância da sua viajem ou percurso em KM");
				double distancia = s.nextDouble();
				
				System.out.println("Digite a quantidade de passageiros que irá ter no carro ");
				int quantPassageiros = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite o tipo de combustível que vai utilizar ");
				String tipoCombustivel = s.nextLine();
				
				Transporte tc = new Carro (distancia, quantPassageiros, tipoCombustivel);
				
				tc.calcularCusto();
				tc.exibirDetalhes();
				t1.add(tc);
				System.out.println("\n");
				
				break;
				
			case 2 :
				System.out.println("---Ônibus---");
				System.out.println("Digite a distancia da sua viajem ou percurso em KM");
				distancia = s.nextDouble();
				
				System.out.println("Digite a quantidade de passageiros no õnibus ");
				quantPassageiros = s.nextInt();
				s.nextLine();
				
				System.out.println("Qual a quantidade de linhas que o ônibus faz ");
				int linhas = s.nextInt();
				
				Transporte to = new Onibus (distancia, quantPassageiros, linhas);
				
				to.calcularCusto();
				to.exibirDetalhes();
				t1.add(to);
				System.out.println("\n");
				
				break;
				
			case 3 : 
				System.out.println("---Bicicleta---");
				System.out.println("Digite a distancia da sua viajem ou percurso em KM ");
				distancia = s.nextDouble();
				
				System.out.println("Digite a quantidade de pessoas que vão na bicicleta ");
				quantPassageiros = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite o tipo do freio da bicicleta ");
				String tipoFreio = s.nextLine();
				
				Transporte tb = new Bicicleta (distancia, quantPassageiros, tipoFreio);
				
				tb.calcularCusto();
				tb.exibirDetalhes();
				t1.add(tb);
				System.out.println("\n");
				
				break;
				
			case 4 :
				if(t1.isEmpty()) {
					System.out.println("Nenhum transporte cadastrado ainda!!!");
				}else {
					int i = 0;
					System.out.println("---Todos os transportes---");
					for(Transporte tr : t1) {
						System.out.println("\n Transporte " + (i+1) + "---");
						tr.exibirDetalhes();
						i++;
					}
				}
				
				System.out.println("\n");
				
				break;
				
			case 5 :				
				if(t1.isEmpty()) {
					System.out.println("Nenhum transporte cadastrado ainda!!!!");
				}else {
					int i = 0;
					double totalTaxas = 0;
					System.out.println("Taxa de cada transporte realizado");
					for(Transporte tr : t1) {
						double taxa = tr.calcularCusto();
						totalTaxas += taxa;
						System.out.println("\n Taxa do transporte " + (i+1) + ": R$ " + String.format("%.2f", taxa));
					}
					System.out.println("\n Total de taxas : R$" + String.format("%.2f", totalTaxas));
				}
				
				System.out.println("\n");
				
				break;
				
			case 0:
				System.out.println("SAINDO DO SISTEMA......");
				break;
				
				default :
					System.out.println("\nOpção Inválida!!!");
					System.out.println("\n");
			}
			
		}while(opcao != 0);
		
		s.close();
	}

}