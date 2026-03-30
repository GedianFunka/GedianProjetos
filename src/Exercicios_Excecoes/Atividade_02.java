package Exercicios_Excecoes;

import java.util.*;

public class Atividade_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número: ");
			int n1 = s.nextInt();
			System.out.println("O número digitado é: " + n1);
			
			
		}catch(Exception e) {
			System.out.println("Erro número inválido: " + e.getMessage());
			
		}
		
		s.close();
		
	}

}
