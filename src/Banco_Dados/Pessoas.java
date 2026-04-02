package Banco_Dados;

public class Pessoas {

	private int id;
	private String nome;
	private int idade;
	
	//Construtor sem id(Será criado pelo banco)
	public Pessoas(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//Construtor para leitura (id já existe)
	public Pessoas(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	//Método toString
	@Override
	public String toString() {
		return "Pessoas [id: " + id + ", nome: " + nome + ", idade: " + idade + "]";
	}
	
	
	
}
