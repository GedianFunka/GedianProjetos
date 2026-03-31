package Exercicios_Excecoes;

import java.util.*;

public class Atividade_05 {

	public static void main(String[] args) {

		try(Scanner s = new Scanner(System.in)){
			System.out.println("Digite sua idade: ");
			int idade = s.nextInt();
			s.nextLine();
			
			if(idade<18) {
				throw new Exception ("Você tem idade menor que 18!!");
			}
			System.out.println("Idade permitida!!, sua idade é: " + idade + " anos");
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
