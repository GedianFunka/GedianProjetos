package Exececoes;

import java.util.*;

public class Exemplo3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro número: ");
			int n1 = s.nextInt();
			s.nextLine();
			
			System.out.println("Digite o segundo número: ");
			int n2 = s.nextInt();
			s.nextLine();
			
			int soma = n1 + n2;
			
			System.out.println("A soma é: " + soma);
		
		}catch(Exception e) {
			System.out.println("Erro! Digite apenas números Inteiros.");
		
		}
		
		System.out.println("Programa finalizado");
		
		s.close();
	}

}
