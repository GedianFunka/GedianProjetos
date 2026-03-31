package Exercicios_Excecoes;

import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {

		try(Scanner s = new Scanner(System.in)){
			System.out.println("Digite sua senha; ");
			String senha = s.nextLine();
			
			if(senha.length() < 6) {
				throw new Exception ("Senha tem menos de 6 caracteres!!!!");
			}
			
			System.out.println("Senha válida!!, " + senha);
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
				
		
	}

}
