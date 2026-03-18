package Exercicio_Heranca;

import java.util.*;

public class MainTesteCachorro {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("--Cadastro de cahorro-");
		System.out.println("Nome: ");
		String nome = s.nextLine();
		
		System.out.println("Idade: ");
		int idade = s.nextInt();
		s.nextLine();
		
		System.out.println("Raça: ");
		String raca = s.nextLine();
		
		Cachorro c1 = new Cachorro (nome, idade, raca);
		System.out.println("\n");
		c1.ExibirDados();
		
		
		s.close();
	}

}
