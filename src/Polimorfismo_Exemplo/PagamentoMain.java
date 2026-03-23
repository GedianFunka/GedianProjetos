package Polimorfismo_Exemplo;

import java.util.*;

public class PagamentoMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Pagamento> pagamentos = new ArrayList <>();
		
		int opcao;
		
		do {
			
			System.out.println("== MENU PRINCIPAL ==");
			System.out.println("1. Pagar com cartão de crédito");
			System.out.println("2. Pagar com PIX");
			System.out.println("3. Pagar com boleto");
			System.out.println("4. Listar todos os pagamentos");
			System.out.println("5. Calcular total");
			System.out.println("0. Sair.........");
			
			System.out.println("Escolha uma opção: ");
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			
			case 1 :
				System.out.println("Pagamento com cartão");
				System.out.println("Titular: ");
				String titularCartao = s.nextLine();
				
				System.out.println("Valor: ");
				double valorCartao = s.nextDouble();
				s.nextLine();
				
				System.out.println("Número do cartão (16 dígitos)");
				String numeroCartao = s.nextLine();
				
				//Polimorfismo: Tipo pagamento, Objeto pc (Pagamento cartão )
				Pagamento pc = new CartaoCredito (titularCartao, valorCartao, numeroCartao);
				
				pc.processarPagamento();
				pc.calcularTaxa();
				pagamentos.add(pc);
				
				break;
				
			case 2 :
				System.out.println("Pagamento com PIX");
				System.out.println("Titular: ");
				String titular = s.nextLine();
				
				System.out.println("Valor PIX: ");
				double valor = s.nextDouble();
				s.nextLine();
				
				System.out.println("Chave PIX: ");
				String chave = s.nextLine();
				
				//Poçimorfismo: Tipo pagamento, objeto pp (pagamento PIX)
				Pagamento pp = new Pix (titular, valor, chave);
				
				pp.processarPagamento();
				pp.calcularTaxa();
				pagamentos.add(pp);
				
				break;
				
			case 3 :
				System.out.println("Pagamento com boleto");
				System.out.println("Titular: ");
				titular = s.nextLine();
				
				System.out.println("Valor boleto: ");
				valor = s.nextDouble();
				s.nextLine();
				
				System.out.println("Código de barras boleto: ");
				String codigoBarras = s.nextLine();
				
				//Poçimorfismo: Tipo pagamento, objeto pb (pagamento boleto)
				Pagamento pb = new Boleto (titular, valor, codigoBarras);
				
				pb.processarPagamento();
				pb.calcularTaxa();
				pagamentos.add(pb);
				
				break;
				
			case 4: // Listar todos
                if (pagamentos.isEmpty()) {
                    System.out.println("\nNenhum pagamento realizado ainda!");
                } else {
                    System.out.println("\n═══ TODOS OS PAGAMENTOS ═══");
                    for (int i = 0; i < pagamentos.size(); i++) {
                        System.out.println("\n--- Pagamento #" + (i + 1) + " ---");
                        // POLIMORFISMO EM AÇÃO!
                        // Cada objeto chama SUA versão do método!
                        pagamentos.get(i).processarPagamento();
                    }
                }
                break;
            
            case 5: // Total de taxas
                if (pagamentos.isEmpty()) {
                    System.out.println("\nNenhum pagamento realizado ainda!");
                } else {
                    double totalTaxas = 0;
                    System.out.println("\n═══ TAXAS POR PAGAMENTO ═══");
                    for (int i = 0; i < pagamentos.size(); i++) {
                        // POLIMORFISMO EM AÇÃO!
                        // Cada classe calcula sua taxa de forma diferente!
                        double taxa = pagamentos.get(i).calcularTaxa();
                        totalTaxas += taxa;
                        System.out.println("Pagamento #" + (i + 1) + ": R$ " + 
                                         String.format("%.2f", taxa));
                    }
                    System.out.println("\nTOTAL DE TAXAS: R$ " + 
                                     String.format("%.2f", totalTaxas));
                }
                break;
            
            case 0:
               
                System.out.println("Sistema encerrado!");
                break;
            
            default:
                System.out.println("\nOpção inválida! Tente novamente.");
        }
				
		}while(opcao != 0);
		
		s.close();
		
	}

}
