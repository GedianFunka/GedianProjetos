package Exercicios_Excecoes;

import java.util.*;

public class Atividade_04 {

	public static void main(String[] args) {
		
		try(Scanner s = new Scanner(System.in)){
		    System.out.println("Digite um número inteiro: ");
		    int n1 = s.nextInt();
		    s.nextLine();
		    
		    if(n1 <= 0) {
		        throw new Exception("Número menor ou igual a 0!!");
		    }
		    
		    System.out.println("O número digitado é maior que 0!!");
		    
		} catch(Exception e) {
		    System.out.println("Erro: " + e.getMessage());
		    e.printStackTrace();
		}
	}

}
