package Heranca_Exemplo;

import java.util.*;

public class MainVeiculo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("==Cadastro de carro==");
		System.out.println("Marca: ");
		String marca = s.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = s.nextLine();
		
		System.out.println("Ano: ");
		int ano = s.nextInt();
		s.nextLine();

		
		System.out.println("Quantidade de portas: ");
		int portas = s.nextInt();
		s.nextLine(); // buffer
		
		//Transformando classe como objeto
		Carro car = new Carro(marca, modelo, ano, portas);
		
		//--------------------------------------------------------
		
		System.out.println("==Cadastro de moto==");
		System.out.println("Marca: ");
		marca = s.nextLine();
		
		System.out.println("Modelo: ");
		modelo = s.nextLine();
		
		System.out.println("Ano: ");
		ano = s.nextInt();
		
		System.out.println("Cilindradas:  ");
		int cilindradas = s.nextInt();
		
		Moto crf = new Moto(marca, modelo, ano, cilindradas);
		
		System.out.println("\n");
		car.ExibirDados();
		System.out.println("\n");
		crf.ExibirDados();
		
		s.close();
	}

}
