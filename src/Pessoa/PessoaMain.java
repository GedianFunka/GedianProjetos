package Pessoa;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {

	/*Pessoa p1 = new Pessoa("Natalino", 39, "753.746.413-72");

	System.out.println(p1.getNome() + "\n" + p1.getCpf() + "\n" +  p1.getIdade());
	
	p1.setIdade(99);
	
	System.out.println(p1.getIdade());
	*/
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = s.nextLine();
	
	System.out.println("Digite sua idade: ");
	int idade = s.nextInt();
	
	s.nextLine();
	
	System.out.println("Digite seu cpf: ");
	String cpf = s.nextLine();
	
	
	Pessoa p1 = new Pessoa(nome, idade, cpf);
	
	System.out.println(p1.getNome());
	
	s.close();	
		
	}

}
