package Exercicios_Excecoes;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		try {
			System.out.println("Digite um número para ser dividido com 100");
			int n1 = s.nextInt();
			s.nextLine();
			
			double divisao = 100/n1;
			System.out.println("O resultado da divisão é: " + divisao);
			
		}catch(Exception e){
			System.out.println("Detalhes do erro: ");
			e.getStackTrace();
		}finally {
			System.out.println("Programa finalizado!!");
		}
		s.close();
	}

}
