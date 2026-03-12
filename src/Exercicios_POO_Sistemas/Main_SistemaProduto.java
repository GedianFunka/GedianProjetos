package Exercicios_POO_Sistemas;

import java.util.*;

public class Main_SistemaProduto {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList <String> produtos = new ArrayList <>();
		
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
				
			}
			
		}
		while (opcao != 0);
		
		s.close();

	}

}
