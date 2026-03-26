package toStringTeste;

public class toStringTest {
		
	private String nome;
	private int idade;
	
	public toStringTest(String nome, int idade) {
		super();
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
	
	//Método toString, sobreescreve um object do java
	
	public String toString() {
		return "Nome: " + nome + "Idade: " + idade;
	}
		
}
