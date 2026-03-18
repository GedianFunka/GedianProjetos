package Exercicio_Heranca;

import java.util.*;

public class MainTesteProdutos {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("--Cadastrando Livro--");
		System.out.println("Nome: ");
		String nome = s.nextLine();
		
		System.out.println("Preço: ");
		double preco = s.nextDouble();
		
		System.out.println("Quantidade: ");
		int quantidade = s.nextInt();
		s.nextLine();
		
		System.out.println("Autor: ");
		String autor = s.nextLine();
		
		Livro l1 = new Livro (nome, preco, quantidade, autor);
		
		//-----------------------------------------------
		
		System.out.println("--Cadastrando Eletronico--");
		System.out.println("Nome: ");
		nome = s.nextLine();
		
		System.out.println("Preço: ");
		preco = s.nextDouble();
		
		System.out.println("Quantidade: ");
		quantidade = s.nextInt();
		
		System.out.println("Garantia em meses: ");
		int GarantiaMeses = s.nextInt();
		
		Eletronico e1 = new Eletronico(nome, preco, quantidade, GarantiaMeses);
		
		System.out.println("\n");
		l1.ExibirDados();
		System.out.println("\n");
		e1.ExibirDados();
		
		s.close();
	}

}
