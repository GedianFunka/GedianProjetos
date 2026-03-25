package Exercicio_polimorfismo;

public class Elefante extends Animal{
	
	private double comprimento;

	public Elefante(String nome, int idade, double peso, double comprimento) {
		super(nome, idade, peso);
		this.comprimento = comprimento;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	@Override 
	public void emitirSom() {
		System.out.println("PRRRUUUUU");
	}
	
	@Override 
	public String gettipoALimento() {
		return "Herbívoro - folhas e frutas";
	}
	
	@Override 
	public void exibirInfo() {
		System.out.println("\n---Elefante---");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso: " + getPeso() + "KG");
		System.out.println("O tipo do alimento do animal é: " + gettipoAlimento());
		System.out.println("O comprimento dele é: " + getComprimento() + " metros!!!");
	}

}
