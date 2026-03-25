package Exercicio_polimorfismo;

public class Papagaio extends Animal{

	private String corPenas;

	public Papagaio(String nome, int idade, double peso, String corPenas) {
		super(nome, idade, peso);
		this.corPenas = corPenas;
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Olá quero biscoito!!");
	}
	
	@Override
	public String gettipoALimento() {
		return "Onívoro - Sementes e frutas";
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("\n---Papagaio---");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso: " + getPeso() + "KG");
		System.out.println("A cor das penas do papagaio e: " + corPenas);
		System.out.println("O tipo de alimento que o animal come é: " + gettipoAlimento());
	}
	
}
