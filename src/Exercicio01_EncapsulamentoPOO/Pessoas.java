package Exercicio01_EncapsulamentoPOO;

public class Pessoas {

	private String nome;
	private int idade;
	
	public Pessoas (String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
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
	
	void Apresentar() {
		System.out.println("Olá, meu nome é " + nome +  " e tenho " + idade + " anos.");
		
	}
}
