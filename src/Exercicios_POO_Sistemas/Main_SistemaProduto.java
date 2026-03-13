package Exercicios_POO_Sistemas;

import java.util.*;

public class Main_SistemaProduto {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList <SistemaProduto> produtos = new ArrayList <>();
		
		int opcao;
		
		do {
			System.out.println("===Cadastro de produtos");
			System.out.println("1. Adicionar produtos");
			System.out.println("2. Listar produtos");
			System.out.println("3. Contar produtos");
			System.out.println("0. SAIR");
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			
			case 1 :
				System.out.println("Adicionando produtos.....");
				System.out.println("Digite o nome do roduto que deve ser cadastrado");
				String nome = s.nextLine();
				System.out.println("Digite o preço do produto");
				double preco = s.nextDouble();
				System.out.println("Digite a quantodade de produtos que irá entrar no estoque");
				int quant = s.nextInt();
				SistemaProduto p1 = new SistemaProduto(nome,preco, quant); //Criando objeto que armazen as 3 três variáveis
				produtos.add(p1);
				System.out.println("O produto " + nome + " foi criado com sucesso\n");
				
				break;
				
			case 2 :
				if(produtos.isEmpty()) {
					System.out.println("ArrayList vazio");
					
				}else {
					for(int i = 0 ; i < produtos.size(); i++) {
						System.out.println((i+1) + ". ");
						produtos.get(i).ExibirDados();
						
						
					}
				}
				
				break;
				
			case 3 :
				System.out.println("O total de produtos cadastrados é: " + produtos.size());	
				
				break;
				
				
			case 0 :
				System.out.println("SAINDOOO ..........");
				
				break;
			
			}
			
		}
		while (opcao != 0);
		
		s.close();

	}

}
