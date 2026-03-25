package Exercicio_polimorfismo;

public class Leao extends Animal{

	public Leao(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}
	
	@Override 
	public void emitirSom() {
		System.out.println("ROARRRR!!!!");
	}
	
	@Override
	public String gettipoALimento() {
		return "Carnívoro - Carne";
	}
	
	public void rugir() {
		System.out.println("O leão está rugindo!!");
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("\n---LEÃO---");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso: " + getPeso() + "KG");
		System.out.println("Tipo do alimento é: " + gettipoALimento());
		
	}
	
}
