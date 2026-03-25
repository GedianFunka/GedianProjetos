package Exercicio_polimorfismo;

public class Animal {

	private String nome;
	private int idade;
	private double peso;
	
	public Animal(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void emitirSom() {
		System.out.println("Seu animal está emitindo o som: ");
	}
	
	public String gettipoALimento() {
		return " ";
	}
	
	public void exibirInfo() {
		System.out.println("---Informações do animal---");
		System.out.println("O nome do animal é: " + nome);
		System.out.println("A idade do animal é: " + idade);
		System.out.println("O peso do animal é: " + peso);
	}

	public String gettipoAlimento() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
